package org.github.dkovaleva;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for (int i = 1; i <= n; i++) {
            String result = "";
            for (int j = 0; j < i; j++) {
                result = result + i;
            }
            System.out.println(result);
        }
    }


}
