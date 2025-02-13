package org.github.dkovaleva.geometry;

public class Homework {
    public static void main(String[] args) {
//        Circle as = new Circle(4);
//        System.out.println(as.perimeter());
//        System.out.println(as.square());
//
//
//        Triangle sd = new Triangle(5, 5, 5);
//        double square = sd.square();
////        square = Math.floor(square*100)/100;
//        System.out.format("%.2f\n", square);
//        System.out.println(sd.perimeter());
//
//
//        Rectangle df = new Rectangle(4, 5);
//        System.out.println(df.square());
//        System.out.println(df.perimeter());


        EquilateralTriangle d = new EquilateralTriangle();
        d.setA(4);
        d.setB(5);
        d.setC(6);
        System.out.println(d.perimeter());

    }
}

