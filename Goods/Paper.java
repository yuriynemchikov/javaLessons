package Goods;

import Goods.Hygiene;

public class Paper extends Hygiene{

    private Integer layers;

    public Paper(String title, Double price, Integer quantity, String unit, Integer amountInPackage, Integer layers) {
        super(title, price, quantity, unit, amountInPackage);
        this.layers = layers;
    }

    @Override
    public String getInfo() {
        return String.format("%s Кол-во слоев: %d", super.getInfo(), this.layers);
    }
}