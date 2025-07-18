package org.github.dkovaleva;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 23, 3, 4, -435, 456, 890, 8890, 923, 1560));

//        List<String> newList = nums.stream()
//                .map(i -> i.toString() + "hui")
//                .toList();
//        System.out.println(newList);
//
//        List<List<Integer>> nestedNums = new ArrayList<>(List.of(
//                List.of(4, 7, 8),
//                List.of(8, 0, 4),
//                List.of(65, 8, 1)));
//
//        List<Integer> flat = nestedNums.stream()
//                .flatMap(list -> list.stream().filter(i -> i > 5))
//                .toList();
//
//        System.out.println(flat);
//
//        Optional<String> optional = Optional.ofNullable(null);
////        try {
////            System.out.println(optional.get());
////        } catch (NoSuchElementException ex) {
////            System.out.println("ничего");
////        }
//
////        if (optional.isPresent()) {
////            System.out.println(optional.get());
////        }
//
//        optional.ifPresent(str -> {
//            System.out.println(str);
//        });
//
//        optional.ifPresentOrElse(str -> {
//            System.out.println(str);
//        }, () -> {
//            System.out.println("ничего");
//        });


//        long result = nums.stream()
//                .filter(integer -> integer > 5)
//                .map(integer -> String.valueOf(integer))
//                .peek(s -> System.out.println(s))
//                .count();
//        System.out.println(result);
//
//        nums.stream()
//                .filter(integer -> integer > 5)
//                .map(integer -> String.valueOf(integer))
//                .forEach(integer -> System.out.println(integer));
//
//        nums.forEach(integer -> System.out.println(integer));


        Optional<String> s = nums.stream()
                .filter(integer -> integer > 50)
                .map(integer -> String.valueOf(integer))
                .limit(5)
                .findFirst();

        Integer sum = nums.stream()
                .reduce((integer, integer2) -> {
                    return integer + integer2;
                })
                .get();

        System.out.println(s.get());
        System.out.println(sum);
    }

}
