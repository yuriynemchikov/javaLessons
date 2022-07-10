package Examples.Vector;

public class Program {
    public static void main(String[] args) {
        Vector[] vector = Vector.generateVector(10);
        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[2].scalarProduct(vector[1]));
    }
}
