package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double actual = Point.distance(x1, y1, x2, y2);
        double delta = 0.01;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void whenXMinus1Y1ToX2YMinus2Then4Dot24() {
        int x1 = -1;
        int y1 = 1;
        int x2 = 2;
        int y2 = -2;
        double expected = 4.24;
        double actual = Point.distance(x1, y1, x2, y2);
        double delta = 0.01;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void whenX10Y3ToXMinus4YMinus6Then16Dot64() {
        int x1 = 10;
        int y1 = 3;
        int x2 = -4;
        int y2 = -6;
        double expected = 16.64;
        double actual = Point.distance(x1, y1, x2, y2);
        double delta = 0.01;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void whenXMinus1Y2ToX3Y2Then4() {
        int x1 = -1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 2;
        double expected = 4;
        double actual = Point.distance(x1, y1, x2, y2);
        double delta = 0.01;
        Assert.assertEquals(expected, actual, delta);
    }
}
