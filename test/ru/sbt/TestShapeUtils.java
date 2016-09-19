package ru.sbt;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user7 on 19.09.2016.
 */
public class TestShapeUtils {

    @Test
    public void testingMaxFunction() {
        Circle bigCircle = new Circle(100);
        Rectangle smallRectangle = new Rectangle(3,4);

        Shape resultShape = ShapeUtils.max(bigCircle, smallRectangle);
        assertTrue(bigCircle == resultShape);
        assertEquals(bigCircle, resultShape);

        Square smallSquare = new Square(56);
        Shape resultShape2 = ShapeUtils.max(bigCircle, smallSquare);
        assertEquals(bigCircle, resultShape2);

    }


}
