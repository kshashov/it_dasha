package org.github.dkovaleva.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Cat cat1 = new Cat("барсик", "серый");
        Cat cat2 = new Cat("лея", "белая");
        Sphinx cat3 = new Sphinx("сфинкс", "черный");
        Sphinx cat4 = new Sphinx("сфинкс", "белый");
        Fish fish1 = new Fish(14);

        Tiger tiger1 = new Tiger();
        tiger1.setName("Тигер");
        tiger1.setColor("золотой");

        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
//        animals.add(cat4);
        animals.add(fish1);
        animals.add(tiger1);

        List<String> names = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof HasName) {
                names.add(((HasName) animal).getName());
            }
        }
//у кого есть имя
//        for (Animal allAnimal : animals) {
//            String result = allAnimal.getClass().getSimpleName();
//            if (allAnimal instanceof HasName) {
//                result = result + " " + ((HasName) allAnimal).getName();
//            }
//            System.out.println(result);
//        }
//поиск по имени
//        List<Object> objects = new ArrayList<>();
//        for (Animal animal : animals) {
//            objects.add(animal);
//        }
//        objects.add(1);
//        objects.add("string");
//        Object result = findByName2(objects, "лея1");
//        if (result != null) {
//            System.out.println(((HasName) result).getName());
//        } else {
//            System.out.println("Не нашли");
//        }

        Zoo zoo = new Zoo();
        animals.forEach(a1 -> zoo.addAnimal(a1));
        zoo.addAnimal(cat4);

//        System.out.println(zoo.getAnimalNames());
//        for (Map.Entry<String, List<Animal>> entry : zoo.getAnimalNames().entrySet()) {
//            System.out.println(entry);
//        }

//        System.out.println(zoo.findAnimalByName("сфинкс"));

//        System.out.println(zoo.getAnimalNames().keySet());

        zoo.killAnimal(cat2);
        for (Map.Entry<String, List<Animal>> entry : zoo.getAnimalNames().entrySet()) {
            System.out.println(entry);
        }
    }

//    public static HasName findByName(List<Object> objects, String name) {
//        for (Object obj : objects) {
//            if (obj instanceof HasName) {
//                String objName = ((HasName) obj).getName();
//                if (objName.equals(name)) {
//                    return (HasName) obj;
//                }
//            }
//        }
//        return null;
//    }
//
//    public static HasName findByName2(List<Object> objects, String name) {
//        Map<String, HasName> map = new HashMap<>();
//
//        for (Object obj : objects) {
//            if (obj instanceof HasName) {
//                String objName = ((HasName) obj).getName();
//                map.put(objName, (HasName) obj);
//            }
//        }
//
//        return map.get(name);
//
//    }

}
