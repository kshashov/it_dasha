package org.github.dkovaleva.animals;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Cat cat1 = new Cat("барсик", "серый");
        Cat cat2 = new Cat("лея", "белая");
        Fish fish1 = new Fish(14);

        Tiger tiger1 = new Tiger();
        tiger1.setName("Тигер");
        tiger1.setColor("золотой");

        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(fish1);
        animals.add(tiger1);

        List<String> names = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof HasName) {
                names.add(((HasName) animal).getName());
            }
        }

        for (Animal allAnimal : animals) {
            String result = allAnimal.getClass().getSimpleName();
            if (allAnimal instanceof HasName) {
                result = result + " " + ((HasName) allAnimal).getName();
            }
            System.out.println(result);
        }
    }
}
