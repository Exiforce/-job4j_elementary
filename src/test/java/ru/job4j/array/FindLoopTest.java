package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas4Then0() {
        int[] data = {0, 1, 2, 3};
        int el = 6;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas10Then9() {
        int[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int el = 9;
        int result = FindLoop.indexOf(data, el);
        int expected = 9;
        Assert.assertEquals(expected, result);
    }
}