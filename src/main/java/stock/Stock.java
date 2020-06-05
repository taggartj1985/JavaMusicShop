package stock;

import behaviours.ISell;

public abstract class Stock implements ISell {

    private String description;
    private double buyInCost;
    private double sellingPrice;


    public Stock(String description, double buyInCost, double sellingPrice){
        this.description = description;
        this.buyInCost = buyInCost;
        this.sellingPrice = sellingPrice;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBuyInCost() {
        return buyInCost;
    }

    public void setBuyInCost(double buyInCost) {
        this.buyInCost = buyInCost;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkUp(){
        double profit = this.getSellingPrice() - this.getBuyInCost();
        return profit;
    }


}
