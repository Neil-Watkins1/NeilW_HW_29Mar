package Instruments;

import org.junit.Before;
import org.junit.Test;
import Instruments.InstrumentTypes;


import static org.junit.Assert.*;

public class GuitarTest {

    public Guitar guitar;

    @Before
    public void setUp()  {

        guitar = new Guitar(InstrumentTypes.STRINGS,"Fender", "Stratocaster", 200.00, 700.00, "Lead", 5);
    }




    @Test
    public void getInstrumentTypes() {
        assertEquals(InstrumentTypes.STRINGS, guitar.getInstrumentTypes());
    }

    @Test
    public void setInstrumentTypes() {
        guitar.setInstrumentTypes(InstrumentTypes.PERCUSSION);
        assertEquals(InstrumentTypes.PERCUSSION, guitar.getInstrumentTypes());
    }

    @Test
    public void getMake() {
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void setMake() {
        guitar.setMake("Gibson");
        assertEquals("Gibson", guitar.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("Stratocaster", guitar.getModel());
    }

    @Test
    public void setModel() {
        guitar.setModel("Les Paul");
        assertEquals("Les Paul", guitar.getModel());
    }

    @Test
    public void getCostPrice() {
        assertEquals(200.00, guitar.getCostPrice(), 0.001);
    }

    @Test
    public void setCostPrice() {
        guitar.setCostPrice(300.00);
        assertEquals(300.00, guitar.getCostPrice(), 0.001);
    }


    @Test
    public void getRetailPrice() {
        assertEquals(700.00, guitar.getRetailPrice(), 0.001);
    }

    @Test
    public void setRetailPrice() {
        guitar.setRetailPrice(800.00);
        assertEquals(800.00, guitar.getRetailPrice(), 0.001);
    }

    @Test
    public void getType() {
        assertEquals("Lead", guitar.getType());
    }

    @Test
    public void setType() {
        guitar.setType("Bass");
        assertEquals("Bass", guitar.getType());
    }

    @Test
    public void getStrings() {
        assertEquals(5, guitar.getStrings());
    }

    @Test
    public void setStrings() {
        guitar.setStrings(7);
        assertEquals(7, guitar.getStrings());
    }
}