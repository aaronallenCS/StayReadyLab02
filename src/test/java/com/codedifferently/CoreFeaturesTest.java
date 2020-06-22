package io.codedifferently;

import org.junit.*;


public class CoreFeaturesTest
{
    @Test
    public void testAdd()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(12.0);

        CoreFeatures coreF = new CoreFeatures();
        coreF.add(12.0);

        Assert.assertEquals(24, sci.getDisplay(), 0);
    }

    @Test
    public void testSubtract()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(50);

        CoreFeatures coreF = new CoreFeatures();
        coreF.subtract(30);

        Assert.assertEquals(20, sci.getDisplay(), 0);
    }

    @Test
    public void testDivideByZero()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(0);

        CoreFeatures coreF = new CoreFeatures();
        coreF.divide(30);

        //assert equals throws arithmitic exception
        Assert.assertEquals(2, sci.getDisplay(), 0);
    }
    @Test
    public void testDivide()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(14);
        CoreFeatures coreF = new CoreFeatures();
        coreF.divide(2);

        Assert.assertEquals(7, sci.getDisplay(), 0);
    }

    @Test
    public void testMultiply()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(14);
        CoreFeatures coreF = new CoreFeatures();
        coreF.multiply(2);

        Assert.assertEquals(28, sci.getDisplay(), 0);
    }

    @Test
    public void exponent()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(14);
        CoreFeatures coreF = new CoreFeatures();
        coreF.exp(2);

        Assert.assertEquals(196, sci.getDisplay(), 0);
    }
    @Test
    public void square()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(14);

        CoreFeatures coreF = new CoreFeatures();
        //squares the current value
        coreF.square();

        Assert.assertEquals(196, sci.getDisplay(), 0);
    }

    @Test
    public void squareRoot()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(14);
        CoreFeatures coreF = new CoreFeatures();
        //get the square root of the current value
        coreF.squareRoot();

        Assert.assertEquals(3.7, sci.getDisplay(), 1);
    }

    @Test
    public void invertSign()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(14);
        CoreFeatures coreF = new CoreFeatures();
        coreF.invertSign(14);

        Assert.assertEquals(-14, sci.getDisplay(), 0);
    }

    @Test
    public void factorialTest()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(5);
        CoreFeatures coreF = new CoreFeatures();
        coreF.factorial(sci.getDisplay());

        Assert.assertEquals(120, sci.getDisplay(), 0);
    }

    @Test
    public void moduloTest()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(14);
        CoreFeatures coreF = new CoreFeatures();
        coreF.modulo(3);

        Assert.assertEquals(2, sci.getDisplay(), 0);
    }
}