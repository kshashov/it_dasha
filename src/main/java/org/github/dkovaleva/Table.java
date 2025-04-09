package org.github.dkovaleva;

public class Table {
    public static void main(String[] args) {
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= 10; j++)
//                System.out.println(i + " * " + j + " = " + (i * j));
//        }
        String result = "";

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                result = result + j * i + " ";
//                System.out.print(j * i + " ");
            }
            System.out.println(result);
            result = "";
        }


    }


}
