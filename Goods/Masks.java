package Goods;

import Goods.Hygiene;

public class Masks extends Hygiene {

    public Masks(String title, Double price, Integer quantity, String unit, Integer amountInPackage) {
        super(title, price, quantity, unit, amountInPackage);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}