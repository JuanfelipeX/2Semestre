
package ProyectoFinal_CochesHechoYoSolo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


//9&99&9&9
//8&88&8&987654321

public class Automoviles_HechoPorMiSolo  {       //este proyecto estaba un poco heavy me quede rayado con los polimorfismo al hacerle cambios revisar en un futuro :v
    
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    private Cliente cliente;
    
    private PlantillaAuto plantillaAuto;
    
    ArrayList<Cliente> listaCliente = new ArrayList();
    
    ArrayList<Factura> facturaCompra = new ArrayList();
    
    String nombre;
    int edad;
    int identificacion;
    double presupuesto;
    double presupuestoFinalD;
    
    PlantillaAuto vehiculos[] = new PlantillaAuto[7];
    
    private void mostrarOpciones() {
        String cadenaMenu = "\n Cocesionario Don Pipe. ";
        cadenaMenu += "\n1. Ingresar Datos. ";
        cadenaMenu += "\n2. Comprar Autos. ";
        cadenaMenu += "\n3. Modificar Autos. ";
        cadenaMenu += "\n4. Clientes y Facturas. ";
        System.out.println(cadenaMenu);
    }
    
     public void desplegarMenu() throws IOException {
        mostrarOpciones();
        System.out.print("Seleccione una opción: ");
        int opcionSeleccionada = Integer.parseInt(br.readLine());
        ejecutarOpcion(opcionSeleccionada);
        desplegarMenu(); 
     }
     
     private void ejecutarOpcion(int opcionSeleccionada) throws IOException {
        switch (opcionSeleccionada) {
            case 1:
                System.out.println("Ingresó a la opción 1: Ingresar Datos. ");
                ingresarCliente();
                break;
            case 2:
                System.out.println("Ingreso a la opcion 2: Comprar Autos. ");
                busquedaIdentificaciones();
                break;
            case 3:
                System.out.println("Ingreso a la opcion 3: Modificar Autos. ");
                busquedaIdentifacionesPartII();
                break;
            case 4:
                System.out.println(listaCliente);
                System.out.println(facturaCompra);
                desplegarMenu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Ingrese la opcion de nuevo. ");

        }
     }
     
     private void mostrarOpciones2() {
        String cadenaMenu = "\n Cocesionario Don Pipe. ";
        cadenaMenu += "\n1. Nuevo. ";
        cadenaMenu += "\n2. Usado. ";
        cadenaMenu += "\n3. Salir. ";
        System.out.println(cadenaMenu);
    }
    
     public void desplegarMenu2() throws IOException {
        mostrarOpciones2();
        System.out.print("Seleccione una opción: ");
        int opcionSeleccionada2 = Integer.parseInt(br.readLine());
        ejecutarOpcion2(opcionSeleccionada2);
        desplegarMenu2(); 
     }
     
     private void ejecutarOpcion2(int opcionSeleccionada2) throws IOException {
        switch (opcionSeleccionada2) {
            case 1:
                System.out.println("Nuevo. ");
                autoMovilesNuevos();
                break;
            case 2:
                System.out.println("Usado. ");
                autoMovilesUsados();
                break;
            case 3:
                desplegarMenu();
                break;
            default:
                System.out.println("Ingrese la opcion de nuevo.");

        }
     }
     
     private void mostrarOpciones3() {
        String cadenaMenu = "\n Cocesionario Don Pipe. ";
        cadenaMenu += "\n1. Motor. ";
        cadenaMenu += "\n2. Color. ";
        cadenaMenu += "\n3. Solo para autos deportivos: Nitro. ";
        cadenaMenu += "\n4. Solo para autos deportivos: Descapotable. ";
        System.out.println(cadenaMenu);
    }
    
     public void desplegarMenu3() throws IOException {
        mostrarOpciones3();
        System.out.print("Seleccione una opción: ");
        int opcionSeleccionada3 = Integer.parseInt(br.readLine());
        ejecutarOpcion3(opcionSeleccionada3);
        desplegarMenu(); 
     }
     
