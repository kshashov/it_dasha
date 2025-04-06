package org.github.dkovaleva.timus;

import java.util.Scanner;

public class Task1068 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int result = 0;

        if (start <= 0) {
            for (int i = start; i <= 1; i++) {
                result += i;
            }
            System.out.println(result);
        }

        if (start > 0) {
            for (int i = start; i >= 1; i--) {
                result += i;
            }
            System.out.println(result);
        }
    }
}
