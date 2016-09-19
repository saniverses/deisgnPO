package ru.sbt;

/**
 * Created by user7 on 19.09.2016.
 */
public class ShapeUtils {

    public static Shape max(Shape biggerShape, Shape smallerShape) {
        if (biggerShape.getArea() < smallerShape.getArea()) return smallerShape;
        else return biggerShape;
    }
}