     private void ejecutarOpcion3(int opcionSeleccionada3) throws IOException {
        switch (opcionSeleccionada3) {
            case 1:
                modificacionMotor();
                break;
            case 2:
                
                break;
            case 3:
                
               break;
            case 4:
                
                break;
            default:
                System.out.println("Ingrese la opcion de nuevo.");

        }
     }
     
        
     private void ingresarCliente() throws IOException{
        System.out.println("Ingrese los datos separados por '&':(Nombre, Edad, Identificacion, Presupuesto)");
        String texto = br.readLine();
        String [] dato = texto.split("&");
        nombre = dato[0];
        edad = Integer.parseInt(dato[1]);
        identificacion = Integer.parseInt(dato[2]);
        presupuesto = Double.parseDouble(dato[3]);
        Cliente clienteNuevo = new Cliente(nombre,edad,identificacion,presupuesto, false);
        if (edad >= 18 ) {
                if (ExisteCliente(clienteNuevo)) {
                  System.out.println("Identificacion repetida");  
                } else{
                    listaCliente.add(clienteNuevo);
                    System.out.println("Usuario Ingresado Correctamente " + "\n" + listaCliente);
                }
        } else {
            System.out.println("Debe ser mayor de edad");
        }
     }
     
     private boolean ExisteCliente(Cliente cliente){
         boolean existe = false;
         for(int i=0;i<listaCliente.size();i++){
             if(listaCliente.get(i).identificacion == cliente.identificacion){
                 existe = true;
                 break;
             }
         }
         return existe; 
     }
     
     private void busquedaIdentificaciones() throws IOException{
         
         if (listaCliente.size()>0) {
        System.out.println("Ingrese la identificacion");
        int busquedaIdentificacion = Integer.parseInt(br.readLine());
        
        
        /*  Esto esta mal
        for (int i = 0; i < listaCliente.size(); i++) {
            if (listaCliente.get(i).getIdentificacion()==busquedaIdentificacion){  //listas.contains(busquedaIdentificacion) no me srivio
                desplegarMenu2();
            } else {
                System.out.println("Usuario no encontrado... ");
                busquedaIdentificaciones();
            }
        }
        
        - el For recorre toda la lista, aun después de encontrar el id buscado, por ese motivo, 
        se muestra nuevamente el mensaje "usuario no encontrado" aun cuando ya se encontró.
        
        El else dentro del for hace que solo encuentre el cliente si está en la primera posición de la lista,
        si no está en esa posición llama nuevamente al método e i vale cero (i = 0) nuevamente.
        */
        
        boolean flag = false;  //bandera para controlar la ejecucion del bucle
        
        for (int i = 0; !flag && i < listaCliente.size(); i++) {  //	verdadero si flag es falso.
            if (listaCliente.get(i).getIdentificacion()== busquedaIdentificacion) {
                flag=true;
                System.out.println("Usuario: " + listaCliente.get(i));
                desplegarMenu2();
            }
        }
        if (!flag) {
             System.out.println("Usuario NO encontrado... ");
             busquedaIdentificaciones();
        }
         } else {
             System.out.println("Debe haber por lo menos un cliente... ");
             desplegarMenu();
         }
    }
     
     
     private void busquedaIdentifacionesPartII () throws IOException{
        
        boolean flag = false;  
        
        for (int i = 0; !flag && i < listaCliente.size(); i++) { 
            if (listaCliente.get(i).isCoche() == true) {
                flag=true;
                busquedaIdentificaciones2();
            }
        }
        if (!flag) {
             System.out.println("Deber haber UN coche... ");
             desplegarMenu();
        }
     }
     
     
     
