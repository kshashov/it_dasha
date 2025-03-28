package org.github.dkovaleva;

import java.util.List;

public class RecursionTest {

    public static void main(String[] args) {
//        System.out.println(sumRec(150000));
        List<Integer> list = List.of(4, 6, 7, 9, 12, 34, 67, 89, 97);
        System.out.println(binarySearch(list, 5));


    }

    private static int sum(int i) {
        int result = 0;
        for (int k = 0; k <= i; k++) {
            result = result + k;
        }
        return result;
    }

    private static int sumRec(int i) {
        if (i == 0) return 0;

        return i + sumRec(i - 1);
    }

    public static boolean binarySearch(List<Integer> list, int num) {
        return binarySearchInternal(list, num, 0, list.size() - 1);
    }

    private static boolean binarySearchInternal(List<Integer> list, int num, int start, int end) {
        System.out.println(start + " " + end);
        if (end - start < 2) {
            if (list.get(start) == num) {
                return true;
            } else {
                return list.get(end) == num;
            }
        }
        int middle = (start + end) / 2;

        if (num < list.get(middle)) {
            return binarySearchInternal(list, num, start, middle);
        } else {
            return binarySearchInternal(list, num, middle, end);
        }
    }
}
