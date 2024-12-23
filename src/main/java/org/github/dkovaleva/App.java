package org.github.dkovaleva;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //int i = 0;
        long li = 0;
        double di = 0;
        // String s = "";
        boolean b = true;


        int[] arr = new int[] {1, 2, 3};
        String[] arr2 = new String[4];
        boolean[] arr3 = new boolean[6];

        int[] numbers = new int[] {56, 4356, 46234, 6787, 0, 213};
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }
        // for (int i = 0; i < numbers.length; i++) {
        //     if (numbers[i]%2==0) {
        //         System.out.println(numbers[i]);
        //     }
        // }

        // int i = 0;
        // while (i < numbers.length) {
        //     if (numbers[i]%2==0) {
        //         System.out.println(numbers[i]);
        //     }
        //     i++;
        // }
        




        // String str = "Сука";
        // String probel = " ";
        // String result = "";
        // for (int i = 0; i < str.length(); i++) {
        //     // System.out.print(str.charAt(i) + probel); 
        //     result = result + str.charAt(i) + probel;
        // }
        // System.out.print(result);


        suka();

        System.out.println(sum(5, 3));
        System.out.println(probel("hueta"));

        //System.out.println();

    }

    static void suka() {
        System.out.println("suka");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static String probel(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + " ";
        }
        return result;
    }
}
