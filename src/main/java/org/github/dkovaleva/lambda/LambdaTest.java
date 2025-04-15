package org.github.dkovaleva.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest {
    public static void main(String[] args) {

        int j = hui2(7, 3, (f, q) -> {
            return f + q;
        });
        System.out.println(j);

        Runnable r = () -> {
            System.out.println("runnable");
        };
        r.run();

        Function<Object, String> f = (o) -> {
            return o.toString();
        };
        System.out.println(f.apply(r));

        // TODO BiFuction !!

        Consumer<Long> c = (l) -> {
            System.out.println(l + 5);
        };
        c.accept(4L);

//        BiConsumer<String, String> bc = (s1, s2) -> {
//            System.out.println(s1+s2);
//        };
//        bc.accept("hui", "pizda");

    }

    public static int hui(int u, int j, Action action) {
        return action.process(u, j);
    }


    public static int hui2(int u, int j, BiFunction<Integer, Integer, Integer> action) {
        return action.apply(u, j);
    }

    @FunctionalInterface
    interface Action {
        int process(int a, int b);
    }
}
