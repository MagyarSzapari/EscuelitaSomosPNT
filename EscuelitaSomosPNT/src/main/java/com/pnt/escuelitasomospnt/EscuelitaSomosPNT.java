/*
 * @Autor: MagyarSzapari
 */

package com.pnt.escuelitasomospnt;

import java.util.ArrayList;
import java.util.Collections;

public class EscuelitaSomosPNT {

    public static void main(String[] args) {
        //Creo los productos solicitados.
        Bebida cocaColaZero = new Bebida("Coca-Cola Zero", 20, 1.5);
        Bebida cocaCola = new Bebida("Coca-Cola", 18, 1.5);
        CosmeticaEHigiene shampooSedal = new CosmeticaEHigiene("Shampoo Sedal", 19, 500);
        Fruta frutillas = new Fruta("Frutillas", 64, "kilo");
        
        //Creo la lista de productos y los agrego.
        ArrayList<Producto> productosSolicitados = new ArrayList<>();
        productosSolicitados.add(cocaColaZero);
        productosSolicitados.add(cocaCola);
        productosSolicitados.add(shampooSedal);
        productosSolicitados.add(frutillas);
        
        //Obtengo el producto más caro.
        Producto productoMasCaro = Collections.max(productosSolicitados);
        //Obtengo el producto más barato.
        Producto productoMasBarato = Collections.min(productosSolicitados);
        
        //Muestro lo solicitado de la forma pedida.
        for (Producto producto : productosSolicitados) {
            System.out.println(producto);
        }
        System.out.println("=============================");
        System.out.println("Producto mas caro: " + productoMasCaro.getNombre());
        System.out.println("Producto mas barato: " + productoMasBarato.getNombre());
    }
}
