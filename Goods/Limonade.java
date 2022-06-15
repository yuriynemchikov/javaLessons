package Goods;

import Goods.Drinks;

public class Limonade extends Drinks {

    public Limonade(String title, Double price, Integer quantity, String unit, Double volume) {
        super(title, price, quantity, unit, volume);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
