package Libreria_Poo_vectores;

import java.util.Scanner;

public class Libreria {

    //Atributos de la clase
    private Scanner sc;
    private Libro[] libros = new Libro[3];//1 original

    //Constructor de la clase
    public Libreria() {
        sc = new Scanner(System.in);
    }//Cierra constructor

    public static void main(String[] args) {
        Libreria menu = new Libreria(); //objeto para acceder a los métodos de esta misma clase
        menu.desplegarMenu();
    }

    public void desplegarMenu() {
        mostrarOpciones();
        System.out.print("Seleccione una opción: ");
        int opcionSeleccionada = Integer.parseInt(sc.nextLine());
        ejecutarOpcion(opcionSeleccionada);
        desplegarMenu();
    }
    

    private void mostrarOpciones() {
        String cadenaMenu = "\nMenu de usuario.";
        cadenaMenu += "\n1. Agregar libro.";        
        cadenaMenu += "\n2. Agregar unidades a un libro.";
        cadenaMenu += "\n3. Retirar libro.";        
        cadenaMenu += "\n4. Cambiar libro de posición.";
        cadenaMenu += "\n5. Vender libro.";        
        cadenaMenu += "\n6. Salir.";
        cadenaMenu += "\n7. datos generales.";

        System.out.println(cadenaMenu);
    }

    private void ejecutarOpcion(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 1:
                System.out.println("Ingresó a la opción 1: Agregar libro");
                agregarLibro();
               // System.out.println(consultarTodosLosLibros());
                break;
            case 2:
                System.out.println("Ingresó a la opción 2: Agregar unidades a un libro.");
                agregarUnidadesLibro();
                break;
            case 3:
                System.out.println("Ingresó a la opción 3: Retirar libro");
                retirarLibro();
                break;
            case 4:
                System.out.println("Ingresó a la opción 4: Cambiar libro de posición");
                cambiarLibroPosicion();
                break;
            case 5:
                System.out.println("Ingresó a la opción 5: Vender libro");
                venderLibro();
                break;
            case 6:
                System.exit(0);
                break;
            case 7: 
                System.out.println(consultarTodosLosLibros());
                break;
            default:
                System.out.println("Gracias por utilizer el Sistema.");

        }
    }

    public String consultarTodosLosLibros() {
        String resultado = "";
        resultado += "\nLibros:";
        for (int i = 0; i < libros.length; i++) {
            resultado += "\n" + (i + 1) + ". ";
            if (libros[i] == null) {
                resultado += "Espacio disponible.";
            } else {
                resultado += libros[i];
            }
        }
        return resultado;
    }

    public void agregarLibro() {
        System.out.println("Ingrese los datos separados por & (isbn, titulo, precio):");
        String entrada = sc.nextLine();
        String[] dato = entrada.split("&");
        String isbn = dato[0];
        String titulo = dato[1];
        double precio = Double.parseDouble(dato[2]);
        Libro libroNuevo = new Libro(isbn, titulo, precio); //objeto de tipo Libro
        int nuevaCantidadDisponible = libroNuevo.getCantidadDisponible() + 1; //se le suma 1
        libroNuevo.setCantidadDisponible(nuevaCantidadDisponible);
        if (libros[0] == null) {
            libros[0] = libroNuevo;
        } else {
            Libro[] librosAuxiliar = new Libro[libros.length + 1];
            librosAuxiliar[librosAuxiliar.length - 1] = libroNuevo;   // el -1 trae a las  posiciones
            for (int i = 0; i < libros.length; i++) {
                librosAuxiliar[i] = libros[i];
            }
            libros = librosAuxiliar;  // guarda copia
        }

        System.out.println("Se agregó el libro: \n" + libroNuevo);
    }

    public void agregarUnidadesLibro() {
        System.out.println(consultarTodosLosLibros());
        System.out.println("Ingrese los datos separados por & (libro&unidades):");
        String texto = sc.nextLine();
        String [] dato = texto.split("&");
        int posicionLibro = Integer.parseInt(dato[0]) -1 ;   // se resta 1 para que se vea mejor  en la salida en el arreglo
        int unidades = Integer.parseInt(dato[1]);
        if (posicionLibro>=0 && posicionLibro<libros.length) {
            if (unidades<=0) {
                System.out.println("Las unidades a ingresar deben ser mayores o iguales a 0 ");
            } else {
                int totalUnidades = libros[posicionLibro].getCantidadDisponible() + unidades;
                libros[posicionLibro].setCantidadDisponible(totalUnidades);
                System.out.println("se agregaron " + unidades + " unidades al libro " + posicionLibro + ":");
                System.out.println(consultarTodosLosLibros());
            }
        }else {
            System.out.println("La posicion del texto no existe");
        }
    }
    
    public void retirarLibro() {
        System.out.println(consultarTodosLosLibros());
        System.out.println("Ingrese el número de libro que desea retirar:");
        int posicionLibro = Integer.parseInt(sc.nextLine()) -1 ;
         if (posicionLibro>=0 &&  posicionLibro<libros.length && libros[posicionLibro] != null) {
            libros[posicionLibro] = null;
            System.out.println("Se retiró el libro " + (posicionLibro+1) + ":");
            System.out.println(consultarTodosLosLibros());
         } else {
             System.out.println("No se puede retirar el libro porque no existe.");
         }         
    }
    
    
    public void cambiarLibroPosicion() {
        System.out.println(consultarTodosLosLibros());
        System.out.println("Ingrese los datos separados por & (libro a cambiar, nuevo espacio):");
        String texto = sc.nextLine();
         String [] dato = texto.split("&");
         int posicionLibro = Integer.parseInt(dato[0]) -1 ;
         int espacioCambio = Integer.parseInt(dato[1]) -1;
         if (libros[espacioCambio] == null) {
             Libro libroEnEspacioDeCambio = libros[espacioCambio];
             libros[espacioCambio] = libros[posicionLibro];
             libros[posicionLibro] = libroEnEspacioDeCambio;
        } else {
             System.out.println("No se puede mover el libro porque el espacio está ocupado.");
         } 
    }
    
    public void venderLibro() {  
         System.out.println("Ingrese los datos separados por & (libro, cantidad a comprar):");
         String texto = sc.nextLine();
         String [] dato = texto.split("&");
         int posicionLibro = Integer.parseInt(dato[0]) -1 ;
         int cantidadComprar = Integer.parseInt(dato[1]);
         if (posicionLibro<= 0 && posicionLibro<libros.length) {
            if (cantidadComprar > 0 && cantidadComprar <= libros[posicionLibro].getCantidadDisponible()) { 
                 int unidadLibros = libros[posicionLibro].getCantidadDisponible() - cantidadComprar;
                 libros[posicionLibro].setCantidadDisponible(unidadLibros);
                 System.out.println(consultarTodosLosLibros());
            } else {
             System.out.println("La cantidad no es correcta.");
            }
         } else {
             System.out.println("El libro seleccionado no existe ");
         }
    }
}   




//1. ABC123&La odisea&45000  DFW1&Matrix&23
//2. 3&1  ne  ,   2&-5 (>0)   ,   2&10 nice
//3. 1 nice  ,  1 no se puede ya no existe
//4. 2&1  nice   ,  2&3 busy
//5. 
