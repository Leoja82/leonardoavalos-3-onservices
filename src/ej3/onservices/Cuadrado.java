package ej3.onservices;

public class Cuadrado extends Figuras {

    private double mLado;

    public Cuadrado(double lado) {
        this.mLado = lado;
    }

    @Override
    public double area() {
        double area = mLado * mLado;
        return area;

    }

    @Override
    public double perimetro() {
        double perimetro = 4 * mLado;
        return perimetro;

    }

}
