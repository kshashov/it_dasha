package org.github.dkovaleva.geometry;

public class EquilateralTriangle extends Triangle {
    //равносторонний треугольник

    private double h;

    public EquilateralTriangle() {
    }


    private void megaSet(int x) {
        super.setA(x);
        super.setB(x);
        super.setC(x);
        this.h = x * Math.sqrt(3) / 2;
    }

    public void setA(int a) {
        megaSet(a);
    }

    public void setB(int b) {
        megaSet(b);
    }

    public void setC(int c) {
        megaSet(c);
    }

    public double getH() {
        return h;
    }

    @Override
    public double square() {
        return (h * h / Math.sqrt(3));
    }

    @Override
    public double perimeter() {
        return getA() * 3;
    }
}
