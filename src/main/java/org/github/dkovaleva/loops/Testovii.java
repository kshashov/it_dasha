package org.github.dkovaleva.loops;

public class Testovii {
    public static void main(String[] args) {
        String result = "";


        for (int i = 1; i <= 5; i++) {
            for (int j = i - 1; j >= 1; j--) {
                result = result + j;
            }
            System.out.println(result);
            result = "";
        }

    }
}
