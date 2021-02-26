
package Semillero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coins {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           int numero = Integer.parseInt(br.readLine());
           for (int i = numero; i > 0; i--) {
            if (numero%i==0) {
                System.out.print(numero=i);
                System.out.print(" ");
            }
        }
    }
}  

