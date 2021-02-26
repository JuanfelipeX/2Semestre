
package Ejercicio1Corte;


import java.util.Scanner;

public class RepasoProgramacionVelocidad {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        //System.out.println(" Ingrese los metros");
        double metros = datos.nextDouble();
       // System.out.println(" Ingrese los segundos ");
        double segundos = datos.nextDouble();
        double KmH = (metros/segundos)*3.6;
        //KmH = Math.round(KmH * 100);
        //KmH = KmH/100;
        System.out.println(String.format("%.2f", KmH ) + "km/h" );

        //System.out.println(KmH);
       
}
}
