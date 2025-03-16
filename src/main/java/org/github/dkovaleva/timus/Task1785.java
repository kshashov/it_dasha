package org.github.dkovaleva.timus;

import java.util.Scanner;

public class Task1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int task = 12 - a;
        int timeMax = 240;
        if (task * 45 < timeMax) {
            System.out.println("YES");
        } else {
            System.out.println("NO");


        }
    }
}
