
package Ejercicio1Corte;

import java.util.Scanner;

public class Abecedario {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println(" ¿Cuantas letras quiere mostrar?: ");
        int letra = datos.nextInt();
        int letras= letra+65;
        System.out.println(" ¿Quiere que las letras se muestren en mayuscula(SI/NO)?");
        String mayu = datos.next();
        if (mayu.equals("SI")) {
           for (char i = 65; i < letras; i++) {
              System.out.println(i);
           }
        } if(mayu.equals("NO")) {
            int letrasN = letra+97;
            for (char i = 97; i < letrasN; i++) {
              System.out.println(i);
            }   
        }
    } 
}
