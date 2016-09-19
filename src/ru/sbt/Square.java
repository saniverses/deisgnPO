package ru.sbt;

/**
 * Created by user7 on 19.09.2016.
 */
public class Square implements Figure{
    public double edge;

    @Override
    public double calcArea() {
        return edge*edge;
    }
}
