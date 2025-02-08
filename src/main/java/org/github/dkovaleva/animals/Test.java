package org.github.dkovaleva.animals;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Cat cat1 = new Cat("барсик", "серый");
        Cat cat2 = new Cat("лея", "белая");
        Fish fish1 = new Fish(14);

        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(fish1);

        List<String> names = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof HasName) {
                names.add(((HasName) animal).getName());
            }
        }
    }
}
