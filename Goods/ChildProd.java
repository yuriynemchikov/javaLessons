package Goods;

import Goods.Product;

/**
 * Класс Детские товары
 */

public class ChildProd extends Product {

    private Integer minAge;// Минимальный возраст
    private String hypoallergenicity; // Гипоаллергенность

    /**
     *
     * @param title
     * @param price
     * @param quantity
     * @param unit
     * @param minAge
     * @param hypoallergenicity
     */

    public ChildProd(String title, Double price, Integer quantity, String unit, Integer minAge, String hypoallergenicity) {
        super(title, price, quantity, unit);
        this.minAge = minAge;
        this.hypoallergenicity = hypoallergenicity;
    }

    @Override
    public String getInfo() {
        return String.format("%s Мин.возраст: %d | Гипоаллергенность: %s | ", super.getInfo(), this.minAge, this.hypoallergenicity);
    }
}