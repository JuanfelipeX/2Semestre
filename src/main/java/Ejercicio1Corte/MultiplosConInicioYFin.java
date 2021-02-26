
package Ejercicio1Corte;

import java.util.Scanner;

public class MultiplosConInicioYFin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int multiplo=0;
        for(int i=0 ; i<=n;i++){
            if (i%m==0) {
            System.out.println(i);
            }
        }
    }
}
