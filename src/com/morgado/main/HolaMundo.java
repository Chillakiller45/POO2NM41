package com.morgado.main;

import com.morgado.carros.Marca;
import com.morgado.carros.Modelo;
import com.morgado.carros.Vehiculo;
import com.morgado.circunferencia.PerimetroCircunferencia;
import com.morgado.instancia.PruebaInstancia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println(" ");
        System.out.println("Mundo");

        Marca nissan = new Marca("Nissan");
        Marca vw = new Marca("Volkswagen");

        Modelo march = new Modelo("March", nissan,"2016");
        Modelo vento = new Modelo("Vento", vw,"2021");
        Modelo golf = new Modelo("Golf", vw,"2018");


        Vehiculo vehiculo1 = new Vehiculo("ABS-89", march, "Rojo",100.0);
        Vehiculo vehiculo2 = new Vehiculo("ABC-4D9", vento, "Negro",250.0);
        Vehiculo vehiculo3 = new Vehiculo("XJT-8569", golf, "Blanco",89.0);

        List<Vehiculo> vehiculos = Arrays.asList(vehiculo1,vehiculo2,vehiculo3);

        vehiculos.forEach((v) -> {
            System.out.println("Matricula: " + v.getMatricula());
            System.out.println("Marca: " + v.getModelo().getMarca().getNombre());
            System.out.println("Modelo y Año: " + v.getModelo().getNombre() + " " + v.getModelo().getFechaSalida());
            System.out.println("Color: " + v.getColor());
            System.out.println("Tarífa: " + v.getTarifa());
            System.out.println("");
        });

    }

}
