package ru.job4j.condition;

public class SqArea {

        public static double square(double p, double k) {
            double rsl = p / (2 * (k + 1));
            double rsl2 = rsl * k;
            double rsl3 = rsl2 * rsl;
            return rsl3;
        }

        public static double square1(double p, double k) {
        double rsl = p / (2 * (k + 1));
        double rsl2 = rsl * k;
        double rsl3 = rsl2 * rsl;
        return rsl3;

        }

        public static double square2(double p, double k) {
        double rsl = p / (2 * (k + 1));
        double rsl2 = rsl * k;
        double rsl3 = rsl2 * rsl;
        return rsl3;

        }

        public static double square3(double p, double k) {
        double rsl = p / (2 * (k + 1));
        double rsl2 = rsl * k;
        double rsl3 = rsl2 * rsl;
        return rsl3;
        }

        public static void main(String[] args) {
            double result1 = SqArea.square(6, 2);
            double result2 = SqArea.square1(1, 2);
            double result3 = SqArea.square2(3, 4);
            double result4 = SqArea.square3(5, 6);
            System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
            System.out.println(" p = 1, k = 2, s = 0.05, real = " + result2);
            System.out.println(" p = 3, k = 4, s = 0.36, real = " + result3);
            System.out.println(" p = 5, k = 6, s = 0.77, real = " + result4);
        }
    }

