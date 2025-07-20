package org.github.dkovaleva.bot.data;

import java.util.UUID;

public class Task {
    private UUID Id;
    private UUID listId;
    private String text;

    public Task() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public UUID getListId() {
        return listId;
    }

    public void setListId(UUID listId) {
        this.listId = listId;
    }
}
