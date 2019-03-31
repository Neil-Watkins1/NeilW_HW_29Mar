package Accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SheetMusicTest {

   public SheetMusic sheetMusic;


    @Before
    public void setUp()  {
        sheetMusic = new SheetMusic(3.00, 7.00, "We Will Rock You", "Freddie Mercury");
    }

    @Test
    public void getCostPrice() {
        assertEquals(3.00 , sheetMusic.getCostPrice(),0.001);
    }

    @Test
    public void setCostPrice() {
        sheetMusic.setCostPrice(4.00);
        assertEquals(4.00, sheetMusic.getCostPrice(),0.001);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(7.00, sheetMusic.getRetailPrice(), 0.001);
    }

    @Test
    public void setRetailPrice() {
        sheetMusic.setRetailPrice(10.00);
        assertEquals(10.00, sheetMusic.getRetailPrice(), 0.001);
    }

    @Test
    public void canSell() {
        assertEquals(4.00, sheetMusic.sell(),0.001);
    }

    @Test
    public void getTitle() {
        assertEquals("We Will Rock You", sheetMusic.getTitle());
    }

    @Test
    public void setTitle() {
        sheetMusic.setTitle("Hammer to Fall");
       assertEquals("Hammer to Fall", sheetMusic.getTitle());
    }

    @Test
    public void getComposer() {
        assertEquals("Freddie Mercury", sheetMusic.getComposer());
    }

    @Test
    public void setComposer() {
        sheetMusic.setComposer("Brian May");
        assertEquals("Brian May", sheetMusic.getComposer());
    }
}