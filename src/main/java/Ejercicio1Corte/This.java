
package Ejercicio1Corte;

public class This {

    int x = 12;
    
    private void example(){
        int x= 21;
        System.out.println("Este es el ejemplo con x");
        System.out.println("esta x es la de la clase (this) " + this.x);  //this referencia al objeto de la clase
        System.out.println("esta es x es la del metodo " + x );
    }
    public static void main(String[] args) { 
        This ejemplo = new This();
        EjemploThis example2 = new EjemploThis();
        ejemplo.example();
        example2.metodoEjemplo();
    }
}

class EjemploThis{
    
        private int t= 1;
        
        public void metodoEjemplo(){
            int t=2;
            System.out.println("esta es la q de la clase (this) " + this.t);
            System.out.println("esta es x es la del metodo " + t);
        }
}
