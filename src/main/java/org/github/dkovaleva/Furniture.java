package org.github.dkovaleva;

public class Furniture {
    public static String material;
    public String title;
    public int width;
    public int length;
    public int height;

    public String name() {
        return title + ": " + width + " "
                + height + " " + length + " " + volume();
    }

    public int volume() {
        return width * length * height;
    }

    public static void hueta() {

        System.out.println("static hueta " + material);
    }
}
