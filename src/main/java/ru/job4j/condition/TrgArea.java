package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double rsl = (a + b + c) / 2;
        double rsl2 = rsl - a;
        double rsl3 = rsl - b;
        double rsl4 = rsl - c;
        double rsl5 = rsl * rsl2 * rsl3 * rsl4;

        return Math.sqrt(rsl5);
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
