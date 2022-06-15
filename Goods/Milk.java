package Goods;

import Goods.Drinks;

public class Milk extends Drinks {
    private Double fatContent;
    private String expDate;

    public Milk(String title, Double price, Integer quantity, String unit, Double volume, Double fatContent, String expDate) {
        super(title, price, quantity, unit, volume);
        this.expDate = expDate;
        this.fatContent = fatContent;
    }

    @Override
    public String getInfo() {
        return String.format("%s Процент жирности: %.2f | Срок годности: %s |", super.getInfo(), this.fatContent, this.expDate);
    }
}