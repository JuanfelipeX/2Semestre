
package Vectores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pastilla_POO {
    
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        Pastilla1 pastillas []= new Pastilla1[3];
        for (int i = 0; i < pastillas.length; i++) {
            System.out.println("Ingrese los datos de la pastila separados  por (&):");
            String texto = br.readLine();
            String [] dato = texto.split("&");
            String marca = dato[0];
            String distribuidor = dato[1];
            int cantidad = Integer.parseInt(dato[2]);
            Pastilla1 pastillaNew = new Pastilla1(marca,distribuidor,cantidad);
            pastillas[i]=pastillaNew;
        }
        for (int i = 0; i < pastillas.length; i++) {
            System.out.println(pastillas[i]);
        }
    } 
}




class Pastilla1{
    private String marca;
    private String distribuidor;
    private int cantidad;

    public Pastilla1(String marca, String distribuidor, int cantidad) {
        this.marca = marca;
        this.distribuidor = distribuidor;
        this.cantidad = cantidad;
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerDistribuidor() {
        return distribuidor;
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Pastilla1{" + "marca=" + marca + ", distribuidor=" + distribuidor + ", cantidad=" + cantidad + '}';
    }
    
    
}