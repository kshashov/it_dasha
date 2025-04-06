package org.github.dkovaleva.timus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Task1545_v2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

//        HashMap<String, List<String>> h = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            String a = scan.nextLine();
//
//            String key = String.valueOf(a.charAt(0));
//            if (!h.containsKey(key)) {
//                List<String> value = new ArrayList<>();
//                h.put(key, value);
//                value.add(a);
//            } else {
//                List<String> v = h.get(key);
//                v.add(a);
//            }
//        }

        // WITH substring
//        HashMap<String, List<String>> h = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            String a = scan.nextLine();
//
//            String key = a.substring(0, 1);
//            if (!h.containsKey(key)) {
//                List<String> value = new ArrayList<>();
//                h.put(key, value);
//                value.add(a);
//            } else {
//                List<String> v = h.get(key);
//                v.add(a);
//            }
//        }

        // SIMPLIFY
        HashMap<String, List<String>> h = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String a = scan.nextLine();

            String key = a.substring(0, 1);
            if (!h.containsKey(key)) {
                h.put(key, new ArrayList<>());
            }

            List<String> v = h.get(key);
            v.add(a);
        }

        // WITH CHAR
//        HashMap<Character, List<String>> h = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            String a = scan.nextLine();
//
//            char key = a.charAt(0);
//            if (!h.containsKey(key)) {
//                List<String> value = new ArrayList<>();
//                h.put(key, value);
//                value.add(a);
//            } else {
//                List<String> v = h.get(key);
//                v.add(a);
//            }
//        }
//
//        String symbol = scan.nextLine();
//        if (h.containsKey(symbol.charAt(0))) {
//            List<String> list = h.get(symbol.charAt(0));
//            for (String s : list) {
//                System.out.println(s);
//            }
//        }
        ////


        String symbol = scan.nextLine();
        if (h.containsKey(symbol)) {
            List<String> list = h.get(symbol);
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}


