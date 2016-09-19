package ru.sbt;

/**
 * Created by user7 on 19.09.2016.
 */
public class Rectangle implements Shape {
    public double width;
    public double length;
    public double area;


    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return area = width * length;
    }

}
