package ProyectoFinal_Coches;

import java.util.ArrayList;
import java.util.Scanner;

public class Consesionario {

    private Auto[][] auto = new Auto[5][3];
    private AutoUsado[][] autoUsado = new AutoUsado[5][3];
    private Scanner sc;
    private ArrayList<Factura> factura = new ArrayList<>();
    private Color[] color = new Color[15];

    public void ingresarClienta(int identificacion, int edad, String nombre, double presupuesto) {
        //nombre, int edad, int identificacion, double presupuesto, String tipoPago, int numeroCompra, String fechaCompra
        Factura cliente=buscarCliente(identificacion);
                
        if (cliente==null){
        factura.add(new Factura(nombre, edad, identificacion, presupuesto, null, 0, 0, "26/11/2020", null));    // PASA PARAMETROS VACIOS
        Factura clienteAux = buscarCliente(identificacion);
        if (clienteAux == null) {
            System.out.println("no se pudo ingresar el cliente");
        } else {
            System.out.println("cliente ingresado correctamente");
            System.out.println(clienteAux.toString1());
            comprarAuto(identificacion);
        }
        }else{
            System.out.println("el cliente ya existe");
        }
    }

    private Factura buscarCliente(int identificacion) {
        for (Factura factu : factura) {
            if (factu.mostrarIdentificacion() == identificacion) {
                return factu;
            }
        }
        return null;
    }

    private void catalogo() {
        //Auto[][] auto = new Auto[5][3];
        //AutoUsado[][] autoUsado = new AutoUsado[5][3]; 
        //String marca, String placas, int anhioModelo, double precio, String nitro, String nombre
        catalogoColores();
        auto[0][0] = new Auto("lamborgini", "Veneno", "clw542", 2020, 50000000, color[1].mostrarColor(), "no", false);
        auto[1][0] = new Auto("lamborgini", "urus", "fgd542", 2020, 30000000, color[0].mostrarColor(), "no", false);
        auto[2][0] = new Auto("lamborgini", "limbo", "asd752", 2010, 45000000, color[1].mostrarColor(), "no", false);
        auto[3][0] = new Auto("lamborgini", "rapido", "sfe524", 2019, 37000000, color[3].mostrarColor(), "no", false);
        auto[4][0] = new Auto("lamborgini", "aventador", "gdv452", 2018, 88000000, color[0].mostrarColor(), "no", false);
        auto[0][1] = new Auto("BMW", "maserati", "tnd754", 2019, 55000000, color[1].mostrarColor(), "no", false);
        auto[1][1] = new Auto("BMW", "veneno", "zbf752", 2020, 65000000, color[0].mostrarColor(), "no", false);
        auto[2][1] = new Auto("BMW", "aventdor", "aaa111", 2012, 60000000, color[4].mostrarColor(), "no", false);
        auto[3][1] = new Auto("BMW", "chiron", "htr520", 2013, 10000000, color[0].mostrarColor(), "no", false);
        auto[4][1] = new Auto("BMW", "optra", "vdr541", 2014, 28000000, color[4].mostrarColor(), "no", false);
        auto[0][2] = new Auto("Tesla", "aventador sv", "ert547", 2015, 39000000, color[1].mostrarColor(), "no", false);
        auto[1][2] = new Auto("Tesla", "panamera", "gre845", 2021, 75000000, color[3].mostrarColor(), "no", false);
        auto[2][2] = new Auto("Tesla", "sesto  elemento", "gre755", 2011, 64000000, color[5].mostrarColor(), "no", false);
        auto[3][2] = new Auto("Tesla", "allegro", "ger8421", 2016, 35000000, color[1].mostrarColor(), "no", false);
        auto[4][2] = new Auto("Tesla", "corsa", "gsh8723", 2017, 64000000, color[3].mostrarColor(), "no", false);
        // autos viejos
        autoUsado[0][0] = new AutoUsado("Chevrolet", "camaro", "gdv258", 2020, 5200000, color[1].mostrarColor(), "no", false);
        autoUsado[1][0] = new AutoUsado("Chevrolet", "optra", "sfb516", 2020, 3050000, color[3].mostrarColor(), "no", false);
        autoUsado[2][0] = new AutoUsado("Chevrolet", "centorno", "ndc834", 2007, 1000000, color[2].mostrarColor(), "no", false);
        autoUsado[3][0] = new AutoUsado("Chevrolet", "corsa", "pñd551", 2002, 4500000, color[3].mostrarColor(), "no", false);
        autoUsado[4][0] = new AutoUsado("Chevrolet", "urus", "fsf875", 2010, 7800000, color[2].mostrarColor(), "no", false);
        autoUsado[0][1] = new AutoUsado("Masda", "maserati", "gvd843", 2019, 7950000, color[1].mostrarColor(), "no", false);
        autoUsado[1][1] = new AutoUsado("Masda", "allegro", "hfd654", 2000, 99200000, color[2].mostrarColor(), "no", false);
        autoUsado[2][1] = new AutoUsado("Masda", "divo", "hrf843", 2062, 6500000, color[5].mostrarColor(), "no", false);
        autoUsado[3][1] = new AutoUsado("Masda", "allegro", "hdf824", 2012, 1200000, color[2].mostrarColor(), "no", false);
        autoUsado[4][1] = new AutoUsado("Masda", "egoista", "hdf842", 2012, 2500000, color[1].mostrarColor(), "no", false);
        autoUsado[0][2] = new AutoUsado("Nissan", "gtr", "gef452", 2015, 3900000, color[3].mostrarColor(), "no", false);
        autoUsado[1][2] = new AutoUsado("Nissan", "miura", "gdf878", 2010, 7572000, color[5].mostrarColor(), "no", false);
        autoUsado[2][2] = new AutoUsado("Nissan", "aventador", "ybd998", 2011, 6460000, color[2].mostrarColor(), "no", false);
        autoUsado[3][2] = new AutoUsado("Nissan", "terzio milenio", "zzh545", 2016, 3554000, color[1].mostrarColor(), "no", false);
        autoUsado[4][2] = new AutoUsado("Nissan", "raptor", "llk541", 2017, 6460000, color[3].mostrarColor(), "no", false);
    }

