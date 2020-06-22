package io.codedifferently;

import static org.junit.Assume.assumeNoException;

import org.junit.*;
public class TrigUnitsTest
{

    @Test
    public void testUnitSwitch()
    {
        //default is radians
        TrigUnits t = new TrigUnits();
        t.switchUnitsMode();

        Assert.assertEquals("degrees", t.getMode());
    }

    @Test
    public void testUnitSwitchInvalid()
    {
        TrigUnits t = new TrigUnits();
        //won't let user set an invalid unit
        t.switchUnitsMode("HAHAHA YOU STINK");

        Assert.assertEquals("HAHAHA YOU STINK", t.getMode());
    }

    @Test
    public void testUnitSwitchInput()
    {
        TrigUnits t = new TrigUnits();
        t.switchUnitsMode("dEgrEEs");

        Assert.assertEquals("degrees", t.getMode());
    }

}