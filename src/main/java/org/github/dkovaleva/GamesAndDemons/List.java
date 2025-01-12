package org.github.dkovaleva.GamesAndDemons;

public class List {
    private int[] a = new int[2];
    private int sum = 0;

    public static void main(String[] args) {
        List h = new List();
        h.add(23);
        h.add(34);
        h.add(345);
        h.add(456);
        printA(h);

        h.delete(1);
        printA(h);
    }

    private static void printA(List h) {
        for (int i = 0; i < h.size(); i++) {
            System.out.println(h.getA(i));
        }
        System.out.println(h.size());
    }

    public void add(int aNew) {
        if (sum == a.length) {
            int[] a2 = new int[a.length * 2];
            for (int i = 0; i < a.length; i++) {
                a2[i] = a[i];
            }
            a = a2;
        }
        a[sum] = aNew;
        sum = sum + 1;
    }

    public void setA(int i, int changeA) {
        a[i] = changeA;
    }

    public int getA(int i) {
        return a[i];
    }

    public int size() {
        return sum;
    }

    public void delete(int i) {
        for (int j = i; j < a.length - 1; j++) {
            a[j] = a[j + 1];
        }
        sum--;
    }
}

