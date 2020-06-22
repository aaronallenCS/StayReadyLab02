package io.codedifferently;

public class TrigUnits
{
    private String modeValue;

    public TrigUnits()
    {
        this.modeValue = "radians";
    }

    public String switchUnitsMode()
    {
        if(modeValue.equals("radians"))
        {
            modeValue = "degrees";
        }
        else
        {
            modeValue = "radians";
        }
        return modeValue;
    }

    public String switchUnitsMode(String mode)
    {
        if(!(mode.equalsIgnoreCase("radians") || mode.equalsIgnoreCase("degrees")))
        {
            System.out.print("Invalid Units");
            return "invalid unit";
        }
        else
        {
            modeValue = mode.toLowerCase();
        }

        return modeValue;
    }

    public String getMode()
    {
        return this.modeValue;
    }

    public String trigUnits()
    {
        return "Units: radians, degrees";
    }
}