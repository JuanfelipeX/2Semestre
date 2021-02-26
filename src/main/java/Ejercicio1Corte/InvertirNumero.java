package Ejercicio1Corte;


import java.util.Scanner;

public class InvertirNumero {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int inverte=0;
        System.out.println(" Ingrese el numero ");
        int numero = datos.nextInt();
        while(numero>0){
            int resto = numero%10;
            inverte = inverte*10+resto;
            numero /=10;
        }
        System.out.println(" Numero invertido " + inverte);
    }
}
