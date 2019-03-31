import Accessories.SheetMusic;
import Instruments.Guitar;
import Instruments.ISell;
import Instruments.InstrumentTypes;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    public Shop shop;
    public ArrayList<ISell> stock;
    public Guitar guitar;
    public SheetMusic sheetMusic;

    @Before
    public void setUp()  {
        shop = new Shop();
        stock = new ArrayList<ISell>();
        guitar = new Guitar(InstrumentTypes.STRINGS,"Fender", "Stratocaster", 200.00, 700.00, "Lead", 5);
        sheetMusic = new SheetMusic(3.00, 7.00, "We Will Rock You", "Freddie Mercury");



    }

    @Test
    public void canCountStock() {
        assertEquals(0, stock.size());
    }


    @Test
    public void canAddStock() {
        stock.add(guitar);
        stock.add(sheetMusic);
        assertEquals(2, stock.size());
    }

    @Test
    public void canRemoveStock() {
        stock.add(guitar);
        stock.add(sheetMusic);
        stock.remove(guitar);
        assertEquals(1, stock.size());
    }
}