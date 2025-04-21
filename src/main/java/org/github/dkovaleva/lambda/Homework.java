package org.github.dkovaleva.lambda;

//Написать лямбду для проверки пуста ли входная строка.
//Решить двумя способами - со своим функциональным интерфейсом и со стандартным


import java.util.function.Predicate;

public class Homework {
    public static void main(String[] args) {
        String test = "gbg";
        String test2 = "";

        StringTester lines = new StringTester() {
            @Override
            public boolean isEmpty(String s) {
                return s.equals("");
            }
        };
        System.out.println(lines.isEmpty(test2));


        StringTester l = (s) -> {
            return s.equals("");
        };
        System.out.println(l.isEmpty(test));


//        Consumer<String> r = (t) -> {
//            System.out.println(t.equals(""));
//        };
//        r.accept(test);


        Predicate<String> isEmpty = (t) -> {
            return t.equals("");
        };
        System.out.println(isEmpty.test(test2));

    }


    @FunctionalInterface
    interface StringTester {
        boolean isEmpty(String s);
    }


}
