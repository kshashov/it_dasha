package org.github.dkovaleva.yandexMusic;

public class Song {
    private String name;
    private double time;


    public void setName(String newNameSong) {
        this.name = newNameSong;
    }

    public String getName() {
        return name;
    }

    public void setTime(double newTime) {
        this.time = newTime;
    }

    public double getTime() {
        return time;
    }

    public Song() {
        System.out.println("Задайте имя и длину песни");
    }

    public Song(String newNameSong, double newTime) {
        name = newNameSong;
        time = newTime;
    }
}
