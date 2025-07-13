package org.github.dkovaleva.bot.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TasksRepository {
    private Map<Long, List<Task>> tasks = new HashMap<>();

    public TasksRepository() {
        List<List<String>> list = CSVService.loadCSV("listTask.csv");
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

        return new ArrayList<>(tasks.get(userId));
    }

    public void remove(Long userId, int index) throws IllegalArgumentException {
        List<Task> taskList = tasks.get(userId);

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
        CSVService.createCSV("listTask.csv", update);
    }

}
