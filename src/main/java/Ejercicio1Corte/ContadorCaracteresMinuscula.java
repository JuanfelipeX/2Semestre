package Ejercicio1Corte;

import java.util.Scanner;

public class ContadorCaracteresMinuscula {
    
    public static void main(String[] args) { 
        Scanner datos = new Scanner (System.in);
        System.out.println(" Ingrese una palabra ");
        String Texto = datos.nextLine();
        int contadorPalabra=Texto.length();
        System.out.println("La palabra tiene " + contadorPalabra + " letras");
        System.out.println(Texto.toLowerCase());
        }
    }