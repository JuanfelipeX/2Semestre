package Ejercicio1Corte;


import java.util.Scanner;

public class NombreYnotaseparadosporSIGNO {
    
    public static void main(String[] args) {
        Scanner datos =  new Scanner(System.in);
        System.out.println(" Ingrese nombre y nota (10-50) separados por &  ");
        String NameYNote = datos.nextLine();
        String [] Separador = NameYNote.split("&");           // s.plit se usa para separar 
        String Nombre = Separador[1];                         // se indica en donde se guarda variable
        int Nota = Integer.parseInt(Separador[1]);            // Se indica donde se guarda la variable
        if ((Nota>=0) && (Nota<=50)) {
        if (Nota>=30){
            System.out.println( Nombre + " Examen Aprobado "); 
        }else {
            System.out.println(Nombre + " Examen reprobado");
        }
        } else {
            System.out.println(Nombre + " Nota incorrecta");
        }
    }
}
