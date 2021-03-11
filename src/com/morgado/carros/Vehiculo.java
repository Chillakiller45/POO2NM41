package com.morgado.carros;

public class Vehiculo {

    private String matricula;
    private Modelo modelo;
    private String color;
    private double tarifa;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, Modelo modelo, String color, double tarifa) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
