package org.github.dkovaleva.animals;

public interface Animal {
    public static int s = 0;

    public void introduce();

    public default String introduce2() {
        return "Машу";
    }

    Body getBody();

    void move();

//    public static void staticMethod() {
//
//    }
}
