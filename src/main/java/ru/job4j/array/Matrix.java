package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] res = new int[size][size];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = (i + 1) * (j + 1);
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        return res;
    }
}

