package PooEjercicios;

import java.util.Scanner;

public class EmpresaContableTaller2 {

    private Scanner sc;
    private String nombreEmpresa;
        private Coordinador coordinador1;
        private AnalistaContable analista1;
        private EmpresaCliente cliente1;
        private Scanner SC;
        
        public EmpresaContableTaller2(){
            sc = new Scanner(System.in);
            coordinador1 = new Coordinador("Juan " , "Asesoría tributaria " , 10);
            analista1 = new AnalistaContable("felipe " , " analista " , 2);
            cliente1 = new EmpresaCliente("Microsoft", 100, true);
        }
        
        public String consultarDatosCoordinador(){
            String salida="";
            salida+="Nombre: " + coordinador1.consultarNombreCoordinador() + "\n";
            salida+="Área a cargo: " + coordinador1.consultarAreaACargo() + "\n";
            salida+="Cantidad empleados: " + coordinador1.consultarCantidadEmpleado() + "\n";
            return salida;
            
        }
        
        public void modificarDatosCoordinador(){
                System.out.println("Ingrese los datos del cordinador (nombre, área a cargo, cantidad empleados) separados por &: ");
                String textoCordinador = sc.nextLine();
                String[] datosC = textoCordinador.split("&");
                String nombreC = datosC[0];
                String areaACargoC = datosC[1];
                int cantEmpleadosC = Integer.parseInt(datosC[2]);
                coordinador1.modificarNombreCoordinador(nombreC );
                coordinador1.modificarAreaACargo(areaACargoC);
                coordinador1.modificarCantidadesEmpleados(cantEmpleadosC);
                System.out.println("");
        } 
        
        public String consultarDatosAnalistaContable(){
            String salida2="";
            salida2+="Nombre: " + analista1.consultarNombreAnalista()+ "\n";
            salida2+="Profesion: " + analista1.consultarProfesion()+ "\n";
            salida2+="Años de experiencia: " + analista1.consultarAnhionsExperencia()+ "\n";
            return salida2;
            
        }
        
        public void modificarDatosAnalistaContable(){
            System.out.println("Ingrese los datos del analista (nombre, profesion, años de experencia) separados por &: ");
                String textoAnalista = sc.nextLine();
                String[] datosA = textoAnalista.split("&");
                String nombreA = datosA[0];
                String areaACargoA = datosA[1];
                int cantEmpleadosA = Integer.parseInt(datosA[2]);
                analista1.modificarNombreAnalista(nombreA );
                analista1.modificarProfesion(areaACargoA);
                analista1.modificarAnhiosExperencia(cantEmpleadosA);
                System.out.println("");
        }
        
        public String consultarDatosCliente(){
            String salida3="";
            salida3+="Nombre empresa: " + cliente1.consultarNombreEmpresa()+ "\n";
            salida3+="Cuota Mensual: " + cliente1.consultarCuotaMensual()+ "\n";
            if (cliente1.consultarEstado()==true) {
                salida3+="Estado: " + "activo "+ "\n";
            } else {
                salida3+="Estado: " + "inactivo "+ "\n";
            }
            return salida3;
        }
        
        public void modificarDatosCliente(){
            System.out.println("Ingrese los datos del analista (nombre empresa, cuota mensual, estado) separados por &: ");
                String textoClien = sc.nextLine();
                String[] datosClie = textoClien.split("&");
                String nombreEmpresas = datosClie[0];
                double cuota = Double.parseDouble(datosClie[1]);
                int estadoIngresado = Integer.parseInt(datosClie[2]);
                boolean estado = false;
                if(estadoIngresado == 1){
                    estado = true;
                }
                cliente1.modificarNombreEmpresa(nombreEmpresas );
                cliente1.modificarCuotaMensual(cuota);
                cliente1.modificarEstado(estado);
                System.out.println("");
        }
        
    public static void main(String[] args) {
        EmpresaContableTaller2 menu = new EmpresaContableTaller2 (); 
        menu.desplegarMenu();
    }

    public void desplegarMenu() {
        System.out.print("Bienvenidos a la empresa <DONPIPE> ");
        mostrarOpciones(); 
        System.out.println("Seleccione una opción:");
        int opcionSeleccionada = Integer.parseInt(sc.nextLine());
        ejecutarOpcion(opcionSeleccionada);
        desplegarMenu(); 
    }

