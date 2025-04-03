package org.github.dkovaleva.timus;

import java.util.Scanner;

public class Task1068 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int result = 0;
        if (a <= 0) {
            for (int i = a; i <= 1; i++) {
                result += i;
            }
            System.out.println(result);
        }
        if (a > 0) {
            for (int i = a; i >= 1; i--) {
                result += i;
            }
            System.out.println(result);
        }
    }
}
