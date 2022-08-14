package Figures;

public class Ball extends Shape{

    public Ball(double radius) {
        super(Math.PI * Math.pow(radius, 3) * 4 / 3);
    }
}
