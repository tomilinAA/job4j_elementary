package ru.job4j.condition;

public class SqArea {

        public static double square(double p, double k) {
            double rsl = p / (2 * (k + 1));
            double rsl2 = rsl * k;
            double rsl3 = rsl2 * rsl;
            return rsl3;
        }

        public static void main(String[] args) {
            double result1 = SqArea.square(6, 2);
            System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        }
    }

