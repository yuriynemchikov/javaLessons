package Goods;

public class Product {

    private String title;
    private Double price;
    private Integer quantity;
    private String unit;

    public Product(String title, Double price, Integer quantity, String unit) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }


    public String getInfo() {
        return String.format("Название товара: %s | Цена: %.2f | Количество: %d | Единица измерения: %s | ",
                this.title, this.price, this.quantity, this.unit);
    }

    @Override
    public String toString() {
        return this.getInfo();
    }


}