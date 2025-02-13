package lez1.example;

public class Punto3d extends Punto2d {
    private final int z;

    public Punto3d(int x, int y, int z) {
        super(x, y); //questo per prendere gli attributi dalla sovraclasse
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public double dist(Punto2d other) {
        System.out.println("Metodo di stampa di Punto3D con parametro Punto2D");
        return Math.sqrt(Math.pow(this.getX() - other.getX(), 2) +
                Math.pow(this.getY() - other.getY(), 2));
    }

    public double dist(Punto3d other) {
        System.out.println("Metodo di stampa di Punto3D con parametro Punto3D");
        return Math.sqrt(Math.pow(this.getX() - other.getX(), 2) +
                Math.pow(this.getY() - other.getY(), 2) + Math.pow(this.z - other.z, 2));
    }
}
