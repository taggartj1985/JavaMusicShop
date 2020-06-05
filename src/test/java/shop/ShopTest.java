package shop;

import instruments.InstrumentType;
import instruments.strings.BassGuitar;
import instruments.strings.Guitar;
import org.junit.Before;
import org.junit.Test;
import stock.Plectrums;
import stock.SheetMusic;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private BassGuitar bass;
    private Plectrums plectrums;
    private SheetMusic sheetmusic;


    @Before
    public void before(){
        shop = new Shop("Don't Fret");
        guitar = new Guitar("Jaguar", "Fender", "Black", InstrumentType.STRING, 400, 600, "Mighty Fine Guitar");
        bass = new BassGuitar("Jazz", "Fender", "Black", InstrumentType.STRING, 250, 450, "Solid Bass");
        plectrums = new Plectrums("Because you lose them all the time", 0.10, 0.50);
        sheetmusic = new SheetMusic("Blank notation pad", 2.50, 5);
    }

    @Test
    public void shopHasName(){
        assertEquals("Don't Fret", shop.getName());
    }

    @Test
    public void hasNoStock(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddStock(){
        shop.addStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(guitar);
        shop.addStock(bass);
        shop.addStock(plectrums);
        shop.addStock(sheetmusic);
        shop.removeStock(guitar);
        assertEquals(3, shop.getStock().size());
    }

    @Test
    public void canCalculateStockProfit(){
        shop.addStock(guitar);
        shop.addStock(bass);
        shop.addStock(plectrums);
        shop.addStock(sheetmusic);
        assertEquals(402.9, shop.calculateAllStockProfit(), 0.1);
    }
}
