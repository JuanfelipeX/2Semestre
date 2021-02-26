
package Ejercicio1Corte;

import java.util.Scanner;

public class enteroAnombredeMes {
    
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println(" Ingrese el numero del mes(1 Y 12) ");
        int month = datos.nextInt();
        if (month >=1 || month<=12) {
        if (month == 1 ) {
            System.out.println(" Enero");
        } else if (month == 2 ) {
            System.out.println(" Febrero");
        } else if (month == 3 ) {
            System.out.println(" Marzo ");
        }  else if (month == 4 ) {
            System.out.println(" Abril");
        } else if (month == 5 ) {
            System.out.println(" Mayo");
        } else if (month == 6 ) {
            System.out.println(" Junio ");
        }  else if (month == 7 ) {
            System.out.println(" Julio ");
        } else if (month == 8 ) {
            System.out.println(" Agosto ");
        } else if (month == 9 ) {
            System.out.println(" Septiembre ");
        }  else if (month == 10 ) {
            System.out.println(" Octubre ");
        }  else if (month == 11 ) {
            System.out.println(" Noviembre");
        } else if (month == 12 ) {
            System.out.println(" Diciembre");
        }
        } else {
            System.out.println(" Dato mal Ingresado");
        }
    }
}

