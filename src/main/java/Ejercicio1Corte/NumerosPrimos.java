
package Ejercicio1Corte;

import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println(" Ingrese un numero ");
        int num = datos.nextInt();
        int numero = num-1;
        while((num % numero)!=0){
            numero--;
        }
        if (numero==1) {
            System.out.println("Primo ");
        } else {
            System.out.println("No-Primo");
        }
    }
}
