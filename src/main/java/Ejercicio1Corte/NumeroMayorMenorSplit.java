package Ejercicio1Corte;




import java.util.Scanner;


public class NumeroMayorMenorSplit {

    public static void main(String[] args) {
        Scanner datos =  new Scanner(System.in);
        System.out.println(" Ingrese dos datos separados por(&): ");
        String numer = datos.nextLine();
        String [] Separador = numer.split("&");
        int Number1 = Integer.parseInt(Separador[1]);     
        int Number2 = Integer.parseInt(Separador[1]);          
        /*if (Number1<Number2) {
            System.out.println(" numero mayor " + Number2);
            System.out.println(" numero Menor " + Number1);
        } else {
            System.out.println(" numero mayor " + Number1);
            System.out.println(" numero Menor " + Number2);
        }*/
        String mensaje = (Number1<Number2) ? "Numnero mayor " + Number2: "Numero Mayor " + Number1;  //? es usado para if else metodo melo
        System.out.println(mensaje);
    }
}
