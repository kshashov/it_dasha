package org.github.dkovaleva;

import java.util.ArrayList;
import java.util.List;

public class SortingTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.addAll(List.of(1, 45, 4, 7, 8, 3, 6, 2, 2));
//        list.addAll(List.of(1, 1 ,1 ,1));
        System.out.println(list);

//        list.sort(Comparator.naturalOrder()); // TODO сортировка запомнить
//        list.sort(Comparator.reverseOrder());

        for (int start = 0; start < list.size() - 1; start++) {
            int max = list.get(start);
            int maxIndex = start;
            for (int j = start + 1; j < list.size(); j++) {
                if (list.get(j) > max) {
                    max = list.get(j);
                    maxIndex = j;
                }
            }
            int c = list.get(start);
            list.set(start, max);
            list.set(maxIndex, c);
        }

        System.out.println(list);

    }
}
