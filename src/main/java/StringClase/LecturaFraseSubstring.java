package StringClase;

import java.util.Scanner;

public class LecturaFraseSubstring {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("por favor ingrese una pequeña frase para usar el substring");
        String frase=sc.nextLine();
        System.out.println("por favor ingrese primero desde que digito quiere que se tome la frase hasta el final");
        int primer=Integer.parseInt(sc.nextLine());
        System.out.println("quedaria "+frase.substring(primer));
        System.out.println("por favor ingrese desde donde quiere comenzar hasta donde quiere terminar");
        int segundo=Integer.parseInt(sc.nextLine());
        int tercera=Integer.parseInt(sc.nextLine());
        System.out.println("quedaria "+frase.substring(segundo, tercera));
    }
}
