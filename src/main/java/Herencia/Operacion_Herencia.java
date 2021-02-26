package Herencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operacion_Herencia {
    
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    protected int valor1;
    
    protected int valor2;
    
    protected int resultado;
    
    public void carga1() throws IOException{
    
        System.out.println("Ingrese el valor: ");
        valor1 = Integer.parseInt(br.readLine());
    }
    
    public void carga2() throws IOException{
    
        System.out.println("Ingrese el valor: ");
        valor2 = Integer.parseInt(br.readLine());
    }
    
    public void mostrarResultado(){
        System.out.println(resultado);
    }
    
    public static void main(String[] args) throws IOException {
        try{
        Suma s1 = new Suma();
        Resta s2 = new Resta();
        s1.carga1();
        s1.carga2();
        System.out.println("La suma es: ");
        s1.operarSuma();
        s1.mostrarResultado();
        
        s2.carga1();
        s2.carga2();
        System.out.println("La resta es: ");
        s2.operarResta();
        s2.mostrarResultado();
        } catch (Exception e){
            System.out.println("Error " + e);
        }
    }
}


class Suma extends Operacion_Herencia{

public void operarSuma(){
    resultado = valor1+valor2;
}

}

class Resta extends Operacion_Herencia{
    
    public void operarResta(){
    resultado = valor1-valor2;
} 
    
}