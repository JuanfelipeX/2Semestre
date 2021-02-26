package PooEjercicios;

import java.util.Scanner;

public class SustentacionJuanFelipeJimenezP {   //Todas las clases estan aqui falta el 8 xd y Este es Proyecto 1

    private Scanner sc;  
    private CentroVideoJuegos centroVideoJuegos;
    
    public SustentacionJuanFelipeJimenezP () {          
        sc = new Scanner(System.in);
        centroVideoJuegos = new CentroVideoJuegos();
    }
    
    
    public static void main(String[] args) {
        SustentacionJuanFelipeJimenezP menu = new SustentacionJuanFelipeJimenezP (); 
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
        String cadenaMenu = "\n---Centro de Videojuegos---";
        cadenaMenu += "\n0. Salir.";
        cadenaMenu += "\n1. Asignar jugador a estación.";
        cadenaMenu += "\n2. Agregar tiempo a jugador.";
        cadenaMenu += "\n3. Cambiar jugador de estación.";
        cadenaMenu += "\n4. Registrar salida de jugador.";
        cadenaMenu += "\n5. Mostrar ingresos totales.";
        cadenaMenu += "\n6. Mostrar centro de videojuegos.";
        cadenaMenu += "\n7. Jugador con mayor tiempo.";
        cadenaMenu += "\n8. Mostrar cantidad total de jugadores.";
        System.out.println(cadenaMenu);
    }
    

    private void ejecutarOpcion(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("Ingreso la opción: 1 " + "\n" + "Agregar jugador a estación ");
                ingresarJugador();
                break;
            case 2:
                System.out.println("Ingreso la opción: 2 " + "\n" + "Agregar tiempo a jugador ");
                agregarTiempoAJugador();
                break;
            case 3:
                System.out.println("Ingreso la opción: 3 " + "\n" + "Cambiar jugador de estación ");
                cambiarJugadorDeEstacion();
                break;
            case 4:
                System.out.println("Ingreso la opción: 4 " + "\n" + "Registrar salida de jugador ");
                registrarSalidaJugador();
                break;
            case 5:
                System.out.println("Ingreso la opción: 5 " + "\n" + "Mostrar ingresos del centro de videojuegos ");
                consultarIngresosTotales();
                break;
            case 6:
                System.out.println("Ingreso la opción: 6 " + "\n" + "Mostrar centro de videojuegos ");
                mostrarCentroVideoJuegos();
                break;
            case 7:
                System.out.println("Ingreso la opción: 7 " + "\n" + "Jugador con mayor tiempo ");
                jugadorConTiempoMayor();
                break;
            case 8: 
                System.out.println("Ingreso la opción: 8 " + "\n" + "Mostrar cantidad total de jugadores. ");
                mostrarCantdidadJugadores();
                break;
            default:
                System.out.println("Gracias por utilizer el Sistema.");

        }
    }
    
    
    private void ingresarJugador(){
        System.out.println("Ingrese los datos separados por &: ");
        String texto = sc.nextLine();
        String [] dato = texto.split("&");
        int idEstacion = Integer.parseInt(dato[0]);
        int identificacion = Integer.parseInt(dato[1]);
        String nombre = dato[2];
        String fecha = dato[3];
        if (centroVideoJuegos.buscarEstacionPorIdEstacion(idEstacion) == null ) {
            System.out.println("Número de estación incorrecto. Debe ingresar un número de 1 a 4. ");
        } else {
            centroVideoJuegos.ingresarJugador(idEstacion, nombre, identificacion, fecha);
        }
    }
        
    
    private void agregarTiempoAJugador(){
         if (centroVideoJuegos.validarJugadores()) {  
            System.out.println("Ingrese los datos separados por &: ");
            String texto2 = sc.nextLine();
            String [] dato2 = texto2.split("&");
            int identificacion2 = Integer.parseInt(dato2[0]);
            int minutos2 = Integer.parseInt(dato2[1]);
            centroVideoJuegos.agregarTiempoAJugador(identificacion2, minutos2);
         } else {
            System.out.println("No se puede utilizar esta opción hasta que no haya al menos un jugador en el centro. ");
        }
    }
    
    
    private void cambiarJugadorDeEstacion(){
        if (centroVideoJuegos.validarJugadores()) {
            System.out.println("Ingrese los datos separados por &: ");
            String texto3 = sc.nextLine();
            String [] dato3 = texto3.split("&");
            int identificacion3 = Integer.parseInt(dato3[0]);
            int idNuevaEstacion = Integer.parseInt(dato3[1]);
            centroVideoJuegos.cambiarJugadorEstacion(identificacion3, idNuevaEstacion);
        }else {
            System.out.println("No se puede utilizar esta opción hasta que no haya al menos un jugador en el centro. ");
        }
    }
     
    
    private void registrarSalidaJugador(){
      if (centroVideoJuegos.validarJugadores()) {
      System.out.println("Ingrese los datos");
      int identificacion4 = Integer.parseInt(sc.nextLine());
      centroVideoJuegos.registrarSalidaJugador(identificacion4);
      }else {
            System.out.println("No se puede utilizar esta opción hasta que no haya al menos un jugador en el centro. ");
      }
    }
    
    
    private void consultarIngresosTotales(){
        System.out.println("Los ingresos totales son " + centroVideoJuegos.consultarIngresosTotales());
    }
    
    
    private void mostrarCentroVideoJuegos(){
        System.out.println(centroVideoJuegos.toString());
    }
    
    
    private void jugadorConTiempoMayor(){
        if (centroVideoJuegos.validarJugadores()) {
           centroVideoJuegos.validacionTiempoMayor(); 
        } else {
            System.out.println("En este momento no hay jugadores en el centro.");
        }
    }
    

    
    private void mostrarCantdidadJugadores(){
        System.out.println("Hasta el momento, al centro de videojuegos han ingresado " + "jugadores.");  //ayuda
    }
}


















