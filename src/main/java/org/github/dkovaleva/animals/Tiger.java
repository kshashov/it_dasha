package org.github.dkovaleva.animals;

public class Tiger implements Animal, Wild, HasName, Jumpable, HasColor {
    private String name;
    private String color;

    @Override
    public void introduce() {
        System.out.println("Машет полосатым хвостом");
    }

    @Override
    public void move() {
        System.out.println("Двигается на добычу");
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
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void jump() {
        System.out.println("Прыгает на добычу");
    }
}
