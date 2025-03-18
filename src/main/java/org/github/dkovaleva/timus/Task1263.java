package org.github.dkovaleva.timus;

import java.util.Scanner;

public class Task1263 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < m; i++) {
            int k = in.nextInt();
            arr[k - 1] = arr[k - 1] + 1;
        }
        for (int i = 0; i < n; i++) {
            double percent = (arr[i] * 100.0) / m;
            System.out.println(String.format("%.2f", percent) + "%");
        }

//        System.out.println(a + b);
    }
}