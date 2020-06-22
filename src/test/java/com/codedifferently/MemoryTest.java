package io.codedifferently;

import org.junit.*;

public class MemoryTest
{

    @Test
    public void addToMemory()
    {
        ScientificCalculator s = new ScientificCalculator();
        s.setDisplayValue(15);
        Memory m = new Memory();
        m.addToMemory();

        Assert.assertEquals(15, m.recallMemory(), 0);
    }

    @Test
    public void testReset()
    {
        Memory m = new Memory();
        m.resetMemory();

        Assert.assertEquals(0, m.recallMemory(), 0);
    }
}