package org.github.dkovaleva.timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1296 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nums = Integer.parseInt(scan.nextLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums; i++) {
            int next = Integer.parseInt(scan.nextLine());
            list.add(next);
        }
//        System.out.println(list);

//        sum(list, 1, 3);


        int max = 0;

        int n = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                n = sum(list, i, j);
                if (n > max) {
                    max = n;
                }
            }

        }
        System.out.println(max);

    }

    public static int sum(List<Integer> x, int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            result += x.get(i);
        }
        return result;
    }
}