    public void comprarAuto(int identificacion) {
        int codigo = (int) (Math.random() * 10000 + 99999); //NUMERO 6 CIFRAS
        for (int i = 0; i < auto.length; i++) {
            for (int j = 0; j < auto[0].length; j++) {
                if (auto[i][j] == null) {    //INICIA PROGRAMA NULL Y CUNANDO INGRESA CLIENTE INICIALIZA TDO
                    catalogo();
                }
            }
        }
         sc = new Scanner(System.in);
        System.out.println("que tipo de Auto desea?");
        System.out.println("1. nuevo \n2. usado");
        System.out.print("Seleccione una opción: ");
        int opcionSeleccionada = Integer.parseInt(sc.nextLine());
        int j = 0;
        switch (opcionSeleccionada) {
            case 1:
                System.out.println("que marca desea");
                for (int i = 0; i < auto[0].length; i++) {
                    j = i+1;
                    System.out.print((j ) + ". " + auto[0][i].mostrarMarca() + "\n"); //imprime marca disponi
                }
                System.out.print("Seleccione una marca: ");
                int marca = Integer.parseInt(sc.nextLine());
                
                if (marca > j && marca<0) {
                    System.out.println("marca incorrecta");
                    comprarAuto(identificacion);
                }
                j=0;
                for (int r = 0; r < auto.length; r++) {    //imprime los autos
                    if (auto[r][marca - 1] != null && auto[r][marca - 1].mostrarVendido() == false) {    //verificar si es null o vendido
                        j++;
                        System.out.print((j) + ". " + auto[r][marca - 1] + "\n");
                    }
                }
                System.out.print("Seleccione un auto: ");
                int carro = Integer.parseInt(sc.nextLine());
                if (carro > j && carro<0  ) {
                    System.out.println("opcion incorrecta");
                    comprarAuto(identificacion);
                }
                if(auto[carro - 1][marca - 1].mostrarVendido()==true){  
                    carro++;
                    System.out.println(marca-1 +carro-1);
                }
                System.out.println(auto[carro - 1][marca - 1]);
                Factura clienteNuevo = buscarCliente(identificacion);
                String pago = modoDePago();
                clienteNuevo.modificarTipoPago(pago);
                clienteNuevo.modificarValor(carro); //sets
                clienteNuevo.modificarNumeroCompra(codigo);
                auto[carro - 1][marca - 1].modificarVendido(true);  //modifica si se vendio
                clienteNuevo.modificarPlaca(auto[carro - 1][marca - 1].mostrarPlacas());  
                System.out.println("compro realizada con exito");
                System.out.println("FACTURA:");
                System.out.println(clienteNuevo.toString());
                break;
            case 2:
                System.out.println("que marca desea");
                for (int i = 0; i < autoUsado[0].length; i++) {
                    j = i+1;
                    System.out.print((j ) + ". " + autoUsado[0][i].mostrarMarca() + "\n");
                }
                System.out.print("Seleccione una marca: ");
                int marca1 = Integer.parseInt(sc.nextLine());
                System.out.println(j);
                if (marca1 > j && marca1<0) {
                    System.out.println("marca incorrecta");
                    comprarAuto(identificacion);
                }
                for (int r = 0; r < autoUsado.length; r++) {
                    if (autoUsado[r][marca1 - 1] != null && autoUsado[r][marca1 - 1].mostrarVendido() == false) {
                        j = r+1;
                        System.out.print((j) + ". " + autoUsado[r][marca1 - 1] + "\n");
                    }
                }
                System.out.print("Seleccione un auto: ");
                int carro1 = Integer.parseInt(sc.nextLine());
                if (carro1 > j && carro1<0 && autoUsado[carro1 - 1][marca1 - 1].mostrarVendido()==true) {
                    System.out.println("opcion incorrecta");
                    comprarAuto(identificacion);
                }
                if(autoUsado[carro1 - 1][marca1 - 1].mostrarVendido()==true){
                    carro1++;
                }
                System.out.println(autoUsado[carro1 - 1][marca1 - 1]);
                Factura clienteNuevo1 = buscarCliente(identificacion);
                String pago1 = modoDePago();
                clienteNuevo1.modificarTipoPago(pago1);
                clienteNuevo1.modificarValor(carro1);
                clienteNuevo1.modificarNumeroCompra(codigo);
                autoUsado[carro1 - 1][marca1 - 1].modificarVendido(true);
                clienteNuevo1.modificarPlaca(autoUsado[carro1 - 1][marca1 - 1].mostrarPlacas());
                System.out.println("compro realizada con exito");
                System.out.println("FACTURA:");
                System.out.println(clienteNuevo1.toString());
                break;
            default:
                System.out.println("numero incorrecto");
                comprarAuto(identificacion);
                break;
        }
    }

