package Figures;

public class Program {
    public static void main(String[] args) {
        Ball ball = new Ball(5.2);
        Cylinder cylinder = new Cylinder(2,4);
        Pyramid pyramid = new Pyramid(6, 12);
        Pyramid pyramid2 = new Pyramid(7, 20);
        Pyramid pyramid3 = new Pyramid(8, 13);



        Box box = new Box(1000);

        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
        System.out.println(box.add(pyramid2));
        System.out.println(box.add(pyramid3));

    }
}
