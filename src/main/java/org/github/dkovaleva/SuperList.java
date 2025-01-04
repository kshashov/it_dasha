package org.github.dkovaleva;

public class SuperList {
    private int[] data = new int[3];
    private int realLength = 0;

    public SuperList() {
    }

    public void add(int number) {
        if (realLength >= data.length) {
            int[] data2 = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                data2[i] = data[i];
            }
            data = data2;
        }

        data[realLength] = number;

        realLength++;
    }

    public void set(int index, int newValue) {
        if (index < realLength) {
            data[index] = newValue;
        }
    }

    public int get(int index) {
        if (index >= realLength) {
            System.out.println("Охуел? Максимальное количество " + realLength);
            return -1;
        }

        return data[index];
    }

    public int size() {
        return realLength;
    }

}
