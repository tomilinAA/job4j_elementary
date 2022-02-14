package ru.job4j.Converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
            float in = 140;
            float expected = 2;
            float out = Converter.rubleToEuro(in);
            float eps = 0.0001f;
            Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert140RblThen2Dollar() {
                float in1 = 140;
                float expected1 = 2;
                float out1 = Converter.rubleToEuro(in1);
                float eps1 = 0.0001f;
                Assert.assertEquals(expected1, out1, eps1);
            }

    @Test
    public void whenConvert140RblThen2Yuan() {
        float in2 = 140;
        float expected2 = 2;
        float out2 = Converter.rubleToEuro(in2);
        float eps2 = 0.0001f;
        Assert.assertEquals(expected2, out2, eps2);

    }

    @Test
    public void whenConvert140RblThen2Tugriki() {
        float in3 = 140;
        float expected3 = 2;
        float out3 = Converter.rubleToEuro(in3);
        float eps3 = 0.0001f;
        Assert.assertEquals(expected3, out3, eps3);
    }
}