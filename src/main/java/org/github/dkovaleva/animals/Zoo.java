package org.github.dkovaleva.animals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private Map<String, List<Animal>> animalNames = new HashMap<>();
    private Map<String, Animal> lastAnimal = new HashMap<>();


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
        if (animal instanceof Fish) {
            lastAnimal.put("Fish", animal);
        } else if (animal instanceof Sphinx) {
            lastAnimal.put("Sphinx", animal);
        } else if (animal instanceof Tiger) {
            lastAnimal.put("Tiger", animal);
        } else if (animal instanceof Cat) {
            lastAnimal.put("Cat", animal);
        }
//lastAnimal.put(animal.getClass().getSimpleName(), animal);

    }

    public List<Animal> findAnimalByName(String name) {
        return animalNames.get(name);
    }

    public Map<String, List<Animal>> getAnimalNames() {
        return animalNames;
    }

    public Animal getLast(String last) {
        return lastAnimal.get(last);
    }

    public void killAnimal(Animal animal) {
//        animals.remove(animal);

        HasName nameanimal = (HasName) animal;
        animalNames.remove(nameanimal.getName(), animal);

//        animalNames.get(animal.getClass().getName()).remove(animal);
//        List<Animal> list = animalNames.get(animal);
//        list.remove(animal.getClass().getSimpleName());
//        animalNames.remove(animal);
//        HasName named = (HasName) animal;
//        animalNames.remove(animalNames.get(named.getName()));
    }


}
