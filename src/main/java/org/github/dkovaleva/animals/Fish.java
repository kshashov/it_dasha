package org.github.dkovaleva.animals;

public class Fish implements Jumpable, Wild, Animal {
    public int length;

    public Fish(int length) {
        this.length = length;
    }

    @Override
    public void introduce() {
        System.out.println("Машу хвостом");
    }

    @Override
    public Body getBody() {
        return Body.CHESHUYA;
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
