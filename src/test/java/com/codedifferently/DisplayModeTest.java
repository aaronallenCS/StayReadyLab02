package io.codedifferently;

import org.junit.*;

public class DisplayModeTest
{
    @Test
    public void testDefaultDisplay()
    {
        DisplayMode displayMode = new DisplayMode();
        Assert.assertEquals("decimal", displayMode.getDisplayMode());
    }

    @Test
    public void testChangeDisplay()
    {
        DisplayMode displayMode = new DisplayMode();
        displayMode.switchDisplayMode();

        Assert.assertEquals("hexadecimal", displayMode.getDisplayMode());
    }

    @Test
    public void testUserChange()
    {
        DisplayMode displayMode = new DisplayMode();
        displayMode.switchDisplayMode("binary");

        Assert.assertEquals("binary", displayMode.getDisplayMode());
    }

    @Test 
    public void testDisplayOptions()
    {
        DisplayMode displayMode = new DisplayMode(); 
        
        Assert.assertEquals("Options: binary, octal, decimal, hexadecimal", displayMode.getDisplayOptions());
    }
}