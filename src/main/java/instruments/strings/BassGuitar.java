package instruments.strings;

import instruments.Instrument;

public class BassGuitar extends Instrument{
    public BassGuitar(String model, String make, String colour, String type, double buyInCost, double sellingPrice, String description){
        super(model, make, colour, type, buyInCost, sellingPrice, description);
    }

    public String play(){
        return "funky music";
    }
}
