package Ejercicio1Corte;




import java.util.Scanner;

public class SentenciasControl {

    public static void main(String[] args) {
        opciones();
    }
    
     public static void opciones(){    
        Scanner datos = new Scanner(System.in); 
         int opc;
        do{
             opc=lista();
        switch (opc){
            case 1:
                caso1();
                break;
            case 2:
                caso2();
                break;
            case 3:
                caso3();
                break;
            case 4:
                caso4();
                break;
            case 5:
                caso5();
                break;
            case 6:
                System.out.println(" Programa terminado... ");
                System.exit(0);
            default:
                System.out.println(" Error: Opcion no existente... ");
        }
         }while(opc!=6);
     }
     
     public static int lista(){
       Scanner datos = new Scanner(System.in);
        System.out.println(" 1. Break ");
        System.out.println(" 2. Continue ");;
        System.out.println(" 3. If Sin llaves");
        System.out.println(" 4. For Each");
        System.out.println(" 5. Return");
        System.out.println(" Terminar Programa ");
        System.out.println(" Digite opcion ");
        int opcion = datos.nextInt();
        return opcion;
     }
     
     public static void caso1(){
        for (int i = 0; i < 100; i++) {
            System.out.println("el numero es: " + i);
            if (i==50) {
                break;  // se usa romper un ciclo
            }
        }
    }
     
     public static void caso2(){
       for (int i = 0; i < 10; i++) {
            if(i==6){
                continue;           // Se usa para terminar itearcion dentro de un ciclo
            }
            System.out.println(" i " + i); 
        }
     }
     
     public static void caso3(){
         Scanner datos = new Scanner(System.in);
        System.out.println("5+5= ");
        int respuesta = Integer.parseInt(datos.nextLine());
        if (respuesta == 5)  // Cuando no hay llaves toma la siguiente linea, si evalua la condicion
            System.out.println("nice ");
            for (int i = 1; i <=3 ; i++) 
                System.out.println(i);
         if (respuesta!=5) {
            System.out.println(" asnwer bad ");
        }
     }
     
     public static void caso4(){
          //  Estructura
           //  for(tipo variable: nombrearreglo){
           //  System.out.println(variableiteraccion );
           
          int [] numeros = new int [3];
          numeros[0] = 10;
          numeros[1] = 20;
          numeros[2] = 30;
           for (int item:numeros) {          //   for (int i = 0; i < numeros.length; i++) {
           System.out.println(item);         // System.out.println(numeros[i]);
                                             //  }
        }
     }
     
     public static void caso5(){
	for (int cont=1; cont <=100; cont++){
		if(cont == 50){
			return;
                }
		System.out.println("El número es: " + cont);
	}
     }
}
