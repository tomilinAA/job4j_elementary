package ru.job4j.calculator.ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double difAndDiv(double first, double second) {
        return ru.job4j.math.MathFunction.dif(first, second)
                + ru.job4j.math.MathFunction.div(first, second);
    }

    public static double sumAndMultiplyandDivAndDif(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second)
                + ru.job4j.math.MathFunction.div(first, second)
                + ru.job4j.math.MathFunction.dif(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20) + difAndDiv(10, 10) + sumAndMultiplyandDivAndDif(10, 2));
    }
}