class CentroVideoJuegos {
    
    private int ingresoTotal;
    private Estacion estacion1 = new Estacion(1);
    private Estacion estacion2= new Estacion(2);
    private Estacion estacion3= new Estacion(3);
    private Estacion estacion4= new Estacion(4);
    private Estacion estacion5= new Estacion(5);
    private int CantidadTotalJugadres;
    
    
    public void ingresarJugador(int idEstacion , String nombre , int identificacion , String fecha){
         Estacion estacionAuxiliar = buscarEstacionPorIdEstacion(idEstacion);
         if (estacionAuxiliar != null) {
             if (estacionAuxiliar.estaOcupado() == true) {
                 System.out.println("El nuevo jugador no se puede agregar a la estacion " + idEstacion +" porque está ocupada por el: "); 
                 System.out.println(estacionAuxiliar.consultarJugador());
             } else {
                 Jugador jugadorAAsignar = new Jugador(nombre , identificacion , fecha);
                 estacionAuxiliar.agregarJugador(jugadorAAsignar);
                 System.out.println("El " + jugadorAAsignar.toString() + " ha sido agregado a la estacion " + idEstacion);
                 //System.out.println(estacionAuxiliar.consultarJugador().toString());
             }
        }
    }
    
    
    
    public Estacion buscarEstacionPorIdEstacion(int idEstacion){
        if (idEstacion==1) {
            return estacion1;
        }
         if (idEstacion==2) {
            return estacion2;
        }
          if (idEstacion==3) {
            return estacion3;
        }
           if (idEstacion==4) {
            return estacion4;
        }
           if (idEstacion==5) {
            return estacion5;
        }
        return null;
    }
    
    
    public boolean validarJugadores(){
        boolean resultado = false;
        if (estacion1.estaOcupado()) {
            resultado = true;
        } 
        
        if (estacion2.estaOcupado()) {
            resultado = true;
        } 
        if (estacion3.estaOcupado()) {
            resultado = true;
        } 
        
        if (estacion4.estaOcupado()) {
            resultado = true;
        } 
         if (estacion5.estaOcupado()) {
            resultado = true;
        } 
        return resultado;
    }
    
    
    public void agregarTiempoAJugador(int identificacion2 , int minutos2){
       
        if (buscarJugador(identificacion2)!=null) {
            buscarJugador(identificacion2).agregarTiempo(minutos2);
            System.out.println("El nuevo estado del " + buscarJugador(identificacion2).toString());
        } else {
             System.out.println("El jugador consultado NO existe. ");
        }
    }
    
    
    public Jugador buscarJugador(int identificacion){
         if (estacion1.consultarJugador()!=null) {
             if (estacion1.consultarJugador().consultarIdentificacion()==identificacion) {
                 return estacion1.consultarJugador();
             }
        }
         if (estacion2.consultarJugador()!=null) {
             if (estacion2.consultarJugador().consultarIdentificacion()==identificacion) {
                 return estacion2.consultarJugador();
             }
        }
         if (estacion3.consultarJugador()!=null) {
             if (estacion3.consultarJugador().consultarIdentificacion()==identificacion) {
                 return estacion3.consultarJugador();
             }
        }
         if (estacion4.consultarJugador()!=null) {
             if (estacion4.consultarJugador().consultarIdentificacion()==identificacion) {
                 return estacion4.consultarJugador();
             }
        }
         if (estacion5.consultarJugador()!=null) {
             if (estacion5.consultarJugador().consultarIdentificacion()==identificacion) {
                 return estacion5.consultarJugador();
             }
        }
       
        return null;
    }
    
    
    public void cambiarJugadorEstacion(int identificacion3 , int idNuevaEstacion){
         Estacion nuevaEstacion= buscarEstacionPorIdEstacion(idNuevaEstacion);
         Estacion viejaEstacion = buscarEstacionPorIdJugador(identificacion3);
         if (buscarJugador(identificacion3)!=null) {
            if (buscarEstacionPorIdEstacion(idNuevaEstacion) == null ) {
            System.out.println("Número de estación incorrecto. Debe ingresar un número de 1 a 4. ");
             } else {
                if (nuevaEstacion.estaOcupado() == true) {
                 System.out.println("El " + buscarJugador(identificacion3).toString() + " no se puede mover al espacio " + idNuevaEstacion + " por que esta ocupado por el"); //Falta mirar la estacion puede variar
                System.out.println(nuevaEstacion.consultarJugador());
                } else {
                    Jugador copiaJugador = buscarJugador(identificacion3);      //se crea una copia de jugador
                    viejaEstacion.desocupar();                                  //se desocupa el jugador  Mirar .Desocupar
                    nuevaEstacion.agregarJugador(copiaJugador);  // buscarJugador(identificacion3) esto es el objeto jugador      aqui se agrega el jugador en la estacion colocada
                    System.out.println("El jugador " + copiaJugador.toString() + " ha sido cambiado a la estacion " + idNuevaEstacion);  //aqui se muestra la copia del jugador colocada en la estacion requerida
                }
             }
        } else {
             System.out.println("El jugador consultado NO existe. ");
        }
    }
    
    
    private Estacion buscarEstacionPorIdJugador(int identificacion){
        if (estacion1.consultarJugador()!=null) {
             if (estacion1.consultarJugador().consultarIdentificacion()==identificacion) {
                 return estacion1;
             }
        }
         if (estacion2.consultarJugador()!=null) {
             if (estacion2.consultarJugador().consultarIdentificacion()==identificacion) {
                 return estacion2;
             }
        }
         if (estacion3.consultarJugador()!=null) {
             if (estacion3.consultarJugador().consultarIdentificacion()==identificacion) {
                 return estacion3;
             }
        }
         if (estacion4.consultarJugador()!=null) {
             if (estacion4.consultarJugador().consultarIdentificacion()==identificacion) {
                 return estacion4;
             } 
        }
         if (estacion5.consultarJugador()!=null) {
             if (estacion5.consultarJugador().consultarIdentificacion()==identificacion) {
                 return estacion5;
             } 
        }
        return null;
    }
    
    
    public void registrarSalidaJugador(int identificacion4){
         Estacion viejaEstacion = buscarEstacionPorIdJugador(identificacion4);
        if (buscarJugador(identificacion4)!=null) {
            double precioF = (buscarJugador(identificacion4).consularTiempo()*100) - ((buscarJugador(identificacion4).consularTiempo()/50)*150);  // Por cada 50 minutos se hará un descuento de 150 pesos.
            ingresoTotal+=precioF;  
            System.out.println("Se ha registrado la salida del " + buscarJugador(identificacion4).toString() + " debe cancelar $" + precioF); 
            viejaEstacion.desocupar();
        } else {
            System.out.println("El jugador consultado NO existe. ");
        }
    }
    
    
    public int consultarIngresosTotales(){
        return ingresoTotal;
    }
    
    
    public void validacionTiempoMayor(){
        double mayor = 0;
        Jugador jugador = null;
        for (int i = 1; i <= 5; i++) {
            if (buscarEstacionPorIdEstacion(i).consultarJugador() !=null) {  //Cuidado con el error java.lang.NullPointException busca los jugadores diferente de null
                double tiempoJugador = buscarEstacionPorIdEstacion(i).consultarJugador().consularTiempo();
                if (tiempoJugador > mayor) {
                    mayor = tiempoJugador;
                    jugador = buscarEstacionPorIdEstacion(i).consultarJugador();
                }
            }
        }
        System.out.println("En jugador con mayor tiempo es " + jugador);
    }
    
   
    
    
     
