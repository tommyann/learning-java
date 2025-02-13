package lez1.example;

import java.util.Objects;

public class Punto2d {
    private final int x;
    private final int y;

    //CONSTRUCTOR
    public Punto2d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //GETTERS
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    //METHODS
    public double dist(Punto2d other) {
        System.out.println("metodo dist di Punto2D con parametro Punto2D");
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        Punto2d punto2d = (Punto2d) obj;
        return(this.x == punto2d.x && this.y == punto2d.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
