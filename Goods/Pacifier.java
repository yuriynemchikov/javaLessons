package Goods;

import Goods.ChildProd;

public class Pacifier extends ChildProd{

    /**
     * @param title
     * @param price
     * @param quantity
     * @param unit
     * @param minAge
     * @param hypoallergenicity
     */
    public Pacifier(String title, Double price, Integer quantity, String unit, Integer minAge, String hypoallergenicity) {
        super(title, price, quantity, unit, minAge, hypoallergenicity);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}