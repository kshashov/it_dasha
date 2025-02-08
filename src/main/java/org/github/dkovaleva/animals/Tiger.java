package org.github.dkovaleva.animals;

public class Tiger implements Animal, Wild, HasName {
    private String name;

    @Override
    public void introduce() {
        System.out.println("Машет полосатым хвостом");
    }

    @Override
    public void move() {
        System.out.println("Прыгает на добычу");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
