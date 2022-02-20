package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray1() {
        int[] input = new int[] {4, 1, 6, 2, 3};
        int[] result = Turn.back(input);
        int[] expected = new int[] {3, 2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);

    }
}