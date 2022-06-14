package Goods;

import Goods.Product;

/**
 * Класс Детские товары
 */

public class ChildProd extends Product {

    private Integer minAge; // Минимальный возраст

    /**
     *
     * @param title
     * @param price
     * @param quantity
     * @param unit
     * @param minAge
     */

    public ChildProd(String title, Double price, Integer quantity, String unit, Integer minAge) {
        super(title, price, quantity, unit);
        this.minAge = minAge;
    }

    @Override
    public String getInfo() {
        return String.format("%s Мин.возраст: %d | ", super.getInfo(), this.minAge);
    }
}