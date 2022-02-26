package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i <= data.length; i++) {
            int min = MinDiapason.findMin(data, data[i + 1], data[data.length - 1]);
            int index = FindLoop.indexOf(data, min, data[i], data[data.length - 1]);
            int swap = data[min];
            data[min] = data[index];
            data[index] = swap;
        }
        return data;
    }
}

