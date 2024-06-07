package com.pnt.escuelitasomospnt;

public class CosmeticaEHigiene extends Producto {
    private Integer contenido;

    public CosmeticaEHigiene(String nombre, Integer precio, Integer contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public Integer getContenido() {
        return contenido;
    }

    public void setContenido(Integer contenido) {
        this.contenido = contenido;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Contenido: " + contenido.toString()
                + "ml /// Precio: $" + precio.toString();
    }
    
    @Override
    public int compareTo(Producto p1) {
        Integer resultado = this.getPrecio() - p1.getPrecio();
        
        return resultado;
    }
}
