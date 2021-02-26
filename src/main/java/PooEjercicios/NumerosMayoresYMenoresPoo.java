package PooEjercicios;

import java.util.Scanner;

public class NumerosMayoresYMenoresPoo {
    
  int mayor = Integer.MIN_VALUE;
  int menor = Integer.MAX_VALUE;
    
    public static void main(String args[]) {
        
        NumerosMayoresYMenoresPoo n = new NumerosMayoresYMenoresPoo();
        n.procesarNumeros();
    }
    
    private void procesarNumeros(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de números a leer: ");
        
        int numerosALeer = sc.nextInt();
        
        for(int i = 1; i <= numerosALeer; i++){
            System.out.println("Introduzca el número " + i);
            establecerNumeroMayorYMenor(sc.nextInt());
        }   
        
        System.out.println("El mayor es " + mayor);
        System.out.println("El menor es " + menor);
        
    }
    
    private void establecerNumeroMayorYMenor(int n){
        if(n > mayor) mayor = n;
        if(n < menor) menor = n;
    }
    
}
    

