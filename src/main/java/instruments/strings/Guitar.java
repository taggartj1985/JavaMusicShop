package instruments.strings;

import instruments.Instrument;

public class Guitar extends Instrument {
    public Guitar(String model, String make, String colour, String type, double buyInCost, double sellingPrice, String description){
        super(model, make, colour, type, buyInCost, sellingPrice, description);
    }

    public String play(){
        return "Stairway to heaven riff";
    }
}
