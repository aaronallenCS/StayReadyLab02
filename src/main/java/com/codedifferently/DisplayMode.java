package io.codedifferently;

public class DisplayMode
{
    private String whichMode;

    public DisplayMode()
    {
        this.whichMode = "decimal";
    }

    public void switchDisplayMode()
    {
        if(whichMode.equalsIgnoreCase("binary"))
        {
            whichMode = "octal";
        }
        else if(whichMode.equalsIgnoreCase("octal"))
        {
            whichMode = "decimal";
        }
        else if(whichMode.equalsIgnoreCase("decimal"))
        {
            whichMode = "hexadecimal";
        }
        else if(whichMode.equalsIgnoreCase("hexadecimal"))
        {
            whichMode = "binary";
        }
        else
        {
            System.out.print("Not a valid mode");
        }
    }

    public void switchDisplayMode(String mode)
    {
        if(whichMode.equalsIgnoreCase("binary") || whichMode.equalsIgnoreCase("octal") || whichMode.equalsIgnoreCase("decimal") || whichMode.equalsIgnoreCase("hexadecimal"))
        {
            System.out.print("Invalid input, please select binary, octal, decimal, or hexadecimal");
        }
        whichMode = mode;
    }

    public String getDisplayMode()
    {
        return this.whichMode;
    }

    public String getDisplayOptions()
    {
        return "Options: binary, octal, decimal, hexadecimal";
    }
}