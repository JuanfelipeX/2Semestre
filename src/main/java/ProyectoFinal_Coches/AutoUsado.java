/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal_Coches;

/**
 *
 * @author Camilo
 */
public class AutoUsado {
            private String marca;
            private String nombre;
            private String placas;
            private int anhioModelo;
            private double  precio;
            private String color ;
            private String nitro;
            private boolean vendido;

    public AutoUsado(String marca, String nombre, String placas, int anhioModelo, double precio, String color, String nitro, boolean vendido) {
        this.marca = marca;
        this.nombre = nombre;
        this.placas = placas;
        this.anhioModelo = anhioModelo;
        this.precio = precio;
        this.color = color;
        this.nitro = nitro;
        this.vendido = vendido;
    }

    
            
    public String mostrarMarca() {
        return marca;
    }

    public String mostrarPlacas() {
        return placas;
    }

    public String mostrarColor() {
        return color;
    }

    public int mostrarAnhioModelo() {
        return anhioModelo;
    }

    public double mostrarPrecio() {
        return precio;
    }

    public String mostrarNitro() {
        return nitro;
    }

    public void modificarColor(String color) {
        this.color=color;
    }

    public void modificarNitro(String nitro) {
        this.nitro = nitro;
    }

    public boolean mostrarVendido() {
        return vendido;
    }

    public void modificarVendido(boolean vendido) {
        this.vendido = vendido;
    }
    

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", nombre=" + nombre + ", placas=" + placas + ", anhioModelo=" + anhioModelo + ", precio=" + precio + ", color=" + color+ ", nitro=" + nitro + '}';
    }
            
            
}