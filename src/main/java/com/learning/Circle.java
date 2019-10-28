package com.learning;

public class Circle implements IShape {

    private final double r;

    public  Circle(double r) {
        this.r = r;
    }

    public String draw() {
        return "Drawing Circle";
    }

    public double area() {
        double PI = 3.14;
        return (PI * r * r);
    }

}
