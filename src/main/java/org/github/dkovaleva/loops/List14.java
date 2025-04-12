package org.github.dkovaleva.loops;

public class List14 {
    public static void main(String[] args) {
        String result = "";

        for (int i = 1; i <= 5; i++) {
            result = "";
            for (int k = i; k < 5; k++) {
                result = result + " ";
            }
            for (int j = 1; j <= i; j++) {
                result = result + " " + i;
            }

            System.out.println(result);

        }


    }
}
