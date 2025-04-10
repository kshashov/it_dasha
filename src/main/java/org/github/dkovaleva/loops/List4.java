package org.github.dkovaleva.loops;

public class List4 {
    public static void main(String[] args) {

        String result;

        for (int i = 5; i >= 1; i--) {
//            System.out.println(i);
            result = "";
            for (int j = i - 1; j >= 1; j--) {
                result = result + " " + j;
            }
            System.out.println(i + result);
        }

        // better version
        for (int i = 5; i >= 1; i--) {
            result = "";
            for (int j = 1; j <= i; j++) {
                result = j + " " + result;
            }
            System.out.println(result);
        }

    }
}
