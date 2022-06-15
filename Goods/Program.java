package Goods;

public class Program {
    public static void main(String[] args) {
        Milk milk = new Milk("молоко", 98.0, 1, "шт", 1.0, 1.5, "13.06.22");
        Limonade l = new Limonade("Лимонад", 54.50, 3, "шт", 0.6);
        Bread bread = new Bread("Бородинский", 23.60, 1, "шт", "20.06.22", "ржаная");
        Eggs e = new Eggs("Яйцо куриное", 98.00, 3, "уп.", "23.06.22", 10);
        Masks masks = new Masks("Маска защитная", 10.00, 1, "шт", 2);
        Paper paper = new Paper("Мягкий знак", 56.30, 1, "уп.", 2, 1);
        Diapers d = new Diapers("Памперс", 2899.00, 1, "уп.", 0, "да", 3,
                6, 10, "Подгузник");
        Pacifier pacifier = new Pacifier("Соска", 99.99, 1, "шт", 0, "да");

        aboutGoods(milk);
        aboutGoods(l);
        aboutGoods(bread);
        aboutGoods(e);
        aboutGoods(masks);
        aboutGoods(paper);
        aboutGoods(d);
        aboutGoods(pacifier);

    }

    public static void aboutGoods(Product p) {
        System.out.println(p);
    }
}