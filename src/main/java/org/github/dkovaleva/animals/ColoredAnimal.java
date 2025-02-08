package org.github.dkovaleva.animals;

public abstract class ColoredAnimal implements Animal {
    protected String color;

    public ColoredAnimal() {
    }

    public ColoredAnimal(String color) {
        this.color = color;
    }

    @Override
    public void introduce() {
        System.out.println("Махаю");
    }

    public abstract void move();
}
