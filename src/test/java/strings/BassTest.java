package strings;

import instruments.strings.BassGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassTest {
    BassGuitar bass;

    @Before
    public void before(){
        bass = new BassGuitar("Jazz", "Fender", "Black", "String", 250, 450);
    }

    @Test
    public void canGetModel() {
        assertEquals("Jazz", bass.getModel());
    }

    @Test
    public void canGetMake() {
        assertEquals("Fender", bass.getMake());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", bass.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals("String", bass.getType());
    }

    @Test
    public void canGetBuyInPrice() {
        assertEquals(250, bass.getBuyInCost(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(450, bass.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetProfit(){
        assertEquals(200, bass.profitOnProduct(), 0.01);
    }
}
