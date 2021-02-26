package Static;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operations {
    
    public static int sumaOperations(int x , int y){
        
        return x+y;
    }
    
    public static int RestaOperations(int x , int y){
        
        return x-y;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el primer numero");
        int n1 = Integer.parseInt(br.readLine());
        System.out.println("Ingrese el segundo numero");
        int n2 = Integer.parseInt(br.readLine());
        System.out.println("La Suma es: " + Operations.sumaOperations(n1, n2));  //No se necesito crear declarar un objeto
        System.out.println("La Resta es: " + Operations.RestaOperations(n1, n2));
        
                
    }
}
