package ru.sbt;

/**
 * Created by user7 on 19.09.2016.
 */
public class Square implements Shape {
    public double edge;


    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return edge*edge;
    }
}
