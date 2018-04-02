package es.hecnabae.pf.models;

import java.util.List;

public class Receta {
    private String nombre;
    private Double cantidad;
    private List<Ingrediente> ingredientes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Receta(String nombre, Double cantidad, List<Ingrediente> ingredientes) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.ingredientes = ingredientes;
    }
}
