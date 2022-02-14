package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float rubleToYuan(float value) {
        float rsl = value / 12;
        return rsl;
    }

    public static float rubleToTugriki(float value) {
        float rsl = value * 37;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float dollar = Converter.rubleToDollar(140);
        float in1 = 140;
        float expected1 = 2;
        float out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2. Test result : " + passed1);

        float yuan = Converter.rubleToYuan(140);
        float in2 = 140;
        float expected2 = 2;
        float out2 = Converter.rubleToYuan(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2. Test result : " + passed2);

        float tugriki = Converter.rubleToTugriki(140);
        float in3 = 140;
        float expected3 = 2;
        float out3 = Converter.rubleToTugriki(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("140 rubles are 2. Test result : " + passed3);

        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("140 rubles are " + dollar + " dollar");
        System.out.println("140 rubles are " + yuan + " yuan");
        System.out.println("140 rubles are " + tugriki + " tugriki");
    }
}