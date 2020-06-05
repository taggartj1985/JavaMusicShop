package strings;

import instruments.strings.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Jaguar", "Fender", "Black", "String", 400, 600);
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
        assertEquals("String", guitar.getType());
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
        assertEquals(200, guitar.profitOnProduct(), 0.01);
    }
}
