package Semillero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Secret_Word {  // https://vjudge.net/contest/415545#problem/S
    
    public  String cadena;
    
    public void metodo1()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String [] words = new String [size];
        for (String i : words) {
            cadena = br.readLine();
        }
        for (String i : words) {
        System.out.println(cadena);
        }
    }

    public static void main(String[] args) throws IOException {
        Secret_Word secrect = new  Secret_Word();
        secrect.metodo1();
    }
}
}
