package org.github.dkovaleva.lambda;

//Написать лямбду для удаления всех нечетных чисел из списка интов.
//Решить двумя способами - со своим функциональным интерфейсом и со стандартным


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Homework2 {


    public static void main(String[] args) {
        List<Integer> iii = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> integers = new ArrayList<>(iii);

//
//
//
        Deleter deleterNumbers = (numbersList) -> {
            List<Integer> newintegers = new ArrayList<>();
            for (int m : numbersList) {
                if (m % 2 == 0) {
                    newintegers.add(m);
                }
            }
            return newintegers;
        };

        System.out.println(deleterNumbers.deleteOdd(integers));

//
//
//
        Deleter nums = new Deleter() {
            @Override
            public List<Integer> deleteOdd(List<Integer> list) {
                List<Integer> newintegers = new ArrayList<>();
                for (int m : list) {
                    if (m % 2 == 0) {
                        newintegers.add(m);
                    }
                }
                return newintegers;
            }
        };

        System.out.println(nums.deleteOdd(integers));

//
//
//
        Function<List<Integer>, List<Integer>> function = (list) -> {
            List<Integer> newintegers = new ArrayList<>();
            for (int m : list) {
                if (m % 2 == 0) {
                    newintegers.add(m);
                }
            }
            return newintegers;

        };
        System.out.println(function.apply(integers));
    }


}

@FunctionalInterface
interface Deleter {
    List<Integer> deleteOdd(List<Integer> list);

}
