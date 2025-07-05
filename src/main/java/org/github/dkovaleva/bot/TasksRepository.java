package org.github.dkovaleva.bot;

import java.util.ArrayList;
import java.util.List;

public class TasksRepository {
    private List<Task> taskList = new ArrayList<>();

    public List<Task> getAll() {
        return new ArrayList<>(taskList);
    }

    public void remove(int index) throws IllegalArgumentException {
        if (index < 0 || index > taskList.size()) {
            throw new IllegalArgumentException("Неверное значение");
        }

        taskList.remove(index);
    }

    public void add(Task task) {
        taskList.add(task);
    }
}
