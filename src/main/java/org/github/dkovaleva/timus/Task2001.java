package org.github.dkovaleva.timus;

import java.util.Scanner;

public class Task2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();
        System.out.println((a1 - a3) + " " + (b1 - b2));
    }
}
