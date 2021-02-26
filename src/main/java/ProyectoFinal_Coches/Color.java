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
public class Color {
    private String color;
    private int precio;

    public Color(String color, int precio) {
        this.color = color;
        this.precio = precio;
    }

    public String mostrarColor() {
        return color;
    }

    public int mostratPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Color{" + "color=" + color + ", precio=" + precio + '}';
    }
    
    
}
