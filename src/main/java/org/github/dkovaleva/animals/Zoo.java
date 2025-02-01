package org.github.dkovaleva.animals;

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

        Animal chika = new Cat("", "");
        Cat chikaCat = (Cat) chika;
        chaya = (Cat) chika; // чая и чика это один объект. объект один а ссылки две
        ((Cat) chika).jump();
        chikaCat.jump();
//        System.out.println(bob);
//        System.out.println(chaya instanceof Fish);

        Animal b = new Fish(5);
        ((Cat) b).jump();

    }
}
