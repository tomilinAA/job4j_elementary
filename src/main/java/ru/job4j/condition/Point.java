package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = x2 - x1;
        double rsl1 = y2 - y1;
        double rsl2 = Math.pow(rsl, 2);
        double rsl3 = Math.pow(rsl1, 2);
        double rsl4 = rsl2 + rsl3;
        return Math.sqrt(rsl4);
    }

    public static double distance1(int x1, int y1, int x2, int y2) {
        double rsl = x2 - x1;
        double rsl1 = y2 - y1;
        double rsl2 = Math.pow(rsl, 2);
        double rsl3 = Math.pow(rsl1, 2);
        double rsl4 = rsl2 + rsl3;
        return Math.sqrt(rsl4);
    }

    public static double distance2(int x1, int y1, int x2, int y2) {
        double rsl = x2 - x1;
        double rsl1 = y2 - y1;
        double rsl2 = Math.pow(rsl, 2);
        double rsl3 = Math.pow(rsl1, 2);
        double rsl4 = rsl2 + rsl3;
        return Math.sqrt(rsl4);
    }

    public static double distance3(int x1, int y1, int x2, int y2) {
        double rsl = x2 - x1;
        double rsl1 = y2 - y1;
        double rsl2 = Math.pow(rsl, 2);
        double rsl3 = Math.pow(rsl1, 2);
        double rsl4 = rsl2 + rsl3;
        return Math.sqrt(rsl4);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(0, 4, 2, 3);
        double result2 = Point.distance(1, 2, 2, 3);
        double result3 = Point.distance(2, 2, 4, 4);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (0, 3) to (4, 3) "  + result1);
        System.out.println("result (1, 2) to (2, 3) "  + result2);
        System.out.println("result (2, 2) to (4, 4) "  + result3);
    }
}

