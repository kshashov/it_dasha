package org.github.dkovaleva.calendar;

public class Task {
    private String title;
    private TaskTime time;

    public Task() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskTime getTime() {
        return time;
    }

    public void setTime(TaskTime time) {
        this.time = time;
    }
}
