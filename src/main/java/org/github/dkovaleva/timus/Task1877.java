package org.github.dkovaleva.timus;

import java.util.Scanner;

public class Task1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a % 2 != 0 && b % 2 == 0) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
