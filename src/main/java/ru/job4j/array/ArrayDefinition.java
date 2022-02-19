package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Значение массива ages = " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Значение массива surnames = " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Значение массива prices = " + prices.length);
        String[] names = new String[4];
        names[0] = "Алёша";
        System.out.println(names[0]);
        names[1] = "Коля";
        System.out.println(names[1]);
        names[2] = "Баир";
        System.out.println(names[2]);
        names[3] = "Нурмаджонсенсенбай";
        System.out.println(names[3]);
    }
}



