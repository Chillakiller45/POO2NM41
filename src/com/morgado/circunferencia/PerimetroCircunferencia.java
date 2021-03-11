package com.morgado.circunferencia;

public class PerimetroCircunferencia {

    public static void main(String[] args) {
        devolverPerimetro();
    }

    public static void devolverPerimetro() {
        final double PI = Math.PI;
        double radio = 25.0;
        double perimetro = 2.0 * PI * radio;

        System.out.println("El perimetro de la circunferencia de radio ");
        System.out.println(radio);
        System.out.println(" es ");
        System.out.println(perimetro);
    }

    public void devolverPerimetro(double radio) {
        double perimetro = 2.0*Math.PI*radio;

        System.out.println("El perimetro de la circunferencia de radio ");
        System.out.println(radio);
        System.out.println(" es ");
        System.out.println(perimetro);
    }

}