    public void modificarVehiculo(int identificacion) {
        Factura cliente = buscarCliente(identificacion);
        int valor = 0;
        if (cliente == null) {
            System.out.println("No se registra la compra de un auto porfavor compre uno para modificarlo");
        } else {
            System.out.println(cliente.toString1());
            boolean celador = true;
            int opcionSeleccionada;
            do {
                System.out.println("Que desea Modificar:");
                System.out.println("1. Color del vehiculo\n2.Agregar Nitro");
                System.out.print("Seleccione una opción: ");

                opcionSeleccionada = Integer.parseInt(sc.nextLine());

                if (opcionSeleccionada == 2 || opcionSeleccionada == 1) {
                    celador = false;
                } else {
                    System.out.println("opcion seleccionada incorrecta");
                }
            } while (celador);

            switch (opcionSeleccionada) {
                case 1:
                    valor = cambiarColor(cliente);
                    break;
                case 2:
                    valor = modificarNitro(cliente);
                    System.out.println(valor);
                    break;
            }
            if (valor != 0) {
                System.out.println("Factura");
                Factura clienteNuevo = buscarCliente(identificacion);  
                clienteNuevo.modificarValor(valor); //valor total de los cambios 
                factura.add(clienteNuevo);
                System.out.println(clienteNuevo.toString());
            }
        }
    }

    private void catalogoColores() {
        color[0] = new Color("rojo", 450000);
        color[1] = new Color("azul", 450000);
        color[2] = new Color("verde", 450000);
        color[3] = new Color("negro", 450000);
        color[4] = new Color("morado", 450000);
        color[5] = new Color("rojo metalizado", 600000);
        color[6] = new Color("azul metalizado", 600000);
        color[7] = new Color("verde metalizado", 600000);
        color[8] = new Color("negro metalizado", 600000);
        color[9] = new Color("morado metalizado", 600000);
        color[10] = new Color("rojo mate", 800000);
        color[11] = new Color("azul mate", 800000);
        color[12] = new Color("verde mate", 800000);
        color[13] = new Color("negro mate", 800000);
        color[14] = new Color("morado mate", 800000);
    }

