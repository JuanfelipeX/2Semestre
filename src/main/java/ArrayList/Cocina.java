package ArrayList;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cocina {
    public int n;
    private Scanner sc;
    private Receta receta;   
    ArrayList<Receta> recetario = new ArrayList<>();

    public Cocina() {
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) throws IOException{
        Cocina menu = new Cocina();
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
        String cadenaMenu = "\n---Cocina Don Pipe---";
        cadenaMenu += "\n0. Salir.";
        cadenaMenu += "\n1. Añadir receta.";
        cadenaMenu += "\n2. Eliminar recetas que no hayan sido aprobadas.";
        cadenaMenu += "\n3. Consultar recetas que tengan un ingrediente en particular.";
        cadenaMenu += "\n4. Imprimir recetas seleccionando el tipo.";
        System.out.println(cadenaMenu);
    }

    private void ejecutarOpcion(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("Ingreso la opción: 1 " + "\n" + "Añadir receta. ");
                anadirReceta();
                break;
            case 2:
                System.out.println("Ingreso la opción: 2 " + "\n" + "Eliminar recetas que no hayan sido aprobadas. ");
                eliminarReceta();
                break;
            case 3:
                System.out.println("Ingreso la opción: 3 " + "\n" + "Consultar recetas que tengan un ingrediente en particular. ");
                consultarRecetaParticular();
                break;
            case 4:
                System.out.println("Ingreso la opción: 4 " + "\n" + "Imprimir recetas seleccionando el tipo. ");
                imprimirReceta();
                break;
            default:
                System.out.println("Gracias por utilizer el Sistema.");
        }
    }

    private void anadirReceta() {
        System.out.println("Agrege la receta separados por (&)");
        String texto = sc.nextLine();
        String[] dato = texto.split("&");
        String nombre = dato[0];
        int timePreparation = Integer.parseInt(dato[1]);
        String tipo = dato[2];
        System.out.println("Cantos ingredientes va a agregar");
        n = Integer.parseInt(sc.nextLine());
        String [] ingredientesApoyo = new String [n];
        System.out.println("Ingrese los ingredientes separados por (&)");
        String [] texto2 = sc.nextLine().split("&");
        for (int i = 0; i < n; i++) {
            ingredientesApoyo[i] = texto2[i];
        }
        System.out.println("¿Fue aceptado por el chef?");
        String optionChef = sc.nextLine();
        if (optionChef.equalsIgnoreCase("si")) {
          Receta receta = new Receta(nombre, timePreparation, tipo , true);  
          receta.setIngredientes(ingredientesApoyo);
          recetario.add(receta);
          System.out.println(recetario);
        } else {
            System.out.println("No fue aprobado :c");
            Receta receta = new Receta(nombre, timePreparation, tipo , false);  
            receta.setIngredientes(ingredientesApoyo);
            recetario.add(receta);
            System.out.println(recetario);
        }
    }
    
    private void eliminarReceta() {
        for (int i = 0; i < recetario.size(); i++) {
            if (recetario.get(i).isEstado()==false) {
                System.out.println(recetario);
            }
        }
        System.out.println("Ingrese la posicion de la receta (1,n) ");
        int posicionBorrar = Integer.parseInt(sc.nextLine());
        recetario.remove(posicionBorrar-1);      //se puede hacer con removeIf, Revisar
        System.out.println(recetario);
    }

    private void consultarRecetaParticular() {
        
      /* Esta Mal porque no esta tomando ningun criterio xddd
        for (int i = 0; i < recetario.size(); i++) {
            if ((recetario.get(i).getIngredientes()).equals(recetario.get(i).getIngredientes()))  {
                System.out.println(recetario.get(i));
            }
        }
      */
        
        System.out.println("Ingrese el ingrediente ");
        String ingredienteBusca = sc.nextLine();
        for (int i = 0; i < recetario.size(); i++) {
            boolean contieneIngrediente = false;   // recorrer cada ingrediente de la lista
            for (String ingrediente : recetario.get(i).getIngredientes()) {  // se usa equals() para comparar cadenas
                if (ingrediente.equals(ingredienteBusca)) {   // si existe en esta lista terminar la iteración
                    contieneIngrediente = true;
                    break;
                }
            }
            if (contieneIngrediente) {  
                System.out.println(recetario.get(i));
            }
        }   
        
        /* Yo lo pensaba asi pero esta mal xd
        for (int i = 0; i < recetario.size(); i++) {
            if (recetario.get(i).getIngredientes().equals(ingredienteBusca)) {
                System.out.println(recetario.get(i));
            }
        }
        */
    }

    private void imprimirReceta() {
        System.out.println("Ingrese el tipo sabor(Sal, Dulce)");
        String kind = sc.nextLine();
        for (int i = 0; i < recetario.size(); i++) {
            if (recetario.get(i).getTipo().equalsIgnoreCase(kind)) {
                System.out.println(recetario.get(i));
            }
        }
    }
}






class Receta {
    private Cocina cocina;
    private String nombre;
    private String ingredientes[]; 
    private int tiempoDePreparacion;
    private String tipo;
    private boolean estado;

    public Receta(String nombre, int tiempoDePreparacion, String tipo, boolean estado) {  
        this.nombre = nombre;
        this.tiempoDePreparacion = tiempoDePreparacion;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public int getTiempoDePreparacion() {
        return tiempoDePreparacion;
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

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setTiempoDePreparacion(int tiempoDePreparacion) {
        this.tiempoDePreparacion = tiempoDePreparacion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        String salidaIngredientes = "";
        for (int i = 0; i < ingredientes.length; i++) {
            salidaIngredientes+= "," + ingredientes[i];  //+= concatena
        }
        return "Receta{" + "nombre=" + nombre + ", ingredientes=" + salidaIngredientes + ", tiempoDePreparacion=" + tiempoDePreparacion + ", tipo=" + tipo + ", Estado=" + estado + '}';
    }

}
/*

cake&120&dulce
2
agua&harina
no


burger&60&sal
2
harina&agua
si

pasta&20&sal
1
carne
no



for (int i = 0; i < n; i++) {
            ingredientesApoyo[i] = texto2[i];
        }
        receta.setIngredientes(ingredientesApoyo); 
        System.out.println("¿Fue aceptado por el chef?");
        String optionChef = sc.nextLine();
        if (optionChef.equalsIgnoreCase("si")) {
          Receta receta = new Receta(nombre, timePreparation, tipo , true);  
          recetario.add(receta);
          System.out.println(recetario);
        } else {
            System.out.println("No fue aprobado :c");
            Receta receta = new Receta(nombre, timePreparation, tipo , false);  
            recetario.add(receta);
            System.out.println(recetario);
        }


for (int i = 0; i < recetario.size(); i++) {
            if (receta.isEstado()==false) {
                System.out.println(recetario);
            }
        }
        System.out.println("Ingrese la posicion de la receta (1,n) ");
        int posicionBorrar = Integer.parseInt(sc.nextLine());
        recetario.remove(posicionBorrar-1);      //removeIf
        System.out.println(recetario);
    }

*/


