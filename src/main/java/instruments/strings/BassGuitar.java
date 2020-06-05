package instruments.strings;

import instruments.Instrument;
import instruments.InstrumentType;

public class BassGuitar extends Instrument{
    public BassGuitar(String model, String make, String colour, InstrumentType type, double buyInCost, double sellingPrice, String description){
        super(model, make, colour, type, buyInCost, sellingPrice, description);
    }

    public String play(){
        return "funky music";
    }
}
