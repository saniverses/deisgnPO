package ru.sbt;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user7 on 19.09.2016.
 */
public class CircleTest {
    @Test
    public void calcArea() throws Exception {
        Circle tmp = new Circle(4.4);
        assertEquals(60.81, tmp.getArea(), 0.5);
    }

}