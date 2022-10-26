package ej3.onservices;

public class Circulo extends Figuras {

    private double mRadio;

    public Circulo(double radio) {
        this.mRadio = radio;
    }

    @Override
    public double area() {

        double area = Math.PI * Math.pow(mRadio, 2);
        return area;
    }

    @Override
    public double perimetro() {

        double perimetro = Math.PI * mRadio * 2;

        return perimetro;

    }

}
