package Goods;

import Goods.Food;

public class Bread extends Food {

    private String typeOfFlour;

    public Bread(String title, Double price, Integer quantity, String unit, String expDate, String typeOfFlour) {
        super(title, price, quantity, unit, expDate);
        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String getInfo() {
        return String.format("%s Тип муки: %s", super.getInfo(), this.typeOfFlour);
    }
}