    private void mostrarOpciones() {
        String cadenaMenu = "\nMenu de usuario.";
        cadenaMenu += "\n1. Consultar Coordinador.";
        cadenaMenu += "\n2. Modificar Coordinador.";
        cadenaMenu += "\n3. Consultar Analista.";
        cadenaMenu += "\n4. Modificar Analista";
        cadenaMenu += "\n5. Consular Cliente.";
        cadenaMenu += "\n6. Modificar Cliente.";
        cadenaMenu += "\n7. Salir.";
        System.out.println(cadenaMenu);
    }
    private void ejecutarOpcion(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 1:
                System.out.println("Ingresó a la opción 1: Consultar Coordinador ");
                System.out.println(consultarDatosCoordinador());
                break;
            case 2:
                System.out.println("Ingreso a la opción 2: Modificar Coordinador");
                modificarDatosCoordinador();
                break;
            case 3:
                System.out.println("Ingreso a la opción 3: Consultar Analista ");
                System.out.println(consultarDatosAnalistaContable());
                break;  
            case 4:
                System.out.println("Ingreso a la opción 4: Modificar Analista ");
                modificarDatosAnalistaContable();
                break;
            case 5:
                System.out.println("Ingreso a la opción 5: Consultar Cliente ");
                System.out.println(consultarDatosCliente());
                break;
            case 6:
                System.out.println("Ingreso a la opción 6: Modificar Cliente");
                modificarDatosCliente();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Gracias por utilizer el Sistema.");

        }
    }

    } class Coordinador {
        
        private String nombreCoordinador;
        private String areaACargo;
        private int cantidadEmpleados;
        
        public Coordinador(String nombreCoordinador, String areaACargo, int cantidadEmpleados){
            this.nombreCoordinador = nombreCoordinador;
            this.areaACargo = areaACargo;
            this.cantidadEmpleados = cantidadEmpleados;
            
        }
        
        public String consultarNombreCoordinador(){
            return nombreCoordinador;
        }
        
        public void modificarNombreCoordinador(String nombreCoordinador ){
            this.nombreCoordinador = nombreCoordinador;
            
        }
        
        public String consultarAreaACargo(){
            return areaACargo;
        }
        
        public void modificarAreaACargo(String areaACargo){
            this.areaACargo = areaACargo;
        }
        
        public int consultarCantidadEmpleado(){
            return cantidadEmpleados;
        }
        
        public void modificarCantidadesEmpleados(int cantidadEmpleados){
            this.cantidadEmpleados = cantidadEmpleados;
        }
        
    } class AnalistaContable{
        
        private String nombreAnalista;
        private String profesion;
        private int anhionsExperencia;
        
        public AnalistaContable(String nombreAnalista , String profesion , int anhiosExperencia){
            this.nombreAnalista = nombreAnalista;
            this.profesion= profesion;
            this.anhionsExperencia = anhiosExperencia;
            
        }
        
        public String consultarNombreAnalista(){
            return nombreAnalista;
        }
        
        public void modificarNombreAnalista(String nombreAnalista){
            this.nombreAnalista=nombreAnalista;
        }
        
        public String consultarProfesion(){
            return profesion;
        }
        
        public void modificarProfesion(String profesion){
            this.profesion=profesion;
        }
        
        public int consultarAnhionsExperencia(){
            return anhionsExperencia;
        }
        
        public void modificarAnhiosExperencia(int anhiosExperencia){
            this.anhionsExperencia=anhiosExperencia;
        }
        
        
        
    } class EmpresaCliente {
        
        private String nombreEmpresa;
        private double cuotaMensual;
        private boolean estado;
        
        public EmpresaCliente(String nombreEmpresa , double cuotaMensual , boolean estado){
            this.nombreEmpresa = nombreEmpresa;
            this.cuotaMensual= cuotaMensual;
            this.estado = estado;
        }
        
        public String consultarNombreEmpresa(){
            return nombreEmpresa;
        }
        
        public void modificarNombreEmpresa(String nombreEmpresa){
            this.nombreEmpresa=nombreEmpresa;
        }
        
        public double consultarCuotaMensual(){
            return cuotaMensual;
        }
        
        public void modificarCuotaMensual(double cuotaMensual){
            this.cuotaMensual=cuotaMensual;
        }
        
        public boolean consultarEstado(){
            return estado;
        }
        
        public void modificarEstado(boolean estado){
            this.estado=estado;
            
        }
        
    }
