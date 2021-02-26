
package ArrayList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Taller4 { 
    public int n;
    private Scanner sc;
    private OfertaLaboral ofertaLaboral;   
    ArrayList<OfertaLaboral> listaOfertas = new ArrayList<>();

    public Taller4() {
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) throws IOException{
        Taller4 menu = new Taller4();
        menu.desplegarMenu();
    }

    private void desplegarMenu() {
        mostrarOpciones();
        System.out.println("Ingrese la opción: ");
        int opcionSeleccionada = Integer.parseInt(sc.nextLine());
        ejecutarOpcion(opcionSeleccionada);
        desplegarMenu();
    }

    private void mostrarOpciones() {
        String cadenaMenu = "\n---Cocina Popular---";
        cadenaMenu += "\n0. Salir.";
        cadenaMenu += "\n1. Añadir oferta.";
        cadenaMenu += "\n2. Eliminar las ofertas que no hayan sido aprobadas.";
        cadenaMenu += "\n3. Consultar ofertas de un area en particular.";
        cadenaMenu += "\n4. Imprimir todas las ofertas.";
        System.out.println(cadenaMenu);
    }

    private void ejecutarOpcion(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("Ingreso la opción: 1 " + "\n" + "Añadir oferta. ");
                anadirOferta();
                break;
            case 2:
                System.out.println("Ingreso la opción: 2 " + "\n" + "Eliminar las ofertas que no hayan sido aprobadas. ");
                eliminarOferta();
                break;
            case 3:
                System.out.println("Ingreso la opción: 3 " + "\n" + "Consultar ofertas de un area en particular. ");
                consultarOferta();
                break;
            case 4:
                System.out.println("Ingreso la opción: 4 " + "\n" + "Imprimir todas las ofertas. ");
                imprimirOferta();
                break;
            default:
                System.out.println("Gracias por utilizer el Sistema.");
        }
    }
    
    private void anadirOferta(){
        System.out.println("Ingrese los datos de la oferta laboral(Nombre,Descripcion,Area,Tipo,) separados por (&)");
        String texto = sc.nextLine();
        String[] dato = texto.split("&");
        String nombre = dato[0];
        String descripcion = dato[1];
        String area = dato[2];
        String tipo = dato[3];
        System.out.println("¿Es aprobado?");
        String aprobado = sc.nextLine();
        if (aprobado.equalsIgnoreCase("si")) {
            OfertaLaboral oferta = new OfertaLaboral(nombre, descripcion, area, tipo, true);
            listaOfertas.add(oferta);
            System.out.println(listaOfertas);
        } else {
            System.out.println("No fue aprobado :c");
            OfertaLaboral oferta = new OfertaLaboral(nombre, descripcion, area, tipo, false);
            listaOfertas.add(oferta);
            System.out.println(listaOfertas);
        }
    }
    
    private void eliminarOferta(){
        for (int i = 0; i < listaOfertas.size(); i++) {
            if (listaOfertas.get(i).isEstado()==false) {
            System.out.println(listaOfertas);
            listaOfertas.clear();
            System.out.println(listaOfertas);
            }
        }
    }
    
    private void consultarOferta(){
        System.out.println("Ingrese el area de consulta");
        String areaBusqueda = sc.nextLine();
        for (int i = 0; i < listaOfertas.size(); i++) {
            if (listaOfertas.get(i).getArea().equalsIgnoreCase(areaBusqueda)) {
                System.out.println(listaOfertas);
            }
        }
    }
    
    private void imprimirOferta(){
        System.out.println(listaOfertas);
                
    }
}









class OfertaLaboral{
    private String nombre;
    private String descripcion;
    private String area;
    private String tipo;
    private boolean estado;

    public OfertaLaboral(String nombre, String descripcion, String area, String tipo, boolean estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.area = area;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getArea() {
        return area;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "OfertaLaboral{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", area=" + area + ", tipo=" + tipo + ", estado=" + estado + '}';
    }
}


/*
Juan&Fix&DataScience&TP
SI

Pipe&Broke&Enginner&TP
No

Jimenez&Candidato&Productor&TC
No
*/