package Accessories;

import Instruments.ISell;

public abstract class Accessories implements ISell {


    private Accessories accessories;
    private double costPrice;
    private double retailPrice;



    public Accessories(double costPrice, double retailPrice){

        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }




    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public double sell() {
        return this.getRetailPrice() - this.getCostPrice();

    }


}
