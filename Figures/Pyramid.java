package Figures;

public class Pyramid extends Shape{

    private double s;
    private double h;

    public Pyramid(double h, double s) {
        super(h*s*4/3);
        this.s = s;
        this.h = h;
    }
}
