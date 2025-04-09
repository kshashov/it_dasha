package org.github.dkovaleva.lists;

public class List6 {
    public static void main(String[] args) {
        String result = "";

        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
            for (int j = 1; j <= 15; j++) {

//
            }
//            System.out.println(result);
//            result = "";
        }

        int n = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                n = n + 1;
                result = result + " " + n;
            }
            System.out.println(result);
            result = "";
        }
    }
}
