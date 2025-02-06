package org.github.dkovaleva.geometry;

public class Quadrate extends Figure {
    private int a;

    public Quadrate(int a) {
        this.a = a;
    }

    @Override
    public double square() {
        return a * a;
    }

    @Override
    public double perimeter() {
        return a * 4;
    }


}
