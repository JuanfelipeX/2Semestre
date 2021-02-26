
package Ejercicio1Corte;

import java.util.Scanner;

public class AyudaInstitucion {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println(" Ingrese la cantidad de profesor por cada 20 estudiantes ");
        double profesor = datos.nextInt();
        System.out.println(" cuantos profesores han acreditado algún curso o diplomado en temas educativos");
        double acredito = datos.nextInt();
        double calculo = ((1/profesor)*100)*(acredito);
        System.out.println(" La institucion ha quedado entre los 30 primeros puestos de la prueba saber del estado ");
        String puesto = datos.next();
        if (puesto.equalsIgnoreCase("si")) {
        }
        System.out.println(" Ingrese los titulos de la biblioteca ");
        int titulos = datos.nextInt();
        if (profesor>=1 && titulos>=100 && calculo>=80) {
        System.out.println(" La institucion es cantidad a recibir ayuda");
        } else {
            System.out.println(" La institucion no es candidata a recibir ayuda");
    }
    }
}
