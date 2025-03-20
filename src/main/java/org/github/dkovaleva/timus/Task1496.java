package org.github.dkovaleva.timus;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1496 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> teams = new HashSet<>();
        Set<String> spams = new HashSet<>();

        int a = in.nextInt();
        for (int i = 0; i <= a; i++) {
            String team = in.nextLine();
            if (!teams.contains(team)) {
                teams.add(team);
            } else {
                spams.add(team);
            }
        }
        for (String spam : spams) {
            System.out.println(spam);
        }
    }
}