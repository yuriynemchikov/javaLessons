package Goods;

import Goods.Product;

public class Drinks extends Product {

    private Double volume;

    public Drinks(String title, Double price, Integer quantity, String unit, Double volume) {
        super(title, price, quantity, unit);
        this.volume = volume;
    }

    @Override
    public String getInfo() {
        return String.format("%s Объем: %.2f |", super.getInfo(), this.volume);
    }
}