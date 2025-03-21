package org.github.dkovaleva.timus;


import java.util.Scanner;

public class Task1581 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = Integer.parseInt(in.nextLine());
        int n = in.nextInt();
        int v = 1;
        int c = 0;

        String result = "";
        for (int i = 0; i < a - 1; i++) {
            int b = in.nextInt();
            if (b != n) {
                result = result + v + " " + n + " ";
                n = b;
                v = 1;

            } else if (b == n) {
                v = v + 1;

            }
        }
        result = result + v + " " + n + " ";
        System.out.println(result);


    }
}

