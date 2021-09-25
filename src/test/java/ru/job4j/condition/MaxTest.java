package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int actual = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int actual = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int actual = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }
}
