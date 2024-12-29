package org.github.dkovaleva;

public class Homework4 {
    public static void main(String[] args) {

//        Вывести числа от 5 до 1 двумя способами (for и while)
//        int i = 5;
//        for (; i != 0; i--) {
//            System.out.println(i);
//        }
//        int l = 5;
//        while ( l != 0) {
//            System.out.println(l);
//            l--;
//        }

//        Просуммировать все четные числа от 1 до 20 и вывести на экран
//        int a = 0;
//        int result = 0;
//        for (; a<=20; a++) {
//            result = result + a;
//        }
//        System.out.println(result);

//        for (int i = 1; i < 9; i++){
//            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
//        }


//        Даны три целыйх числа a b c. Вывести на консоль число, расположенное между наименьшим и наибольшим
//        int a = 1, b = 5, c = 7;
//        if ((a > b) && (a > c)) {
//            if (b > c) {
//                System.out.println(srednee(a, c));
//            } else {
//                System.out.println(srednee(a, b));
//            }
//        } else if (b > c) {
//            if (a > c) {
//                System.out.println(srednee(b, c));
//            } else {
//                System.out.println(srednee(b, a));
//            }
//        } else {
//            if (a > b) {
//                System.out.println(srednee(c, b));
//            } else {
//                System.out.println(srednee(c, a));
//            }
//        }
//        Написать функцию, которая принимает на вход два целых числа и возвращает количество нечетных чисел между ними
//        int o = 2, d = 10;
//        int megdy = 0;
//        for (; o < d; o++) {
//            if (o % 2 != 0) {
//                megdy = megdy + 1;
//            }
//        }
//        System.out.println(megdy);

        //    Написать функцию, которая принимает на вход два целых числа и возвращает количество нечетных чисел между ними
//        System.out.println(dva(2, 12));


//        Написать функцию, которая принимает на вход массив (список) целых чисел и возвращает их сумму
//        int[] num = {1, 2, 3, 4, 6};
//        int result = 0;
//        for (int i = 0; i < num.length; i++) {
//            result = result + num[i];
//        }
//        System.out.println(result);


//        int[] num = {1, 2, 3, 4, 10};
//        System.out.println(sum(num));


        String h = "Hueta";
        System.out.println(word(h));




        //    конец main
    }

    //        Даны три целыйх числа a b c. Вывести на консоль число, расположенное между наименьшим и наибольшим
    static int srednee(int x, int y) {
        return ((x + y) / 2);
    }

    //    Написать функцию, которая принимает на вход два целых числа и возвращает количество нечетных чисел между ними
    static int dva(int o, int d) {
        int megdy = 0;
        for (int x = o; x < d; x++) {
            if (x % 2 != 0) {
                megdy = megdy + 1;
            }
        }
        return megdy;
    }


    //        Написать функцию, которая принимает на вход массив (список) целых чисел и возвращает их сумму


    static int sum(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }

//    Написать функцию, которая принимает на вход строку и возвращает новую строку из символов, стоящих на четных местах в первой строке
//    Пример:
//    chetn("hueta") -> hea

    static String word(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

//    конец class
}