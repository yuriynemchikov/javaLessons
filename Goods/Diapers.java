package Goods;

import Goods.ChildProd;

public class Diapers extends ChildProd{

    private Integer size;
    private Integer minWeight;
    private Integer maxWeight;
    private String type;

    /**
     * @param title
     * @param price
     * @param quantity
     * @param unit
     * @param minAge
     * @param hypoallergenicity
     */
    public Diapers(String title, Double price, Integer quantity, String unit, Integer minAge, String hypoallergenicity,
                   Integer size, Integer minWeight, Integer maxWeight, String type) {
        super(title, price, quantity, unit, minAge, hypoallergenicity);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String getInfo() {
        return String.format("%s Размер: %d | Мин.вес: %d кг | Макс.вес: %d кг | Тип: %s |",
                super.getInfo(), this.size, this.minWeight, this.maxWeight, this.type);
    }
}