package instruments;

public abstract class Instrument {

    private String model;
    private String make;
    private String colour;
    private String type;
    private double buyInCost;
    private double sellingPrice;

    public Instrument(String model, String make, String colour, String type, double buyInCost, double sellingPrice){
        this.model = model;
        this.make = make;
        this.colour = colour;
        this.type = type;
        this.buyInCost = buyInCost;
        this.sellingPrice = sellingPrice;
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

    public String getType() {
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

    public double profitOnProduct(){
        double profit = this.getSellingPrice() - this.getBuyInCost();
        return profit;
    }
}
