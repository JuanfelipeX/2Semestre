package ProyectoFinal_Coches;

import java.io.BufferedWriter;
import java.util.Scanner;

public class Menu {

    //Atributos de la clase
    private Scanner sc;
    private Consesionario consesionario;

    //Constructor de la clase
    public Menu() {
        sc = new Scanner(System.in);
        consesionario = new Consesionario();
    }//Cierra constructor

    public static void main(String[] args) {
        Menu menu = new Menu(); //objeto para acceder a los métodos de esta misma clase
        menu.desplegarMenu();
    }//cierra main

    public void desplegarMenu() {
        mostrarOpciones();
        System.out.print("Seleccione una opción: ");
        int opcionSeleccionada = Integer.parseInt(sc.nextLine());
        ejecutarOpcion(opcionSeleccionada);
        desplegarMenu(); //llamada recursiva
    }//cierra desplegarMenu

    private void mostrarOpciones() {
        String cadenaMenu = "\n Cocesionario Don Pipe y Don Cristian.";
        cadenaMenu += "\n1. Comprar vehiculo.";
        cadenaMenu += "\n2. Modificar vehiculo.";
        cadenaMenu += "\n3. Salir del Cocesionario.";

        System.out.println(cadenaMenu);
    }//cierra mostrarOpciones

    private void ejecutarOpcion(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 1:
                //instrucciones para la opción 1
                System.out.println("Ingresó a la opción 1: Comprar vehiculo");
                comprarAuto();
                break;
            case 2:
                System.out.println("Ingresó a la opción 2: Modificar vehiculo");
                modificarAuto();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Ingrese la opcion de nuevo.");

        }
    }//Cierra ejecutarOpcion

    public void comprarAuto() {
        System.out.println("REGISTRO");
        System.out.println("Porfavor ingrese los siguientes datos para registrarse. Ingrese los ingrdientes separados po &:");
        System.out.println("Numero de identificacion-Nombre-Edad-Presupuesto");
        String entrada = sc.nextLine();
        String[] datos = entrada.split("&");
        if (datos.length == 4) {
            int identificacion = Integer.parseInt(datos[0]);
            String nombre = datos[1];
            int edad = Integer.parseInt(datos[2]);
            int presupuesto = Integer.parseInt(datos[3]);
            if (edad < 18) {
                System.out.println("debe ser mayor de edad para comprar un auto");
            } else {
                consesionario.ingresarClienta(identificacion, edad, nombre, presupuesto);
            }
        } else {
            System.out.println("formato incorrecto porfavor ingrese de nuevo los datos");
            comprarAuto();
        }
    }

    public void modificarAuto() {
        System.out.println("Porfavor ingrese su numero de identificacion para modificar su vehiculo");
        int identificacion = Integer.parseInt(sc.nextLine());
        consesionario.modificarVehiculo(identificacion);
    }
}//Cierra class

