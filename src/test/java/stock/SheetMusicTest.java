package stock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetmusic;

    @Before
    public void before(){
        sheetmusic = new SheetMusic("Blank notation pad", 2.50, 5);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Blank notation pad", sheetmusic.getDescription());
    }

    @Test
    public void canGetBuyInPrice() {
        assertEquals(2.50, sheetmusic.getBuyInCost(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(5, sheetmusic.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetProfit(){
        assertEquals(2.50, sheetmusic.calculateMarkUp(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        sheetmusic.setSellingPrice(10);
        assertEquals(10, sheetmusic.getSellingPrice(), 0.01);
    }

    @Test
    public void canSetBuyPrice(){
        sheetmusic.setBuyInCost(2);
        assertEquals(2, sheetmusic.getBuyInCost(), 0.01);
    }

    @Test
    public void canSetDescription(){
        sheetmusic.setDescription("learn to play your favourite band");
        assertEquals("learn to play your favourite band", sheetmusic.getDescription());
    }
}
