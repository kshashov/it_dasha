package org.github.dkovaleva.bot.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListRepository {
    private Map<Long, List<TaskList>> userLists = new HashMap<>();

    public ListRepository() {
        List<List<String>> loaded = CSVService.loadCSV("lists.csv");

        if (loaded == null) {
            return;
        }

        // Считываем файл построчно
        loaded.forEach(row -> {
            Long userId = Long.parseLong(row.get(0));
            String id = row.get(1);
            String name = row.get(2);

            if (!userLists.containsKey(userId)) {
                userLists.put(userId, new ArrayList<>());
            }

            TaskList list = new TaskList();
            list.setId(id);
            list.setTitle(name);
            userLists.get(userId).add(list);
        });
    }

    public void addListTask(Long userid, TaskList taskList) {
        // проверяем наличие юзера в хешмапе
        if (!userLists.containsKey(userid)) {
            List<TaskList> newMegaList = new ArrayList<>();
            userLists.put(userid, newMegaList);
        }

        userLists.get(userid).add(taskList);
        save();
    }

    public List<TaskList> getLists(Long userid) {
        if (!userLists.containsKey(userid)) {
            List<TaskList> newList = new ArrayList<>();
            userLists.put(userid, newList);
        }
        return new ArrayList<TaskList>(userLists.get(userid));
    }

    public void deleteList(Long userId, int num) throws IllegalArgumentException {
        List<TaskList> taskLists = userLists.get(userId);
        if (taskLists == null) {
            throw new IllegalArgumentException("Отсутствуют списки");
        } else if ((num > taskLists.size() - 1) || num < 0) {
            throw new IllegalArgumentException("Неверное значение");
        } else {
            taskLists.remove(num);
            save();
        }
    }

    public void rename(Long userId, int numberList, String newNameList) throws IllegalArgumentException {
        List<TaskList> taskLists = userLists.get(userId);
        if (taskLists == null) {
            throw new IllegalArgumentException("Отсутствуют списки");
        } else if ((numberList > taskLists.size() - 1) || numberList <= 0) {
            throw new ArrayIndexOutOfBoundsException("Неверное значение");
        } else {
            taskLists.get(numberList).setTitle(newNameList);
            save();
        }
    }

    private void save() {
        List<List<String>> data = new ArrayList<>();

        // Проходим по всем пользователям в мапе
        userLists.forEach((key, value) -> {
            // Проходим по всем тасклистам для пользователя
            value.forEach(tasklist -> {
                List<String> row = List.of(key.toString(), tasklist.getId(), tasklist.getTitle());
                data.add(row);
            });
        });

        CSVService.createCSV("lists.csv", data);
    }

}