    @Override
    public String toString() {
        //return "{" + "Ingresos:" + IngresosTotales + ", estacion1:" + estacion1 + ", estacion2:" + estacion2 + ", estacion3:" + estacion3 + ", estacion4:" + estacion4 + '}';
        return "{" + "Ingresos $" + ingresoTotal + "\n" + "estaciones: " + "\n" + estacion1  + "\n" + estacion2 + "\n" + estacion3 + "\n" +estacion4  + "\n" +estacion5 ;
    }
}




















class Estacion{
    
    private int idEstacion; 
    private boolean ocupado;
    private Jugador jugador;
    
    public Estacion (int idEstacion){
        this.idEstacion=idEstacion;
    }
    
    
    public void agregarJugador(Jugador jugador){
        this.jugador = jugador;
        this.ocupado=true;
    }
    
    
    public boolean estaOcupado(){
        return ocupado; 
    }
    
    
    public Jugador desocupar(){
        ocupado=false;
        Jugador jugadorCopia = jugador;  //aqui retorna la copia del jugador
        jugador=null;
        return jugadorCopia;
    }
    
    
    public Jugador consultarJugador(){
        return jugador;  
    }

    
    @Override
    public String toString() {
        return "Estacion{" + "idEstacion:" + idEstacion + ", ocupado:" + ocupado + ", jugador:" + jugador + '}';
    }
}

















class Jugador{
    
  private String nombre;  
  private int  identificacion;  
  private String fecha; 
  private int minutos;
  
  public Jugador(String nombre, int identifiacaion , String fecha){    
      this.nombre = nombre;
      this.identificacion=identifiacaion;
      this.fecha=fecha;
  }
  
  
  public void agregarTiempo(int minutos){
      this.minutos+=minutos;
  }
  
  
  public int consularTiempo(){
      return minutos;
  }
  
  
  public int consultarIdentificacion(){
      return identificacion;
  }
  
    @Override
    public String toString() {
        return "Jugador{" + "identificacion: " + identificacion + ", nombre: " + nombre + ", fecha: " + fecha + ", minutos: " + minutos + '}';
    }
}

//                             3&224488&Diana Martinez&10/08/2020
//                             2&112255&Carlos Perez&10/08/2020
// 2. Ne                       110011&15
// 2. Bien                     112255&15
// 3. Ne                       112255&4
// 3. EstacionMal              112255&5
// 3. ocupado                  112255&3
// 3. bien                     112255&4
// 4. Ne                       112255
// 4. bien                     112255
