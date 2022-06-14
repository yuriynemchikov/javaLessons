package Goods;

import Goods.Product;

public class Hygiene extends Product {

    private Integer amountInPackage;

    public Hygiene(String title, Double price, Integer quantity, String unit, Integer amountInPackage) {
        super(title, price, quantity, unit);
        this.amountInPackage = amountInPackage;
    }

    @Override
    public String getInfo() {
        return String.format("%s Количество в упаковке: %d | ", super.getInfo(), this.amountInPackage);
    }
}