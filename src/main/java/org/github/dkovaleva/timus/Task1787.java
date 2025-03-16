package org.github.dkovaleva.timus;

import java.util.Scanner;

public class Task1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int left = 0;
        for (int i = 0; i < b; i++) {
            int c = in.nextInt() + left;
            if (c - a > 0) {
                left = c - a;
            } else if (c <= a) {
                left = 0;
            }

        }
        System.out.println(left);
    }
}
