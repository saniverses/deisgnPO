package ru.sbt;

import static org.junit.Assert.*;

/**
 * Created by user7 on 19.09.2016.
 */
public class RectangleTest {
    @org.junit.Test
    public void calcArea() throws Exception {
        Rectangle tmp = new Rectangle(10, 25.5);
        assertEquals(255, tmp.calcArea(), 1);
    }

}