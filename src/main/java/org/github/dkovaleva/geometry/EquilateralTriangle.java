package org.github.dkovaleva.geometry;

public class EquilateralTriangle extends Triangle {
    //равносторонний треугольник

    private double h;

    public EquilateralTriangle() {

    }

    public void setA(int a) {
        super.setA(a);
        super.setB(a);
        super.setC(a);
        this.h = a * Math.sqrt(3) / 2;
    }

    public void setB(int b) {
        super.setA(b);
        super.setB(b);
        super.setC(b);
        this.h = b * Math.sqrt(3) / 2;
    }

    public void setC(int c) {
        super.setA(c);
        super.setB(c);
        super.setC(c);
        this.h = c * Math.sqrt(3) / 2;
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
        return getA() * 3;
    }
}
