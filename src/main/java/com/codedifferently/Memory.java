package io.codedifferently;

public class Memory extends ScientificCalculator
{
    private double memoryValue;

    public void addToMemory()
    {
        this.memoryValue = getDisplay();
    }

    public void resetMemory()
    {
        this.memoryValue = 0;
    }

    public double recallMemory()
    {
        return this.memoryValue;
    }
}