package org.github.dkovaleva.lambda;

import java.util.List;

public class AnonymousClassesTest {

    enum Operation {
        SUM, MINUS
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(12, 1, 4, 23, 7, 5, 8);

        System.out.println(list);
//        System.out.println("sum " + process(list, new SumOperation()));
//        System.out.println("minus " + process(list, new MinusOperation()));
//
//        System.out.println("minus " + process(list, new BaseOperation() {
//            @Override
//            public long process(long a, long b) {
//                return a + b;
//            }
//        }));
//
//        System.out.println("minus " + process(list, (a, b) -> a + b));
//        System.out.println("minus " + process(list, (a, b) -> {
//            System.out.println(a);
//            return a + b;
//        }));

//        list.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });

//        list.forEach(integer -> System.out.println(integer));
//        list.forEach(integer -> {
//            System.out.println(integer);
//        });

        List<Integer> result = list.stream()
                .map(n -> n + 2)
                .limit(5)
                .skip(1)
                .filter(n -> n % 2 != 0)
                .toList();
        System.out.println(result);

    }

    public static long process(List<Integer> nums, Operation operation) {
        long result = 0;
        for (Integer n : nums) {
            if (operation == Operation.SUM) {
                result = result + n;
            } else if (operation == Operation.MINUS) {
                result = result - n;
            }
        }
        return result;
    }

    public interface BaseOperation {
        long process(long a, long b);
    }

    public static class SumOperation implements BaseOperation {
        @Override
        public long process(long a, long b) {
            return a + b;
        }
    }

    public static class MinusOperation implements BaseOperation {

        @Override
        public long process(long a, long b) {
            return a - b;
        }
    }

    public static long process(List<Integer> nums, BaseOperation operation) {
        long result = 0;
        for (Integer n : nums) {
            result = operation.process(result, n);
        }
        return result;
    }
}
