package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Значение массива ages = " + ages.length);
        System.out.println("Значение массива surnames = " + surnames.length);
        System.out.println("Значение массива prices = " + prices.length);
        String[] names = new String[4];
        names[0] = "Алёша";
        names[1] = "Коля";
        names[2] = "Баир";
        names[3] = "Нурмаджонсенсенбай";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}



