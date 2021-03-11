package com.morgado.circunferencia;

public class PerimetroCircunferencia {

    public void devolverPerimetro(double radio) {
        double perimetro = 2.0*Math.PI*radio;

        System.out.println("El perimetro de la circunferencia de radio ");
        System.out.println(radio);
        System.out.println(" es ");
        System.out.println(perimetro);
    }

}
