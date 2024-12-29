package org.github.dkovaleva;

import java.util.Date;

public class Lesson5 {
    public static void main(String[] args) {
        Furniture.material = "wood";

        Furniture table = new Furniture();
        table.title = "Стол";
        table.height = 10;
        table.length = 7;
        table.width = 5;
        table.hueta();

        System.out.println(table.name() + " " + table.material);

        Furniture chair = new Furniture();
        chair.material = "plastic";
        chair.title = "Стул";
        chair.height = 15;
        chair.length = 6;
        chair.width = 9;

        Furniture[] list = {table, chair};
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].name() + " " + list[i].material);
        }



//        System.out.println(table.height);
    }
}
