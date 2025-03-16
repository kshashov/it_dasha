package org.github.dkovaleva.timus;

import java.util.Scanner;

public class Task1001 {

    public static void main(String[] args) {
        String result = "";

        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (line.trim().isEmpty()) {
                continue;
            }
            String[] splited = line.split(" ");
            for (int i = 0; i < splited.length; i++) {
                if (!splited[i].isEmpty()) {
                    long num = Long.parseLong(splited[i]);
                    String sqrt = String.format("%.4f", Math.sqrt(num));
                    result = sqrt + "\n" + result;
                }
            }
//            long num = in.nextLong();
//            result += Math.sqrt(num) + "\n";
//            System.out.println(splited);
        }
        in.close();
        System.out.println(result);
    }
}
