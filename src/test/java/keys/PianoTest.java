package keys;

import instruments.InstrumentType;
import instruments.keys.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("1234", "Yamaha", "Black", InstrumentType.KEYS, 400, 1000, "Grand Piano");
    }

    @Test
    public void canGetModel() {
        assertEquals("1234", piano.getModel());
    }

    @Test
    public void canGetMake() {
        assertEquals("Yamaha", piano.getMake());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.KEYS, piano.getType());
    }

    @Test
    public void canGetBuyInPrice() {
        assertEquals(400, piano.getBuyInCost(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(1000, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetProfit(){
        assertEquals(600, piano.calculateMarkUp(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Bohemian Rhapsody", piano.play());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Grand Piano", piano.getDescription());
    }


}
