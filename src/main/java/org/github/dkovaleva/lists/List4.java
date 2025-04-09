package org.github.dkovaleva.lists;

public class List4 {
    public static void main(String[] args) {

        String result = "";

        for (int i = 5; i >= 1; i--) {
//            System.out.println(i);
            for (int j = i - 1; j >= 1; j--) {
                result = result + " " + j;
            }
            System.out.println(i + result);
            result = "";
        }

    }
}
