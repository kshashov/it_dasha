package org.github.dkovaleva.bot.data;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TasksRepository {
    private final ListRepository listRepository;
    private Map<Long, List<Task>> tasks = new HashMap<>();

    public TasksRepository(ListRepository listRepository) {
        this.listRepository = listRepository;

        List<List<String>> list = CSVService.loadCSV("tasks.csv");
        if (list == null) {
            return;
        }

        for (List<String> row : list) {
            Long userID = Long.parseLong(row.get(0));
            String textTask = row.get(1);

            if (!tasks.containsKey(userID)) {
                tasks.put(userID, new ArrayList<>());
            }

            Task t = new Task(textTask);
            tasks.get(userID).add(t);

        }
    }


    public List<Task> getAll(Long userId) {
        if (!tasks.containsKey(userId)) {
            tasks.put(userId, new ArrayList<>());
        }

        List<Task> activeTasks = getActiveTasks(userId);

        return activeTasks;
    }

    @NotNull
    private List<Task> getActiveTasks(Long userId) {
        String listId = listRepository.getSelectedListId(userId);
        List<Task> activeTasks = tasks.get(userId).stream()
                .filter(task -> task.getListId().equals(listId))
                .toList();
        return activeTasks;
    }

    public void remove(Long userId, int index) throws IllegalArgumentException {
        List<Task> taskList = getActiveTasks(userId);

        if (taskList == null) {
            throw new IllegalArgumentException("Пусто");
        }

        if (index < 0 || index > taskList.size() - 1) {
            throw new IllegalArgumentException("Неверное значение");
        }

        taskList.remove(index);
        save();
    }

    public void add(Long userId, Task task) {
        if (!tasks.containsKey(userId)) {
            tasks.put(userId, new ArrayList<>());
        }

        task.setListId(listRepository.getSelectedListId(userId));
        tasks.get(userId).add(task);
        save();
    }

    private void save() {
        List<List<String>> update = new ArrayList<>();

        // для каждого пользователя
        for (Long userID : tasks.keySet()) {
            // теперь вызываем все задачи по пользователю
            for (Task k : tasks.get(userID)) {
                List<String> strings = List.of(userID.toString(), k.getText());
                update.add(strings);
            }
        }
        CSVService.createCSV("tasks.csv", update);
    }

}
