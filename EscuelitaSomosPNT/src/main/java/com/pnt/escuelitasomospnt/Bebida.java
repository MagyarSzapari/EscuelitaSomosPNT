package com.pnt.escuelitasomospnt;

public class Bebida extends Producto {
    private Double litros;

    public Bebida(String nombre, Integer precio, Double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Litros: " + litros.toString()
                + " /// Precio: $" + precio.toString();
    }
    
    @Override
    public int compareTo(Producto p1) {
        Integer resultado = this.getPrecio() - p1.getPrecio();
        
        return resultado;
    }
}
