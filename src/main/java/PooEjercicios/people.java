package PooEjercicios;


public class people {   //Programa genera error clase no encontrada ayuda xd

    public static void main(String[] args) {
        People person1 = new People(213123); //213123 dato de identificacion
        person1.modificarNombre("NombreModificar:v");
        person1.consultarNombre();
        System.out.println(" Nombre consultado con GET: " + person1.consultarNombre());  //llamado Get
        System.out.println(person1.toString());
    } 
}

    







class People {
    private String nombrePersona;   //Atributos clase
    private int identificacion;
    
    public People (int identificacion){  //Constructor
        this.identificacion = identificacion;
    }
     
    //Metodos de clase
    public String consultarNombre(){  //get
        return nombrePersona;
    }
    
    public void modificarNombre(String nombrePersona){  //set
        // this.nombrePersona; es el atribuo de clase    =nombrePersoa es el parametro recibido
        this.nombrePersona = nombrePersona;
    }

    @Override
    public String toString() {
        return "People{" + "nombrePersona=" + nombrePersona + ", identificacion=" + identificacion + '}';
    }
    
}  


