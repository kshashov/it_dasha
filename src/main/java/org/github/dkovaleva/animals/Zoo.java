package org.github.dkovaleva.animals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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


//        System.out.println(chaya.toString());

//        Method[] methods = chaya.getClass().getMethods();
//        for (int i = 0; i < methods.length; i++) {
//            System.out.println(methods[i].getName());
//        }

        System.out.println(chaya instanceof Object);
        System.out.println(chaya instanceof Animal);
        System.out.println(chaya instanceof Cat);

        Object bob = new Cat("Боб", "черный (нигга)");
        bob = new Fish(15);
        bob = chaya;

        Animal chika = new Cat("Пипа", "белый");
        Cat chikaCat = (Cat) chika;
        chaya = (Cat) chika; // чая и чика это один объект. объект один а ссылки две
        ((Cat) chika).jump();
        chikaCat.jump();
//        System.out.println(bob);
//        System.out.println(chaya instanceof Fish);

        Animal b = new Fish(5);
//        ((Cat) b).jump();

        hello(chaya);
        hello(a);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(chaya);
        animals.add(new Cat("Бобик", "черный"));
        animals.add(a);

        for (Animal animal : animals) {
            System.out.println(animal.introduce2());
        }

        List<Cat> cats = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                cats.add((Cat) animal);
            }
        }

        HashSet<Animal> uniqueAnimals = new HashSet<>();
        uniqueAnimals.add(chaya);
        uniqueAnimals.add(chikaCat);
        uniqueAnimals.add(chika);
        uniqueAnimals.add(new Cat("Бобик", "черный"));
        uniqueAnimals.add(a);


        ArrayList<Cat> df = new ArrayList<>();
        df.add((Cat) chika);
    }

    public static void hello(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println("привет котик " + cat.getName());
        } else if (animal instanceof Fish) {
            System.out.println("привет рыбка");
        }
//        System.out.println("HELLO, " + animal.getClass().getSimpleName());

    }
}
