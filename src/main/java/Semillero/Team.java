
package Semillero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Team {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Petya, Vasya, Tonya , Suma , Conteo=0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] numeros = br.readLine().split(" ");
                Petya = Integer.parseInt(numeros[0]);
                Vasya = Integer.parseInt(numeros[1]);
                Tonya = Integer.parseInt(numeros[2]);
    
            Suma = Petya + Vasya + Tonya;
            if (Suma>=2)  {
                Conteo++;
            }
        } 
        System.out.println(Conteo);
    }   
}

    
