package org.github.dkovaleva.timus;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1563 {

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int n = Integer.parseInt(in.nextLine());
//        Map<String, Integer> map = new HashMap<>();
//        int bayan = 0;
//        for (int i = 0; i < n; i++) {
//            String title = in.nextLine();
//            if (map.containsKey(title)) {
//                bayan = bayan + 1;
//            } else {
//                map.put(title, 1);
//            }
//        }
//        System.out.println(bayan);
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        Set<String> map = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String title = in.nextLine();
//            if (!map.containsKey(title))  {
            map.add(title);
//            }
        }
        System.out.println(n - map.size());
    }
}