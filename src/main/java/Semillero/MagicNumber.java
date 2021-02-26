
package Semillero;

 //@author pipes
import java.util.Scanner;
 
public class MagicNumber {
    
    // Un número mágico es un número formado por la concatenación de los números 1 , 14 y 144 . 
    // Podemos usar cada uno de estos números cualquier número de veces. Por lo tanto , 14144 , 141414 y 1411 son números mágicos, pero 1444 , 514 y 414 no lo son. 
    // Te dan un número. Determina si es un número mágico o no., Escriba " SÍ " si n es un número mágico o imprima " NO " si no lo es.
    
static String checkNumber(int numero) 
{ 
	int validador = numero; 

	while (validador > 0) { 
		
		if (validador % 1000 == 144) 
			validador /= 1000;
		else if (validador % 100 == 14) 
			validador /= 100; 
		else if (validador % 10 == 1) 
			validador /= 10; 
		else { 
			return "NO"; 
		} 
	}
        
	return "YES"; 
}

	public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int numero = sc.nextInt();
            
	System.out.println(checkNumber(numero)); 
	} 
} 

