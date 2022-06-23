package com.example.map2.Entidades;

public class Ubicacion {
    private String nombre;
    private int numImagen;

    public Ubicacion(String nombre, int numImagen) {
        this.nombre = nombre;
        this.numImagen = numImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getNumImagen() {
        return numImagen;
    }

    public void setNumImagen(int numImagen) {
        this.numImagen = numImagen;
    }
}
