package org.github.dkovaleva.bot.data;

public class Task {
    private String text;

    public Task(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
