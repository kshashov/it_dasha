package org.github.dkovaleva.animals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private Map<String, List<Animal>> animalNames = new HashMap<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
        if (animal instanceof HasName) {
            HasName named = (HasName) animal;
//            if (animalNames.containsKey(named.getName())) {
//                List<Animal> list = animalNames.get(named.getName());
//                list.add(animal);
//            } else {
//                List<Animal> list = new ArrayList<>();
//                list.add(animal);
//                animalNames.put(named.getName(), list);
//            }
            if (!animalNames.containsKey(named.getName())) {
                animalNames.put(named.getName(), new ArrayList<>());
            }
            List<Animal> list = animalNames.get(named.getName());
            list.add(animal);
        }
    }

    public List<Animal> findAnimalByName(String name) {
        return animalNames.get(name);
    }

    public Map<String, List<Animal>> getAnimalNames() {
        return animalNames;
    }
}
