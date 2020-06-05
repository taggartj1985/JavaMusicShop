package strings;

import instruments.InstrumentType;
import instruments.strings.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Jaguar", "Fender", "Black", InstrumentType.STRING, 400, 600, "Mighty Fine Guitar");
    }

    @Test
    public void canGetModel() {
        assertEquals("Jaguar", guitar.getModel());
    }

    @Test
    public void canGetMake() {
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void canGetBuyInPrice() {
        assertEquals(400, guitar.getBuyInCost(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(600, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetProfit(){
        assertEquals(200, guitar.calculateMarkUp(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Stairway to heaven riff", guitar.play());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Mighty Fine Guitar", guitar.getDescription());
    }


}