     private void busquedaIdentificaciones2() throws IOException{
         
      if (listaCliente.size()>0) {
        System.out.println("Ingrese la identificacion");
        int busquedaIdentificacion = Integer.parseInt(br.readLine());
        
        boolean flag = false;  
        
        for (int i = 0; !flag && i < listaCliente.size(); i++) { 
            if (listaCliente.get(i).getIdentificacion()== busquedaIdentificacion) {
                flag=true;
                System.out.println("Usuario: " + listaCliente.get(i));
                desplegarMenu3();
            }
        }
        if (!flag) {
             System.out.println("Usuario NO encontrado... ");
             busquedaIdentificaciones();
        }
         } else {
             System.out.println("Debe haber por lo menos un cliente... ");
             desplegarMenu();
         }
     }
     
     
     
     

     
     public void autoMovilesNuevos() throws IOException{  //POLIMORFISMOS
         
         vehiculos[0] = new PlantillaAuto(2000,4,600000,"RTX500","Rojo","Ferrari","QWE123");
         vehiculos[1] = new PlantillaAuto(2001,2,5000000,"GTX1200","Rojo","Chevorelt","QWT123");
         vehiculos[2] = new PlantillaAuto(2011,4,40000,"RTUX411","Verde","Ford","GHJ123");
         
         vehiculos[3] = new CocheDeportivo("No", "Si", 2020,2,61200000,"UVM123","Rojo","Ferrari","QWR123" );
         vehiculos[4] = new CocheDeportivo("SI", "Si", 2020,2,99900000,"HMQ1344","Negro","Porshe","QASB123" );
         
         vehiculos[5] = new CocheCamioneta(6,2019, 6 ,6912330,"ACV6566","Blanco","Mazda","QGS123" );
         vehiculos[6] = new CocheCamioneta(8,2019, 8 ,1231330,"ACV6566","Marron","Chevrolet","ASD125" );

         /*
         for(PlantillaAuto i: vehiculos){
             System.out.println(i.toString());
         }
         */
         
         for (int i = 0; i < vehiculos.length; i++) {
             System.out.println("Opcion " + (i+1) + " " + vehiculos[i]);
         }
         System.out.println("Ingrese la opcion del coche");
         int option = (Integer.parseInt(br.readLine()))-1;
         System.out.println(vehiculos[option]);
         System.out.println("¿Esta seguro?,(si,no)");
         String sure = br.readLine();
         if (sure.equalsIgnoreCase("si")) {
             
             boolean flag = false;  //bandera para controlar la ejecucion del bucle

             for (int i = 0; !flag && i < listaCliente.size(); i++) {  	
                 if (listaCliente.get(i).getPresupuesto()>=vehiculos[option].getPrecio()) {
                     flag=true;
                     System.out.println("Felicidades Disfruta tu ¡Nuevo Coche! ");
                     double dineroPersona = listaCliente.get(i).getPresupuesto();
                     double dineroVehiculo = vehiculos[option].getPrecio();
                     listaCliente.get(i).setPresupuesto(dineroPersona-dineroVehiculo);
                     presupuestoFinalD = dineroPersona-dineroVehiculo;
                     listaCliente.get(i).setCoche(true);
                     vehiculos[option]=null;  //fix
                     metodoFacturacion();  //se invoca para dar los estados de la factura
                     System.out.println(facturaCompra); 
                     desplegarMenu();
                 }
             }
             if (!flag) {
                 System.out.println("Poco Presupuesto :c");
                 desplegarMenu();
             }
         } else {
             desplegarMenu();
         }
     }
     
     
      private void autoMovilesUsados() throws IOException{
          
      PlantillaAuto vehiculosUsados[] = new PlantillaAuto[8];
      
         vehiculosUsados[0] = new CocheSencilloUsado(2001,4,6730200,"AS12","Rojo","Mazda","ASD212");
         vehiculosUsados[1] = new CocheSencilloUsado(1992,2,234324,"GTSDF200","Rojo","Chevrolet","DFG23");
         vehiculosUsados[2] = new CocheSencilloUsado(2011,4,45656489,"RTUX411","Verde","Ford","AAS56");
         vehiculosUsados[3] = new CocheSencilloUsado(2011,4,11631200,"GFH1","Blanco","Mercedez","ASD56");
         
         vehiculosUsados[4] = new CocheDeportivoUsado("Si", "Si", 2020,2,61200000,"JG312","Rojo","Lamborguini","SDA1223" );
         vehiculosUsados[5] = new CocheDeportivoUsado("Si", "Si", 2020,2,99900000,"ASD12","Azul","Ford","AXZ21" );
         
         vehiculosUsados[6] = new CocheCamionetaUsado(8,2020, 6 ,21561556,"ACV6566","Blanco","Mazda","KGS123" );
         vehiculosUsados[7] = new CocheCamionetaUsado(10,2021, 8 ,123144330,"AGTR4566","Negro","Ford","AS2125" );
         
      }
         
      private void metodoFacturacion(){
          int numeroCompra = (int) (Math.random() * 10000 + 99999);
          Factura nuevaFactura = new Factura("Efectivo", numeroCompra, presupuestoFinalD, nombre, edad, identificacion, presupuesto, true);
          facturaCompra.add(nuevaFactura);
      }
      
