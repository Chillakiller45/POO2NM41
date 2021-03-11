package com.morgado.carros;

public class Modelo {

    private String nombre;
    private Marca marca;
    private String fechaSalida;

    public Modelo(String nombre, Marca marca, String fechaSalida) {
        this.nombre = nombre;
        this.marca = marca;
        this.fechaSalida = fechaSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
