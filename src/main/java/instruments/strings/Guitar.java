package instruments.strings;

import instruments.Instrument;
import instruments.InstrumentType;

public class Guitar extends Instrument {
    public Guitar(String model, String make, String colour, InstrumentType type, double buyInCost, double sellingPrice, String description){
        super(model, make, colour, type, buyInCost, sellingPrice, description);
    }

    public String play(){
        return "Stairway to heaven riff";
    }
}
