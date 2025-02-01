package org.github.dkovaleva.animals;

import java.lang.reflect.Method;

public class Zoo {
    public static void main(String[] args) {
//        Animal hueta = new Animal();


        Cat chaya = new Cat("Чая", "серый полосатик");
        chaya.introduce();

        System.out.println(chaya.introduce2());
        chaya.move();

        Fish a = new Fish(2);
        a.move();
        a.introduce();
        System.out.println(a.introduce2());


        System.out.println(chaya.toString());

        Method[] methods = chaya.getClass().getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }



    }
}
