package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class DefragmentTest {

    @Test
    public void singleFirstNull() {
        String[] input = {null, "I"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void lastNull() {
        String[] input = {null, "I", "wanna", null, "be", "compressed", null};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void allNull() {
        String[] input = {null, null, null};
        String[] result = Defragment.compress(input);
        String[] expected = {null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void allAtFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void notAllAtFirstNull() {
        String[] input = {"I", "wanna", "be", "compressed", null, null, null};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }
}
