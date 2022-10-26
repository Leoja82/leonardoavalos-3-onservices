package ej3.onservices;

public class Rectangulo extends Figuras {

    private double mLongitud;
    private double mAncho;

    public Rectangulo(double longitud, double ancho) {
        this.mLongitud = longitud;
        this.mAncho = ancho;
    }

    @Override
    public double area() {
        double area = mLongitud * mAncho;
        return area;

    }

    @Override
    public double perimetro() {
        double perimetro = 2 * (mLongitud) + 2 * (mAncho);
        return perimetro;

    }

}
