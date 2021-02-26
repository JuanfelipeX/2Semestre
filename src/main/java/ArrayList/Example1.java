
package ArrayList;

import java.util.ArrayList;

public class Example1 {

    public static void main(String[] args) {
        ArrayList <Personas> listaPersonas = new ArrayList <>();
        Personas personas1 = new Personas("pepe" , 25);
        listaPersonas.add(personas1);
        listaPersonas.add(new Personas("carlos", 21));  // agregar directamente el objeto
        listaPersonas.add(2, new Personas("Maria", 1));  //se puede espicificar su posicion,  SI se coloca una posicion ya existente simplemente cambia la posicion   ,   SI se coloca una posicion mayor al tamaño da error
        System.out.println(listaPersonas );  
        System.out.println(listaPersonas.get(0));   // imprime los datos de la posicion seleccionada
        
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getEdad()<18) {
                System.out.println("Personas Menores de edad " + listaPersonas.get(i));
            }
        }
            
       /* FOR MEJORADO CON PERSONAS MENORES DE EDAD
            for(Personas pers : listaPersonas){
                if (pers.getEdad() < 18) {
                   // System.out.println("Personas Menores de edad " + pers.getEdad()); Aqui muestra cuantas personas son menores de edad
                    System.out.println("Personas Menores de edad " + pers);
                }
            }
           // */
      //  listaPersonas.get(posicion) = null;  esto seria para borrar los datos hacerlos "null"
      
      
        int indice = listaPersonas.indexOf(personas1);  // retorna el indice o posicion del objeto
        System.out.println("la posicion del objeto es: " + indice);
        int indiceUno = 1;  //CARLOS 
        int indiceDos = 2;  //Maria
      //  listaPersonas.add(indiceUno, listaPersonas.get(indiceDos));  // intercambiar posiciones
      //  System.out.println("despues del intercambio " + listaPersonas);
        
        if (listaPersonas.get(indiceDos).isOcupado() == true) {
            //El espacio No esta DISPONIBLE
            System.out.println("Esta busy");
        }
        else{
            //set
            Personas personas5 = listaPersonas.get(indiceUno);
            listaPersonas.set(indiceDos, personas5);
        }
    }
}






class Personas {
    private String nombre;
    private int edad;
    private boolean ocupado ;

    public Personas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupado=true;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isOcupado() {
        return ocupado;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "persona1{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
