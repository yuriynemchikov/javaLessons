package Goods;

public class Program {
    public static void main(String[] args) {
        Food p = new Food("молоко", 98.0, 1, "шт", "2023");

        aboutGoods(p);
    }

    public static void aboutGoods(Product p) {
        System.out.println(p);
    }
}