package org.github.dkovaleva.animals;

public abstract class Animal {
    protected String color;

    public void introduce() {
        System.out.println("Махаю");
    }

    public String introduce2() {
        return "Машу";
    }

    public abstract void move();
}
