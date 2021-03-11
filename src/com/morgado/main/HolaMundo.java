package com.morgado.main;

import com.morgado.circunferencia.PerimetroCircunferencia;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        PerimetroCircunferencia perimetroCircunferencia = new PerimetroCircunferencia();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el radio:");
        double radio = scanner.nextDouble();

        perimetroCircunferencia.devolverPerimetro(radio);
    }

}
