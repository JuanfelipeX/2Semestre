
package Semillero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XOR_JavaHotSpot12 {   
    
    //Given two logic values p and q (0 or 1) please compute p XOR_JavaHotSpot12 q.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto = br.readLine();
        String [] dato = texto.split(" ");
        int a = Integer.parseInt(dato[0]);
        int b = Integer.parseInt(dato[1]);
        System.out.println(a^b);
    }  
}

 
/*
en Java(HotSpot 12) subirlo asi   NO OLVIDAR LOS IMPORTS
         
import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	}
}

*/