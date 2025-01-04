package org.github.dkovaleva;

public class Lesson7 {
    public static void main(String[] args) {
//        int[] num = {1, 2, 3, 4, 5};
//
//
//        int[] copy = num.clone();
////        int[] copy = num;
//        num[1] = 1;
//
//        for (int i = 0; i < copy.length; i++) {
//            System.out.println(copy[i]);
//        }

        SuperList numbers = new SuperList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(6);
        numbers.add(213);

        numbers.set(2, 0);
        numbers.set(20, 0);

        for (int i = 0; i < numbers.size() + 1; i++) {
            System.out.println(numbers.get(i));
        }



    }
}
