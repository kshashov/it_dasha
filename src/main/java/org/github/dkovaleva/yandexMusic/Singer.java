package org.github.dkovaleva.yandexMusic;

import java.util.HashSet;

public class Singer {
    private String name;
    private HashSet<Album> albums = new HashSet<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HashSet<Album> getAlbums() {
        return albums;
    }
}
