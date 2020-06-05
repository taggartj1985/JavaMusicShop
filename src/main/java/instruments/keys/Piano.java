package instruments.keys;

import instruments.Instrument;
import instruments.InstrumentType;

public class Piano extends Instrument {
    public Piano(String model, String make, String colour, InstrumentType type, double buyInCost, double sellingPrice, String description)
    {
        super(model, make, colour, type, buyInCost, sellingPrice, description);
    }

    public String play(){
        return "Bohemian Rhapsody";
    }

}
