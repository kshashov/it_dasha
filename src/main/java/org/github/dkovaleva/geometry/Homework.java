package org.github.dkovaleva.geometry;

public class Homework {
    public static void main(String[] args) {
        Circle as = new Circle(4);
        System.out.println(as.perimeter());
        System.out.println(as.square());


        Triangle sd = new Triangle(5, 5, 5);
        System.out.println(sd.square());
        System.out.println(sd.perimeter());


        Rectangle df = new Rectangle(4, 5);
        System.out.println(df.square());
        System.out.println(df.perimeter());
    }
}

