package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i <= data.length - 1; i++) {
            int min = MinDiapason.findMin(data, data[i], data.length - 1);
            int index = FindLoop.indexOf(data, min, data[i], data.length - 1);
            int[] swap = SwitchArray.swap(data, data[index], data.length - 1);
        }
        return data;
    }
}

