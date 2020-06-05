package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public void addStock(ISell stockItem){
        this.stock.add(stockItem);
    }

    public void removeStock(ISell stockItem){
        this.stock.remove(stockItem);
    }

    public double calculateAllStockProfit(){
        double total = 0;
        for(ISell stockItem:this.stock){
            total += stockItem.calculateMarkUp();
        }
        return total;
    }


}
