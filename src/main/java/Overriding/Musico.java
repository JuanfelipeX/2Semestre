
package Overriding;


public class Musico {
    
    public String tipo;
    
    public void tocar(){
        System.out.println("Estoy tocando musica");
    }

    
    public static void main(String[] args) {
      
        Musico artista = new Musico();
        Pianista artista2 = new Pianista();
        artista.tocar();
        artista2.tocar();
    }
}

class Pianista extends Musico{
    
    @Override
    public void tocar(){
        System.out.println("Estoy tocando el piano");  //REDEFINE EL METODO 
    }
    
    
}
