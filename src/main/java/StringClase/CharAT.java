
package StringClase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharAT {   //Devuelve un caracter en especifico, posicion inical 0

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese texto");
         String s1 = br.readLine();
         char [] arregloChar = new char[5];
         System.out.println("la cadena invertida es:");
         for (int cuenta = s1.length()-1; cuenta >= 0; cuenta--) {
             System.out.print( s1.charAt(cuenta));
        }
    } 
}
