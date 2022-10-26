package ej3.onservices;

import java.util.Scanner;

public class Ej3Onservices {

    public static void main(String[] args) {
        System.out.println("Menú:  \n");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3.Cuadrado");
        System.out.println("Indica tu selección:");

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Indica el radio:");
                double radio = sc.nextDouble();
                Circulo circulo = new Circulo(radio);
                System.out.println("El área del circulo es: " + circulo.area());
                System.out.println("El perímetro del circulo es: " + circulo.perimetro());
                break;

            case 2:
                System.out.println("Indica la longitud:");
                double longitud = sc.nextDouble();
                System.out.println("Indica el ancho;");
                double ancho = sc.nextDouble();
                Rectangulo rectangulo = new Rectangulo(longitud, ancho);
                System.out.println("El área del rectángulo es: " + rectangulo.area());
                System.out.println("El perímetro del rectángulo es: " + rectangulo.perimetro());

                break;
            case 3:
                System.out.println("Indica el lado:");
                double lado = sc.nextDouble();

                Cuadrado cuadrado = new Cuadrado(lado);
                System.out.println("El área del cuadrado es: " + cuadrado.area());
                System.out.println("El perímetro del cuadrado es: " + cuadrado.perimetro());
                break;

        }
    }

}
