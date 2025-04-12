package org.github.dkovaleva.loops;

public class List6 {
    public static void main(String[] args) {
        String result = "";

        int n = 0;
//        for (int i = 1; i <= 5; i++) {
//            result = "";
//            for (int j = 1; j <= i; j++) {
//                n = n + 1;
//                result = result + " " + n;
//            }
//            System.out.println(result);

        for (int i = 1; i <= 5; i++) {
            result = "";
            for (int j = 1; j <= i; j++) {
                n = n + 1;
                result = n + " " + result;

            }
            System.out.println(result);


        }

        // так не делаем
//        n = 2;
//        int br = 2;
//        for (int i = 1; i <= 15; i++) {
//            if (i == n) {
//                System.out.println();
//                n += br;
//                br++;
//            }
//            System.out.print(i + " ");
//        }


    }


}

