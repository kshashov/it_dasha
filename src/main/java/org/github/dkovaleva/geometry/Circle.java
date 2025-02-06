package org.github.dkovaleva.geometry;

public class Circle extends Figure {
    public int radius = 0;

    public Circle(int r) {
        this.radius = r;
    }

    @Override
    public double square() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }


}
