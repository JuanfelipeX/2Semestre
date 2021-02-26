
package Semillero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TreeMap {
    
    public static void main(String[] args) {
        TreeSet<Integer> A = new TreeSet<>();
        A.add(789345793);
        for (int i = 10; i >= 0; i--) {
            A.add(i);
        }
        A.add(3);
        A.add(3);
        A.add(3);
        A.add(3);
        A.add(5); 
        System.out.println(A);
        A.remove(6);
        System.out.println(A);
        System.out.println("Tiene 6: " + A.contains(6));
        A.pollFirst();
        System.out.println(A);
        A.pollLast();
        System.out.println("A:" + A);
        
        TreeSet<Integer> B = new TreeSet<>();
        B.add(388);
        B.add(15);
        B.add(4);
        System.out.println("B: " + B);
        A.addAll(B); //Unión de conjuntos
        System.out.println("A U B = " + A);
        //A.retainAll(B); //Intersección de conjuntos
        //System.out.println("A n B = " + A);
           
        TreeSet<Integer> C = (TreeSet<Integer>)A.subSet(3, 7);
        System.out.println(C);
        
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Arles", 24));
        jugadores.add(new Jugador("Lebrown James", 3));
        jugadores.add(new Jugador("Harry Potter", 2));
        jugadores.add(new Jugador("Konrad Lorenz", 7));
        jugadores.add(new Jugador("ana", 7));
        jugadores.add(new Jugador("Arturo", 7));
        
        Collections.sort(jugadores);  
       
        System.out.println(jugadores);
        
        System.out.println(jugadores);
        TreeSet<Jugador> conjJug = new TreeSet<>();
        conjJug.addAll(jugadores);
        System.out.println(conjJug);
    }
}


class Jugador implements Comparable<Jugador>{
    String nombre;
    int puntaje;

    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", puntaje=" + puntaje + '}';
    }

    @Override
    public int compareTo(Jugador o) { 
        // this > o return > 0 (1)
        // this == o return 0
        // this < o return < 0 (-1)
        int cmp = o.puntaje - this.puntaje;
        
        if(cmp == 0){
            return this.nombre.toLowerCase().compareTo(o.nombre.toLowerCase());
        }
        
        return cmp;
    }  
}