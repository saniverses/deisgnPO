package ru.sbt;

/**
 * Created by user7 on 19.09.2016.
 */
public class Circle implements Figure{
    public double rad;
    public static final double pi = 3.1415;

    @Override
    public double calcArea() {
        return pi*rad*rad;
    }

}
