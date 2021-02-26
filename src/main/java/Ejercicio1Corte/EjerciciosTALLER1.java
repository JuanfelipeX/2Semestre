package Ejercicio1Corte;

import java.util.Scanner;

public class EjerciciosTALLER1 {
    
    public static void main(String[] args) {
        opciones();
    }
    
    public static int lista(){
       Scanner datos = new Scanner(System.in);
        System.out.println(" 1. Cuadrante plano cartesiano ");
        System.out.println(" 2. Clasificar según IMC. ");;
        System.out.println(" 3. Tipo de triangulo.");
        System.out.println(" 4. Salir");
        System.out.println(" Digite opcion ");
        int opcion = datos.nextInt();
        return opcion;
     }
    
    public static void caso1(){
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresó a la opción 1: Cuadrante plano cartesiano"); 
                System.out.println(" Cordenadas X y Y (separadas por &): ");
                 String XY = datos.nextLine();
                 String [] sepa = XY.split("&");          
                 int X = Integer.parseInt(sepa[0]);                  
                 int Y = Integer.parseInt(sepa[1]);           
                if (X == 0 && Y!= 0){
                    System.out.println(" Dato mal ingresado en Y");
                } if ((X != 0 && Y == 0)) {
                    System.out.println(" Dato mal ingresado en X");
                } if (X==0 && Y==0){
                    System.out.println(" El punto esta en el origen");
                } if (X>0 && Y>0) {
                    System.out.println(" El punto esta en el cuadrante 1");
                } if (X<0 && Y>0) {
                    System.out.println(" El punto esta en el cuadrante 2");
                } if (X<0 && Y<0) {
                    System.out.println(" El punto esta en el cudrante 3");
                } if (X>0 && Y<0) {
                    System.out.println(" El punto esta en el cudrante 4");
                }
            }
    
    public static void caso2(){
        Scanner datos = new Scanner(System.in);
         System.out.println("Ingresó a la opción 2: IMC");
                System.out.println(" Ingrese el peso y altura(separados por &): ");
                String PesoAltura = datos.nextLine();
                String [] sepa = PesoAltura.split("&");          
                 double peso = Double.parseDouble(sepa[0]);                  
                 double altura = Double.parseDouble(sepa[1]);
                if (peso<0) {
                    System.out.println(" Numero incorrecto ");
                } else {
                double Imc= (peso)/(altura*altura);
                if (Imc < 18.5) {
                System.out.println(" Su IMC es de " + Imc + " y su categoria es Bajo peso ");
                } if ( Imc>=18.5 && Imc<24.9) {
                System.out.println(" Su IMC es de " + Imc + " y su categoria es Normal ");
                } if ( Imc >= 25 && Imc<29.9) {
                System.out.println(" Su IMC es de " + Imc + " y su categoria es Sobrepeso ");
                } if (Imc>=30) {
                System.out.println(" Su IMC es de " + Imc + " y su categoria es Obesidad ");
                }
                }
    }
    
    public static void caso3(){
        Scanner datos = new Scanner(System.in);
         System.out.println("Ingresó a la opción 3: Tipo Triangulo ");
                System.out.println(" Ingrese la longitud de los tres lados (separados por &): ");
                String Longitud = datos.nextLine();
                String [] sepa = Longitud.split("&");          
                 double L1 = Double.parseDouble(sepa[0]);                  
                 double L2 = Double.parseDouble(sepa[1]);
                 double L3 = Double.parseDouble(sepa[2]);
               if (L1==L2 && L2==L3)
               System.out.println(" El Triangulo es ingresado es: Equilatero ");
               else{
                   if (L1==L2 || L1==L3 || L2==L3)
                   System.out.println(" El Triangulo es ingresado es: Isoceles ");
                   else {
                   if (L1!=L2 || L1!=L3 || L3!=L2)
                    System.out.println(" El Triangulo es ingresado es: Escaleno");
                   }
               }
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
                System.out.println(" Programa terminado... ");
                System.exit(0);
                break;
            default:
                System.out.println(" Error: Opcion no existente... ");
        }
         }while(opc!=4);
     }
}

 
        
    


