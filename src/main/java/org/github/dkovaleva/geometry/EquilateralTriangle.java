package org.github.dkovaleva.geometry;

public class EquilateralTriangle extends Triangle {
    //равносторонний треугольник
    private int a;
    private int h;

    public EquilateralTriangle() {

    }

    public void setA(int a) {
        this.a = a;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double square() {
        return (h * h / Math.sqrt(3));
    }

    @Override
    public double perimeter() {
        return a * 3;
    }
}
