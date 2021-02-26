
package Ejercicio1Corte;

import java.util.Scanner;

public class NotaEstudiante {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println(" Ingrese el nombre de la materia ");
        String asignatura = datos.nextLine();
        System.out.println(" Ingrese el nombre del estudiante  ");
        String nombre = datos.nextLine();
        System.out.println(" Ingrese la nota del estudiante  ");
        int Nota = datos.nextInt();
        if (Nota<3) {
            System.out.println(" Nota insuficiente ");
        } if ( Nota>=3 && Nota<5) {
            System.out.println(" Nota Regular ");
        } if (Nota>=5 && Nota<7) {
            System.out.println(" Nota buena ");
        }  if (Nota>=7 && Nota<10) {
            System.out.println(" Nota excelente");
        }
        System.out.println(" El estudiante " + nombre + " De la asignatura " + asignatura + " Obtuvo la nota " + Nota);
    }
    
}
