package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;



public class ScientificCalculatorTest
{

    @Test
    public void checkGetSetDisplay()
    {
        ScientificCalculator scientific = new ScientificCalculator();
        scientific.setDisplayValue(5.0);

        double valueToTest = 5.0;
        Assert.assertEquals(valueToTest, scientific.getDisplay(), 0);
    }
}