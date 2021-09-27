package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int actual = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenSumEvenNumbersFromMinusThreeToNineThenEighteen() {
        int start = -3;
        int finish = 9;
        int actual = Counter.sumByEven(start, finish);
        int expected = 18;
        Assert.assertEquals(expected, actual);
    }
}
