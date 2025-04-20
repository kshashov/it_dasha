package org.github.dkovaleva.lambda;

//Написать лямбду для проверки пуста ли входная строка.
//Решить двумя способами - со своим функциональным интерфейсом и со стандартным


import java.util.function.Consumer;

public class Homework {
    public static void main(String[] args) {
        String test = "gbg";
        String test2 = "";

        Line lines = new Line() {
            @Override
            public boolean row(String s) {
                return s.equals("");
            }
        };
        System.out.println(lines.row(test2));


        Line l = (s) -> {
            return s.equals("");
        };
        System.out.println(l.row(test));


        Consumer<String> r = (t) -> {
            System.out.println(t.equals(""));
        };
        r.accept(test);


    }


    @FunctionalInterface
    interface Line {
        boolean row(String s);
    }


}
