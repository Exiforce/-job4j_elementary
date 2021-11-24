package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.index(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas3Then2() {
        int[] data = {1, 2, 3, 4, 5, 6};
        int el = 3;
        int result = FindLoop.index(data, el);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNo6ThenMinus1() {
        int[] data = {13, 4, 1, 9, 8, 98};
        int el = 6;
        int result = FindLoop.index(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}