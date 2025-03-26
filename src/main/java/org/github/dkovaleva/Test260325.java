package org.github.dkovaleva;


import java.util.HashMap;
import java.util.HashSet;

public class Test260325 {

    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();

        integers.add(5);
        integers.add(1);
        integers.add(3);
        integers.add(4);
        integers.add(2);

        System.out.println(integers);

        for (int idk : integers) {
            if (idk > 3) {
                System.out.println(idk);
            }
        }

        integers.remove(4);
        System.out.println(integers);

        System.out.println(integers.size());
        System.out.println(integers.contains(1));
        System.out.println(integers.contains(10));

        HashMap<String, Integer> animals = new HashMap<>();
        animals.put("Лёша", 2);
        animals.put("Сережа", 5);
        animals.put("Олег", 1);
        animals.put("Саша", 1);

        System.out.println(animals);

        animals.remove("Сережа");
        System.out.println(animals);

        animals.put("Олег", 50);
        System.out.println(animals);

        for (String people : animals.keySet()) {
            System.out.println(people);
        }


        for (Integer ppl : animals.values()) {
            System.out.println(ppl);
        }

        System.out.println(animals.containsKey("Олег"));
        System.out.println(animals.containsKey(""));

        System.out.println(animals.size());
        System.out.println(animals.isEmpty());
        System.out.println(animals.get("Олег"));
        System.out.println(animals.entrySet());

    }
}