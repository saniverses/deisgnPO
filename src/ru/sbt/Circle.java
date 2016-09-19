package ru.sbt;

/**
 * Created by user7 on 19.09.2016.
 */
public class Circle implements Shape {
    public double rad;
    public static final double pi = 3.1415;


    public Circle(double rad) {
        this.rad = rad;
    }

    @Override
    public double getArea() {
        return pi * rad * rad;
    }

}
