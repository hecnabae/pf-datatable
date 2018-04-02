package es.hecnabae.pf.models;

public class Ingrediente {
    private String nombre;
    private Double cantidad;
    private Double porcentaje;

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

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Ingrediente(String nombre, Double cantidad, Double porcentaje) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.porcentaje = porcentaje;
    }
}
