package io.codedifferently;

import org.junit.*;

public class TrigFunctionsTest
{
    @Test
    public void testSine()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(14);
        TrigFunctions trig = new TrigFunctions();
        trig.sine();

        Assert.assertEquals(0.99, sci.getDisplay(), 0.10);
    }

    @Test
    public void testCosine()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(14);
        TrigFunctions trig = new TrigFunctions();
        trig.cosine();

        Assert.assertEquals(0.13, sci.getDisplay(), 0.10);
    }

    @Test
    public void testTan()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(14);
        TrigFunctions trig = new TrigFunctions();
        trig.tangent();

        Assert.assertEquals(7.24, sci.getDisplay(), 0.10);
    }

    @Test
    public void testInverseSin()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(0.24);
        TrigFunctions trig = new TrigFunctions();
        trig.inverseSine();

        Assert.assertEquals(0.24236, sci.getDisplay(), 0.10000);
    }

    @Test
    public void testInverseCosine()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(0.14);
        TrigFunctions trig = new TrigFunctions();
        trig.inverseCosine();

        Assert.assertEquals(1.43, sci.getDisplay(), 0.10);
    }

    @Test
    public void testInverseTangent()
    {
        ScientificCalculator sci = new ScientificCalculator();
        sci.setDisplayValue(0.14);
        TrigFunctions trig = new TrigFunctions();
        trig.inverseTan();

        Assert.assertEquals(0.139, sci.getDisplay(), 0.100);
    }
}