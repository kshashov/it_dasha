package org.github.dkovaleva.geometry;

import static java.lang.Math.sqrt;

public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;
//    private double p = ((a+b+c)/2);

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double square() {
        double p = ((a + b + c) / 2);
        double sq = sqrt((p * (p - a) * (p - b) * (p - c)));
        return sq;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }


}
