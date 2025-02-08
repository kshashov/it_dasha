package org.github.dkovaleva.animals;

public class Cat extends ColoredAnimal implements Animal, Jumpable, Home, HasName, HasColor {
    private String name;
    private String color;

    public Cat(String name, String color) {
        super(color);
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
