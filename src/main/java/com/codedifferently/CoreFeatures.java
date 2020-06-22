package io.codedifferently;

public class CoreFeatures extends ScientificCalculator
{

    public double add(double value)
    {
        setDisplayValue(getDisplay() + value);
        return getDisplay();
    }

    public double subtract(double value)
    {
        setDisplayValue(getDisplay() - value);
        return getDisplay() - value;
    }

    public double divide(double value)
    {
        if(getDisplay() == 0 || value == 0)
        {
            throw new ArithmeticException("Sorry, can't divide by zero");
        }
        else
        {
            setDisplayValue(getDisplay() / value);
            return getDisplay() / value;
        }
    }

    public double multiply(double value)
    {
        setDisplayValue(getDisplay() * value);
        return getDisplay() * value;
    }

    public double exp(double value)
    {
        setDisplayValue(Math.pow(getDisplay(), value));
        return Math.pow(getDisplay(), value);
    }

    public double square()
    {
        setDisplayValue(getDisplay() * getDisplay());
        return getDisplay();
    }

    public double squareRoot()
    {
        setDisplayValue(Math.sqrt(getDisplay()));
        return getDisplay();
    }

    //TODO: fill in with inverse
    public double inverse(double value)
    {
        return 0.0;
    }

    public double invertSign(double value)
    {
        setDisplayValue(value *= -1);

        return getDisplay();
    }

    public double factorial(double value)
    {
        setDisplayValue(factorialHelper(value));
        return getDisplay();
    }
    public double factorialHelper(double value)
    {
        if(value == 0)
        {
            return 1;
        }
        else
        {
            return value * factorialHelper(value - 1);
        }
    }

    public double modulo(double value)
    {
        setDisplayValue(getDisplay() % value);
        return getDisplay() % value;
    }
}