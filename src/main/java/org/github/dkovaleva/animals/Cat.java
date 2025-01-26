package org.github.dkovaleva.animals;

public class Cat extends Animal {
    private String name;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("котятьей лапкой цвета " + color);
//        System.out.println(super.introduce()+"");
    }

    @Override
    public String introduce2() {
        return super.introduce2() + " котятьей лапкой цвета " + color;
    }

    @Override
    public void move() {
        System.out.println("бегаю");
    }
}
