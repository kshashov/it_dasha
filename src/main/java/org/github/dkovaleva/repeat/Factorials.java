package org.github.dkovaleva.repeat;

public class Factorials {
    public static void main(String[] args) {
        System.out.println(factorial2(3));

    }

    public static int factorial(int i) {
        int result = 1;
        for (int j = 1; j <= i; j++) {
            result = result * j;
        }
        return result;
    }

    public static int factorial2(int i) {
        if (i > 1) {
            return i * factorial2(i - 1);
        }
        if (i < 0) {
            return 0;
        }
        return 1;
    }

}