      private void modificacionMotor() throws IOException{
          
          String engine [][] = new String[2][2];
          
          engine [0][0] = "GSD564";  
          engine [0][1] = "HDF53";
          
          engine [1][0] = "VBN674";
          engine [1][1] = "KLL345";
          
          for (int i = 0; i < engine.length; i++) {
              for (int j = 0; j < engine[i].length; j++) {
                  System.out.print("[" + i + "]" + "[" + j + "]" + "= " + engine[i][j] + "  ");
              }
              System.out.println();
          }
          
          System.out.println("Ingrese la opcion del motor separados por (&),  Ejm: 0&1");
          String texto = br.readLine();
          String [] dato = texto.split("&");
          int fila = Integer.parseInt(dato[0]);
          int columna = Integer.parseInt(dato[1]);
          System.out.println("Motor: " + engine[fila][columna] + "\n" + "El precio de la modificacion del coche es de 8000000, ¿Esta seguro?,(si,no) ");
           String sure = br.readLine();
           if (sure.equalsIgnoreCase("si")) {
               
               boolean flag = false;
             for (int i = 0; !flag && i < listaCliente.size(); i++) {  	
                 if (listaCliente.get(i).getPresupuesto()>= 8000000) {
                     flag=true;
                     System.out.println("Felicidades, modificacion realizada");
                     double dineroPersona = listaCliente.get(i).getPresupuesto();
                     double dineroMotor = 8000000;
                     listaCliente.get(i).setPresupuesto(dineroPersona-dineroMotor);
                     presupuestoFinalD = dineroPersona-dineroMotor;  
                     String nuevoEngine = engine[fila][columna];
                    // plantillaAuto.setMotor("nuevoEngine");   //hacer cambio del motor  REVISAR null
                     metodoFacturacion();
                     System.out.println(facturaCompra);
                     System.out.println(listaCliente);
                     desplegarMenu();
                 }
             }
             
             if (!flag) {
                 System.out.println("Poco Presupuesto :c");
                 desplegarMenu();
             }
             
           } else {
               desplegarMenu();
           }
      }
      
    public static void main(String[] args) throws IOException {
        try{
       Automoviles_HechoPorMiSolo project = new Automoviles_HechoPorMiSolo();
       project.desplegarMenu();
        } catch(Exception e){
            System.out.println("Error " + e);
        }
        
    }
}


















class Cliente {
    
    protected final String nombre;
    protected int edad;
    protected final int identificacion;
    protected double presupuesto;
    protected boolean coche;

    public Cliente(String nombre, int edad, int identificacion, double presupuesto, boolean coche) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.presupuesto = presupuesto;
        this.coche = coche;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public boolean isCoche() {
        return coche;
    }

    public void setCoche(boolean coche) {
        this.coche = coche;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", identificacion=" + identificacion + ", presupuesto=" + presupuesto + ", coche=" + coche + '}';
    }
}















class PlantillaAuto {
    
    protected int aniomodelo;
    protected int puertas;
    protected double precio;
    protected String motor;
    protected String color;
    protected String marca;
    protected String matricula;

    public PlantillaAuto(int anioModelo, int puertas, double precio, String motor, String color, String marca, String matricula) {
        this.aniomodelo = anioModelo;
        this.puertas = puertas;
        this.precio = precio;
        this.motor = motor;
        this.color = color;
        this.marca = marca;
        this.matricula = matricula;
    }

    public int getAniomodelo() {
        return aniomodelo;
    }

    public void setAniomodelo(int aniomodelo) {
        this.aniomodelo = aniomodelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public String toString() {
        return "Coches Sencillos Nuevos{" + "aniomodelo=" + aniomodelo + ", puertas=" + puertas + ", precio=" + precio + ", motor=" + motor + ", color=" + color + ", marca=" + marca + ", matricula=" + matricula + '}';
    }
}



class CocheDeportivo extends PlantillaAuto{
    
    protected String nitro;
    protected String descapotable;

    public CocheDeportivo(String nitro, String descapotable, int anioModelo, int puertas, double precio, String motor, String color, String marca, String matricula) {
        super(anioModelo, puertas, precio, motor, color, marca, matricula);
        this.nitro = nitro;
        this.descapotable = descapotable;
    }

