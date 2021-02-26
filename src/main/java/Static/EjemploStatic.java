package Static;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploStatic {  //se podria que static es una costante global, ya que los objetos son siempre son iguales en la clase

   public static String cadena;  //toca hacerlo estatico para que pueda acceder al metodo
    
    public static void ExampleStatic()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String [] words = new String [size];
        for (String i : words) {
            cadena = br.readLine();
        }
        for (String i : words){
            System.out.println(cadena);       //va imprimir lo mismo ya que static convierte todos los objetos en el mismo, apesar de haberle ingresado diferentes datos
        }
            

    }
    

    public static void main(String[] args) throws IOException {
        EjemploStatic.ExampleStatic();  //No es necesario inicializar en objeto con static
        nuevoStatic.ExampleStatic();
    }
}


class nuevoStatic extends EjemploStatic{ //apesar de que heredan no comparten el metodo ExampleStatic, ni atributos
    
    public static void ExampleStatic(){  //apesar de que tienen el mismo nombre y heredan no aplica el overriding
        System.out.println("Hola");
        
    }
}