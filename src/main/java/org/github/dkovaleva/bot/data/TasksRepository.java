package org.github.dkovaleva.bot.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TasksRepository {
    private Map<Long, List<Task>> tasks = new HashMap<>();

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
    }

    public void add(Long userId, Task task) {
        if (!tasks.containsKey(userId)) {
            tasks.put(userId, new ArrayList<>());
        }

        tasks.get(userId).add(task);
    }
}
