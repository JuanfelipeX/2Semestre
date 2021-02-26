package Ejercicio1Corte;


import java.util.Scanner;

public class ClaveDigitadoUsuario {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String user1="" , clave1="";;
        System.out.println("Usuario: ");
        String user = datos.next();
        System.out.println("Clave: ");
        String clave = datos.next();
        do{
            System.out.println("Usuario: ");
            user1=datos.next();
            System.out.println("Clave: ");
            clave1=datos.next();
            if (user1.equals(user) && clave1.equals(clave)) {
                System.out.println("Inicio de sesion correcto. ");
            } else {
                System.out.println("Datos incorrectos");
            }
            
        } while(user1.equals(user)==false && clave1.equals(clave)==false);
    }
}

