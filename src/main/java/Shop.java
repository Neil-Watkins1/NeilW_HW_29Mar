import Instruments.ISell;

import java.util.ArrayList;

public class Shop {


    private Shop shop;
    private ArrayList<ISell> stock;


    public Shop(){

        this.stock = stock;

    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }
}
