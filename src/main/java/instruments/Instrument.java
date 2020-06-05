package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements ISell, IPlay {

    private String model;
    private String make;
    private String colour;
    private InstrumentType type;
    private double buyInCost;
    private double sellingPrice;
    private String description;

    public Instrument(String model, String make, String colour, InstrumentType type, double buyInCost, double sellingPrice, String description){
        this.model = model;
        this.make = make;
        this.colour = colour;
        this.type = type;
        this.buyInCost = buyInCost;
        this.sellingPrice = sellingPrice;
        this.description = description;
    }

    public String getModel() {
        return this.model;
    }

    public String getMake() {
        return this.make;
    }

    public String getColour() {
        return this.colour;
    }

    public InstrumentType getType() {
        return this.type;
    }

    public double getBuyInCost() {
        return this.buyInCost;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setBuyInCost(double buyInCost) {
        this.buyInCost = buyInCost;
    }

    public double calculateMarkUp(){
        double profit = this.getSellingPrice() - this.getBuyInCost();
        return profit;
    }

    public String getDescription() {
        return description;
    }
}
