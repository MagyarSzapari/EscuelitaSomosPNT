package com.pnt.escuelitasomospnt;

public class Fruta extends Producto {
    private String unidadDeVenta;

    public Fruta(String nombre, Integer precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Precio: $" + precio.toString()
                + " /// Unidad de venta: " + unidadDeVenta;
    }
    
    @Override
    public int compareTo(Producto p1) {
        Integer resultado = this.getPrecio() - p1.getPrecio();
        
        return resultado;
    }
}
