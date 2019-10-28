package com.learning;

public class Rectangle implements IShape {
    private int l;
    private int w;


    public String draw() {
        final String s = "Drawing Rectangle";
        return s;
    }

    public double area() {
        return l * w;
    }
}
