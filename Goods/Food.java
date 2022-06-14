package Goods;

import Goods.Product;

public class Food extends Product {

    private String expDate;

    public Food(String title, Double price, Integer quantity, String unit, String expDate) {
        super(title, price, quantity, unit);
        this.expDate = expDate;
    }

    @Override
    public String getInfo() {
        return String.format("%s Срок годности: %s | ", super.getInfo(), this.expDate);
    }
}