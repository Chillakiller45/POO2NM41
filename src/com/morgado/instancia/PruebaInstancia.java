package com.morgado.instancia;

/*
 * Prueba de uso de this
 */
public class PruebaInstancia {

    private String nombre;

    public PruebaInstancia() {
        this("Miguel Angel Morgado Huerta");
    }

    public PruebaInstancia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
