package io.codedifferently;

public class ScientificCalculator
{
    private static double currentValue;

    public ScientificCalculator()
    {
        currentValue = getDisplay();
    }

    public double getDisplay()
    {
        return currentValue;
    }

    public void setDisplayValue(double value)
    {
        currentValue = value;
    }
}