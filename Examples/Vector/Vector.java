package Examples.Vector;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class Vector {
    final double x;
    final double y;
    final double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double vectorLength(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalarProduct(Vector vector){
        return (x*vector.x + y*vector.y + z*vector.z);
    }

    public Vector crossProduct(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    // Косинус между двумя векторами
    public double cos(Vector vector) {
        // Для вычисления длины и произведения используются
        //методы multiply и length
        return scalarProduct(vector) / (length() * vector.vectorLength());
    }

    public Vector add(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }

    public Vector subtract(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }

    public static Vector[] generateVector(int n){
        Vector[] vector = new Vector[n];
        for(int i = 0; i < n; i++){
            vector[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vector;
    }

    @Override
    public String toString(){
        return String.format("Vector{x=%.3f, y=%.3f, z=%.3f}", x,y,z);
    }


}
