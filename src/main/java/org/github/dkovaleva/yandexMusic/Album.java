package org.github.dkovaleva.yandexMusic;

import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs = new ArrayList<>();
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
    }
}
