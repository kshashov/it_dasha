package org.github.dkovaleva.yandexMusic;

import java.util.ArrayList;

public class YandexStore {
    public static void main(String[] args) {
        Song mya = new Song("Муа", 3);
        Song nya = new Song("ня", 2.5);
        System.out.println(nya.getTime());
        System.out.println(nya.getName());
        nya.setName("бля");
        nya.setTime(1);
        System.out.println(nya.getTime());
        System.out.println(nya.getName());
        Song pi = new Song("Пи", 3);
        Song sya = new Song("Ся", 0.14);

        Album pisya = new Album();
        pisya.getSongs();
        ArrayList<Song> human = pisya.getSongs(); //полученные песни из альбома pisya засунули в альбом human
//        чтобы положить в список что-то, нужно вызвать этот список через getSongs

        human.add(pi);
        human.add(mya);

        pisya.addSong(pi);
        pisya.getSongs().add(sya);

        for (Song ss : pisya.getSongs()) {
            System.out.println(ss.getName());
        }


//        for (Song ab : pisya) {
//            System.out.println(ab.getTime());
//        }


    }

}
