package org.github.dkovaleva.lambda;

//Написать лямбды для поиска максимального числа и подсчета суммы всех чисел в списке интов
//Решить двумя способами - со своим функциональным интерфейсом и со стандартным


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Homework3 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 23, 3, 4, -435, 456, 890, 8890, 923, 1560));

        Maximum maximum = (numbers) -> {
            int max = numbers.get(0);
            for (int i = 1; i < numbers.size(); i++) {
                if (max < numbers.get(i)) {
                    max = numbers.get(i);
                }
            }
            return max;
        };

        System.out.println(maximum.findMaxInteger(nums));

        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Sum sumInt = (list) -> {
            int sum = 0;
            for (Integer number : list) {
                sum = sum + number;
            }
            return sum;
        };

        System.out.println(sumInt.findSumInt(integerList));

//
//
        Function<List<Integer>, Integer> findMax = (list) -> {
            int max = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (max < list.get(i)) {
                    max = list.get(i);
                }

            }
            return max;
        };
        System.out.println(findMax.apply(nums));

        Function<List<Integer>, Integer> findSum = (list) -> {
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum = sum + list.get(i);
            }
            return sum;
        };
        System.out.println(findSum.apply(integerList));


    }


}


@FunctionalInterface
interface Maximum {
    int findMaxInteger(List<Integer> integerList);
}

@FunctionalInterface
interface Sum {
    int findSumInt(List<Integer> integerList);
}

