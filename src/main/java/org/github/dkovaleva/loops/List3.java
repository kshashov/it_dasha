package org.github.dkovaleva.loops;

public class List3 {
    public static void main(String[] args) {

        String result = "";
        for (int i = 1; i <= 5; i++) {
            result = "";
            for (int j = 1; j <= i; j++) {
                result = i + result;
//                System.out.print(i);
            }
            System.out.println(result);
        }

    }
}
