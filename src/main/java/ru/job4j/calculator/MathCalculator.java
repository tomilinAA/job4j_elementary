package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);

    }

    public static double sumdifAndDiv(double first, double second) {
        return dif(first, second)
                + div(first, second);

    }

    public static double sumAndMultiplyandDivAndDif(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + dif(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20) + sumdifAndDiv(10, 10) + sumAndMultiplyandDivAndDif(10, 2));
    }
}