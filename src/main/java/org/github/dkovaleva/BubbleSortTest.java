package org.github.dkovaleva;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.addAll(List.of(1, 45, 4, 7, 8, 3, 6, 2, 2));

//        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
//                    count++;
                    int r = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, r);
                }
            }
        }

        System.out.println(list);
//        System.out.println(count);
    }
}
