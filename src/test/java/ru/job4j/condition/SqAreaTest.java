package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double actual = SqArea.square(p, k);
        double delta = 0.01;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void whenP4K1Square1() {
        int p = 4;
        double k = 1;
        int expected = 1;
        double actual = SqArea.square(p, k);
        double delta = 0.01;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void whenP9K7Square2Dot21() {
        int p = 9;
        double k = 7;
        double expected = 2.21;
        double actual = SqArea.square(p, k);
        double delta = 0.01;
        Assert.assertEquals(expected, actual, delta);
    }
}