    public int cambiarColor(Factura cliente) {
        String placa = cliente.mostrarPlaca();
        System.out.println(placa);
        catalogoColores();
        int valor = 0;
        int z = 0;
        int marca = 0;
        int lugar = 0;
        int tipo = 0;
        System.out.println("Colores disponibles:");
        for (int j = 0; j < color.length; j++) {
            z = j + 1;
            System.out.println(z + ". " + color[j]);

        }
        System.out.print("Seleccione una opcion: ");
        int colorNuevo = Integer.parseInt(sc.nextLine());
        if (colorNuevo <= color.length) { 
            for (int i = 0; i < auto.length; i++) {    // recrre la matriz
                for (int r = 0; r < auto[0].length; r++) {
                    if (auto[i][r].mostrarPlacas().equals(placa)) {   //buscar que coincide con las placas
                        marca = r;
                        lugar = i;
                        auto[marca][lugar].modificarColor(color[colorNuevo-1].mostrarColor());
                        tipo = 1;
                    }
                }
            }
            for (int i = 0; i < autoUsado.length; i++) {
                for (int r = 0; r < autoUsado[0].length; r++) {
                    if (autoUsado[i][r].mostrarPlacas().equals(placa)) {
                        marca = r;
                        lugar = i;
                        autoUsado[marca][lugar].modificarColor(color[colorNuevo-1].mostrarColor());  //añade los cambios hecho
                        tipo = 2;
                    }
                }
            }
            valor = color[colorNuevo-1].mostratPrecio();
            if (tipo == 1) {
                System.out.println(auto[marca][lugar].toString());
            } else if(tipo==2){
                System.out.println(autoUsado[marca][lugar].toString());
            }
        }else{
            System.out.println("opcion incorrecta...");
        }
        
        return valor;
    }

    public int modificarNitro(Factura cliente) {
        String placa = cliente.mostrarPlaca();
      /*  for (int i = 0; i < auto[0].length; i++) {
            for (int r = 0; r < auto.length; r++) {
                if (auto[r][i].mostrarPlacas().equals(placa)) {
                    
                }
            }
        }*/

        System.out.println("Precio de el tuneo de nitro $1500000 COP");
        System.out.println("Desea confirmar la modificacion del auto");
        String confirmar = (sc.nextLine());
        int marca = 0;
        int lugar = 0;
        int portero=0;
        switch (confirmar) {
            case "si":
                System.out.println("confirmado");
                for (int i = 0; i < auto[0].length; i++) {
                    for (int r = 0; r < auto.length; r++) {
                        if (auto[r][i].mostrarPlacas().equals(placa)) {//busca lasplacas
                            marca = r;
                            lugar = i;
                            auto[marca][lugar].modificarNitro("si");
                        }
                    }
                }

                for (int i = 0; i < autoUsado[0].length; i++) {
                    for (int r = 0; r < autoUsado.length; r++) {
                        if (placa == autoUsado[r][i].mostrarPlacas()) {
                            marca = r;
                            lugar = i;
                            auto[marca][lugar].modificarNitro("si");
                        }
                    }
                }

                System.out.println(auto[marca][lugar].toString());
                portero=1;
                break;
               
            case "no":
                System.out.println("saliendo...");
                break;
        }
        if(portero==1){
            return 1500000 ;
        }
        return 0;
    }

    public String modoDePago() {
        boolean celador = true;
        String pago;
        do {
            System.out.println("ingrse su tipo de pago (efectivo,tarjeta bancaria)");
            pago = (sc.nextLine());

            if (pago.equalsIgnoreCase("efectivo") || pago.equalsIgnoreCase("tarjeta bancaria")) {
                celador = false;
                if (pago.equalsIgnoreCase("tarjeta bancaria")){
                    System.out.println("porfavor ingrese los siguientes datos");
                    System.out.println("numero de targeta");
                    int numero =sc.nextInt();
                    System.out.println("clave");
                    int clave = sc.nextInt();
                }
            } else {
                System.out.println("tipo de pago incorrecto ");
            }
        } while (celador);  //ciclo pa ver si pasan 
        return pago;
    }

}
