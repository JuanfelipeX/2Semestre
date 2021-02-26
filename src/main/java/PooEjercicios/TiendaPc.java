
package PooEjercicios;

import java.util.Scanner;

public class TiendaPc {
    
    private Scanner sc = new Scanner(System.in);
    private Computador pc1 = new Computador("Razer");
    private Computador pc2 = new Computador("Acer");
    private Computador pc3 = new Computador("AlienWare");
            
    public static void main(String[] args) {
        TiendaPc store = new TiendaPc();
        store.controlMenu();
    }
    
    public void controlMenu(){
        int opcion=0;
        do {
            String menu = "1. Agregar procesador";
            menu += "\n2. Salir ";
            System.out.println(menu);
            System.out.println("Ingrese la opcion: ");
            opcion = Integer.parseInt(sc.nextLine());
            switch(opcion){
                case 1:
                    System.out.println("Ingreso a configurador procesador ");
                    ConfiguracionProcesador();
                    break;
                case 2: 
                    System.exit(0);
                    break;
                default: 
                    System.out.println("Opcion no disponible");
            }
        } while (opcion !=2);
    }
    
    public void ConfiguracionProcesador(){
        System.out.println("Lista Computadores");
        System.out.println("1. " + pc1);
        System.out.println("2. " + pc2);
        System.out.println("3. " + pc3);
        System.out.println("Seleccione un computador");
        int Ncomputador = Integer.parseInt(sc.nextLine());
        System.out.println("Selecciones referencia y velocidad separados por &");
         String texto = sc.nextLine();
         String [] dato = texto.split("&");
         String referencia = dato[0];
         int velocidad = Integer.parseInt(dato[1]);
        switch(Ncomputador){
            case 1:
                pc1.setProcesador(new Procesador(referencia, velocidad));
                System.out.println("Pc 1: " +  pc1);
                break;
            case 2:
                Procesador nuevoProcesador = new Procesador();
                nuevoProcesador.getReferencia();
                nuevoProcesador.setVelocidad(velocidad);
                pc2.setProcesador(nuevoProcesador);
                System.out.println("Pc 2: " + pc2);
                break;
            case 3:
                pc3.setProcesador(new Procesador(referencia, velocidad));
                System.out.println("Pc 3: " + pc3);
                break;
            default:
                System.out.println("Computador mal digitado");
        }
    }
} 









class Computador {
    private String marca;
    private Procesador Procesador;

    public Computador(String marca) {
        this.marca = marca;
    }

    
    public String getMarca() {
        return marca;
    }
    

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

    public Procesador getProcesador() {
        return Procesador;
    }
    

    public void setProcesador(Procesador Procesador) {
        this.Procesador = Procesador;
    }

    
    @Override
    public String toString() {
        return "Computador{" + "marca=" + marca + ", Procesador=" + Procesador + '}';
    }
}








class Procesador {
    private String referencia;
    private int Velocidad;

    public Procesador(String referencia, int Velocidad) {
        this.referencia = referencia;
        this.Velocidad = Velocidad;
    }
    
    public Procesador(){
    }

    public String getReferencia() {
        return referencia;
    }
    
    

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    

    public double getVelocidad() {
        return Velocidad;
    }

    
    
    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }
    
    

    @Override
    public String toString() {
        return "Procesador{" + "referencia=" + referencia + ", Velocidad=" + Velocidad + '}';
    }
}
 
