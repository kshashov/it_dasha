package org.github.dkovaleva.sub;

import org.github.dkovaleva.Person;

public class GenshinCopy {
    public static void main(String[] args) {
        Person nahida = new Person();
        nahida.setName("Нахида");
        nahida.isMale = false;
        nahida.weapon = "Книга";
        nahida.rarity = 5;


        Person kuki = new Person();
//        kuki.name = "Куки";
        kuki.isMale = false;
        kuki.weapon = "Меч";
        kuki.rarity = 4;


        Person hydroDed = new Person("Нёвилет", "Книга");
        hydroDed.isMale = true;
//        hydroDed.rarity = 5;

        nahida.rename("хуида");

        System.out.println(nahida.introduce());
        System.out.println(kuki.introduce());
        System.out.println(hydroDed.introduce());

    }
}