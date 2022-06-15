package Goods;

public class Eggs extends Food{

    private Integer inPack;

    public Eggs(String title, Double price, Integer quantity, String unit, String expDate, Integer inPack) {
        super(title, price, quantity, unit, expDate);
        this.inPack = inPack;
    }

    @Override
    public String getInfo() {
        return String.format("%s Кол-во в упаковке: %d", super.getInfo(), this.inPack);
    }
}