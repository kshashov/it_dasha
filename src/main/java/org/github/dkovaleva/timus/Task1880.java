package org.github.dkovaleva.timus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1880 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> nums = new HashMap<>();
        int a = in.nextInt();
        for (int i = 0; i < a; i++) {
            int k = in.nextInt();
            nums.put(k, 1);
        }

        int b = in.nextInt();
        for (int i = 0; i < b; i++) {
            int k = in.nextInt();
            if (nums.containsKey(k)) {
                nums.put(k, nums.get(k) + 1);
            }
        }

        int c = in.nextInt();
        for (int i = 0; i < c; i++) {
            int k = in.nextInt();
            if (nums.containsKey(k)) {
                nums.put(k, nums.get(k) + 1);
            }
        }

        int result = 0;
        for (Integer num : nums.values()) {
            if (num == 3) {
                result++;
            }
        }

        System.out.println(result);
    }
}