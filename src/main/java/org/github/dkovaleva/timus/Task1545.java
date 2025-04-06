package org.github.dkovaleva.timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1545 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<String> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String a = scan.nextLine();
            s.add(a);
        }

        String x = scan.nextLine();
        for (int i = 0; i < n; i++) {
            String first = s.get(i).substring(0, 1); // TODO запомнить
            if (first.equals(x)) {
//            if (s.get(i).charAt(0) == x.charAt(0)) {
                System.out.println(s.get(i));
            }
        }


    }
}

