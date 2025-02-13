package org.github.dkovaleva.animals;

public class Cat implements Animal, Jumpable, Home, HasName {
    private String name;
    private String color;
    private Body body = Body.WOOL;

    public Cat(String name, String color) {
        this.color = color;
//        setColor(color);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void introduce() {
        System.out.println("Махаю котятьей лапкой цвета " + color);
//        System.out.println(super.introduce()+"");
    }

    @Override
    public String introduce2() {
        return Animal.super.introduce2() + " котятьей лапкой цвета " + color;
    }

    @Override
    public Body getBody() {
        return body;
    }

    @Override
    public void move() {
        System.out.println("бегаю");
    }

    @Override
    public void jump() {
        System.out.println("Прыг");
    }


    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
