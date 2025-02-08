package org.github.dkovaleva.animals;

public class Fish extends ColoredAnimal implements Jumpable, Wild {
    public int length;

    public Fish(int length) {
        this.length = length;
    }

    @Override
    public void move() {
        System.out.println("Плаваю");
    }

    @Override
    public void jump() {
        System.out.println("Прыгаю над водой");
    }
}
