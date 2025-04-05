package org.github.dkovaleva.timus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Task1545_v2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        HashMap<String, List<String>> h = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String a = scan.nextLine();

            String key = String.valueOf(a.charAt(0));
            if (!h.containsKey(key)) {
                List<String> value = new ArrayList<>();
                value.add(a);
                h.put(key, value);

            } else {
                List<String> v = h.get(key);
                v.add(a);

            }

        }


        String x = scan.nextLine();
        if (h.containsKey(x)) {
            List<String> vv = h.get(x);
            for (int i = 0; i < vv.size(); i++) {
                System.out.println(vv.get(i));
            }
        }
    }
}


