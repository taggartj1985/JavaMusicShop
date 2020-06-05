package stock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlectrumsTest {

    Plectrums plectrums;

    @Before
    public void before(){
        plectrums = new Plectrums("Because you lose them all the time", 0.10, 0.50);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Because you lose them all the time", plectrums.getDescription());
    }

    @Test
    public void canGetBuyInPrice() {
        assertEquals(0.10, plectrums.getBuyInCost(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(0.50, plectrums.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetProfit(){
        assertEquals(.40, plectrums.calculateMarkUp(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        plectrums.setSellingPrice(1);
        assertEquals(1, plectrums.getSellingPrice(), 0.01);
    }

    @Test
    public void canSetBuyPrice(){
        plectrums.setBuyInCost(.20);
        assertEquals(.20, plectrums.getBuyInCost(), 0.01);
    }

    @Test
    public void canSetDescription(){
        plectrums.setDescription("lost another");
        assertEquals("lost another", plectrums.getDescription());
    }
}
