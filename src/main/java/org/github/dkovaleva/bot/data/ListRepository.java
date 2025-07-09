package org.github.dkovaleva.bot.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListRepository {
    private Map<Long, List<TaskList>> userLists = new HashMap<>();

    public void addListTask(Long userid, TaskList taskList) {
        // проверяем наличие юзера в хешмапе
        if (!userLists.containsKey(userid)) {
            List<TaskList> newMegaList = new ArrayList<>();
            userLists.put(userid, newMegaList);
        }

        userLists.get(userid).add(taskList);
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
        }


    }

}
