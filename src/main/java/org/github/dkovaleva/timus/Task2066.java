package org.github.dkovaleva.timus;

import java.util.Scanner;

public class Task2066 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());
        int c = Integer.parseInt(in.nextLine());
        int result = 0;
        if (b > 1) {
            result = a - b * c;
        } else {
            result = a - b - c;
        }
        System.out.println(result);

    }
}