package org.example;

import java.util.Objects;

public class Ingredientes {
    private String nombre;
    private int cantInv;
    private String descripcion;

    public Ingredientes(String nombre, int cantInv, String descripcion) {
        this.nombre = nombre;
        this.cantInv = cantInv;
        this.descripcion = descripcion;
    }

    public String toString() {
        return "\nNombre de la receta: " + nombre + "\nCantidad: " + cantInv + "\nDescripcion: " + descripcion;
    }

    public void nombreEditar(String nuevoNombre) {
        if (!Objects.equals(nuevoNombre, nombre)) {
            nombre = nuevoNombre;
        }
    }

    public void cantEditar(int cantNue) {
        if (!Objects.equals(cantNue, cantInv)) {
            cantInv = cantNue;
        }
    }

    public void descEditar(String descNue) {
        if (!Objects.equals(descNue, descripcion)) {
            descripcion = descNue;
        }
    }
}
