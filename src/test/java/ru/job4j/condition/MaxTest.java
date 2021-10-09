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

    @Test
    public void whenMax1And2And3Then3() {
        int one = 1;
        int two = 2;
        int three = 3;
        int actual = Max.max(one, two, three);
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void whenMax3And1And2Then3() {
        int one = 3;
        int two = 1;
        int three = 2;
        int actual = Max.max(one, two, three);
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void whenMax2And3And1Then3() {
        int one = 2;
        int two = 3;
        int three = 1;
        int actual = Max.max(one, two, three);
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void whenMax3And3And3Then3() {
        int one = 3;
        int two = 3;
        int three = 3;
        int actual = Max.max(one, two, three);
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void whenMax1And2And3And4Then4() {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int actual = Max.max(one, two, three, four);
        int expected = 4;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void whenMax4And1And2And3Then4() {
        int one = 4;
        int two = 1;
        int three = 2;
        int four = 3;
        int actual = Max.max(one, two, three, four);
        int expected = 4;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void whenMax3And4And1And2Then4() {
        int one = 3;
        int two = 4;
        int three = 1;
        int four = 2;
        int actual = Max.max(one, two, three, four);
        int expected = 4;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void whenMax2And3And4And1Then4() {
        int one = 2;
        int two = 3;
        int three = 4;
        int four = 1;
        int actual = Max.max(one, two, three, four);
        int expected = 4;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void whenMax4And4And4And4Then4() {
        int one = 4;
        int two = 4;
        int three = 4;
        int four = 4;
        int actual = Max.max(one, two, three, four);
        int expected = 4;
        Assert.assertEquals(actual, expected);
    }
}
