package org.github.dkovaleva;

public class Genshin {
    public static void main(String[] args) {
        Person nahida = new Person();
        nahida.name = "Нахида";
        nahida.isMale = false;
        nahida.weapon = "Книга";
        nahida.rarity = 5;


        Person kuki = new Person();
        kuki.name = "Куки";
        kuki.isMale = false;
        kuki.weapon = "Меч";
        kuki.rarity = 4;


        Person hydroDed = new Person();
        hydroDed.name = "Нёвилет";
        hydroDed.isMale = true;
        hydroDed.weapon = "Книга";
        hydroDed.rarity = 5;



        System.out.println(nahida.introduce());
        System.out.println(kuki.introduce());
        System.out.println(hydroDed.introduce());

    }
}