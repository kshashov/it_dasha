package org.github.dkovaleva.timus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1585 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> penguins = new HashMap();

        int a = Integer.parseInt(in.nextLine());
        for (int i = 0; i < a; i++) {
            String pngn = in.nextLine();
            if (penguins.containsKey(pngn))
                penguins.put(pngn, penguins.get(pngn) + 1);
            else {
                penguins.put(pngn, 1);
            }
        }

        //System.out.println(penguins);


        int max = 0;
        String maxPenguin = "";
        for (Map.Entry<String, Integer> p : penguins.entrySet()) {

            if (p.getValue() > max) {
                max = p.getValue();
                maxPenguin = p.getKey();
            }
        }
        System.out.println(maxPenguin);
    }
}