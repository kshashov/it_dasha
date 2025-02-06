package org.github.dkovaleva.geometry;

public abstract class Figure {
    private String name;
    public static double pi = 3.14;


//    public Figure(String name) {
//        this.name = name;
//    }


    public void setName(String name) {
        this.name = name;
    }

    public abstract double square();

    public abstract double perimeter();


}
