
package Ejercicio1Corte;

import java.util.Scanner;

import java.util.StringTokenizer;

public class ContarPalabrass {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println(" Escriba una frase: ");  
        String Frase =  datos.nextLine();        // Cuidado con el nextLine
        StringTokenizer ContarF = new StringTokenizer(Frase);
        System.out.println("La frase tiene " + ContarF.countTokens() + " palabras");
        System.out.println(Frase.toUpperCase());
        
        
    }
}