    public String getNitro() {
        return nitro;
    }

    public void setNitro(String nitro) {
        this.nitro = nitro;
    }

    public String getDescapotable() {
        return descapotable;
    }

    public void setDescapotable(String descapotable) {
        this.descapotable = descapotable;
    }

    @Override
    public String toString() {
        return "Coches Deportivo Nuevos{" + "aniomodelo=" + aniomodelo + ", puertas=" + puertas + ", precio=" + precio + ", motor=" + motor + ", color=" + color + ", marca=" + marca + ", matricula=" + matricula + ", nitro=" + nitro + ", descapotable=" + descapotable + '}';
    }
}



class CocheCamioneta extends PlantillaAuto {
    
    protected int ejes;

    public CocheCamioneta(int ejes, int anioModelo, int puertas, double precio, String motor, String color, String marca, String matricula) {
        super(anioModelo, puertas, precio, motor, color, marca, matricula);
        this.ejes = ejes;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
    
    @Override
    public String toString() {
        return "Camionetas Nuevas{" + "aniomodelo=" + aniomodelo + ", puertas=" + puertas + ", precio=" + precio + ", motor=" + motor + ", color=" + color + ", marca=" + marca + ", matricula=" + matricula + "ejes=" + ejes + '}';
    }
}


class CocheSencilloUsado extends PlantillaAuto{

    public CocheSencilloUsado(int anioModelo, int puertas, double precio, String motor, String color, String marca, String matricula) {
        super(anioModelo, puertas, precio, motor, color, marca, matricula);
    }

    @Override
    public String toString() {
        return "Coches Sencillos Usados{" + "aniomodelo=" + aniomodelo + ", puertas=" + puertas + ", precio=" + precio + ", motor=" + motor + ", color=" + color + ", marca=" + marca + ", matricula=" + matricula + '}';
    }
}


class CocheDeportivoUsado extends CocheDeportivo {

    public CocheDeportivoUsado(String nitro, String descapotable, int anioModelo, int puertas, double precio, String motor, String color, String marca, String matricula) {
        super(nitro, descapotable, anioModelo, puertas, precio, motor, color, marca, matricula);
    }

     @Override
    public String toString() {
        return "Coches Deportivo Usados{" + "aniomodelo=" + aniomodelo + ", puertas=" + puertas + ", precio=" + precio + ", motor=" + motor + ", color=" + color + ", marca=" + marca + ", matricula=" + matricula + "nitro=" + nitro + ", descapotable=" + descapotable + '}';
    }
}



class CocheCamionetaUsado extends CocheCamioneta {

    public CocheCamionetaUsado(int ejes, int anioModelo, int puertas, double precio, String motor, String color, String marca, String matricula) {
        super(ejes, anioModelo, puertas, precio, motor, color, marca, matricula);
    }
    
    
    @Override
    public String toString() {
        return "Camionetas Usadas{" + "aniomodelo=" + aniomodelo + ", puertas=" + puertas + ", precio=" + precio + ", motor=" + motor + ", color=" + color + ", marca=" + marca + ", matricula=" + matricula + "ejes=" + ejes + '}';
    }
}














class Factura extends Cliente {
    
    protected final String tipoPago;
    
    protected final int numeroCompra;
    
     protected double presupuestoFinal;
    
    Date date = new Date();
    
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    public Factura(String tipoPago, int numeroCompra, double presupuestoFinal, String nombre, int edad, int identificacion, double presupuesto, boolean coche) {
        super(nombre, edad, identificacion, presupuesto, coche);
        this.tipoPago = tipoPago;
        this.numeroCompra = numeroCompra;
        this.presupuestoFinal = presupuestoFinal;
    }

    public double getPresupuestoFinal() {
        return presupuestoFinal;
    }

    public void setPresupuestoFinal(double presupuestoFinal) {
        this.presupuestoFinal = presupuestoFinal;
    }
    
    @Override
    public String toString() {
        return "Factura{" + "nombre=" + nombre + ", edad=" + edad + ", identificacion=" + identificacion + ", presupuestoOriginal=" + presupuesto + ", presupuestoFinal=" + presupuestoFinal +", coche=" + coche + ", tipoPago=" + tipoPago + ", numeroCompra=" + numeroCompra + ", FechaCompra=" + formatter.format(date) + '}';
    }
}













