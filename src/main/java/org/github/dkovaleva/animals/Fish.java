package org.github.dkovaleva.animals;

public class Fish extends Animal {
    public int length;

    public Fish(int length) {
        this.length = length;
    }

    @Override
    public void move() {
        System.out.println("Плаваю");
    }
}
