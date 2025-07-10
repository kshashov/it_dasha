package org.github.dkovaleva.bot.data;

import java.util.UUID;

public class TaskList {
    private String title;
    private String id = UUID.randomUUID().toString();
//    private List<Task> tasks = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //    public List<Task> getTasks() {
//        return tasks;
//    }

//    public void setTasks(List<Task> tasks) {
//        this.tasks = tasks;
//    }
}
