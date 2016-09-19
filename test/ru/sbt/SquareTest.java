package ru.sbt;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user7 on 19.09.2016.
 */
public class SquareTest {
    @Test
    public void calcArea() throws Exception {
        Square tmp = new Square(4);
        assertEquals(16, tmp.getArea(), 0.05);
    }

}