package io.codedifferently;

public class TrigFunctions extends ScientificCalculator
{
    public double sine()
    {
        setDisplayValue(Math.sin(getDisplay()));
        return getDisplay();
    }

    public double cosine()
    {
        setDisplayValue(Math.cos(getDisplay()));
        return getDisplay();
    }

    public double tangent()
    {
        setDisplayValue(Math.tan(getDisplay()));
        return getDisplay();
    }

    public double inverseSine()
    {
        setDisplayValue(Math.asin(getDisplay()));
        return getDisplay();
    }

    public double inverseCosine()
    {
        setDisplayValue(Math.acos(getDisplay()));
        return getDisplay();
    }

    public double inverseTan()
    {
        setDisplayValue(Math.atan(getDisplay()));
        return getDisplay();
    }

    public String trigFunctions()
    {
        return "List of Functions: sine, cosine, tangent, inverse sine, inverse cosine, inverse tangent";
    }

}