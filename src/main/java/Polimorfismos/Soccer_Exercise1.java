package Polimorfismos;

import java.util.ArrayList;

public class Soccer_Exercise1 {   //father class, seleccion futbol

    protected Integer id;  // Integer Por las arraylist
    
    protected String nombre;
    
    protected String apellidos;
    
    protected Integer edad;
    
    public static ArrayList<Soccer_Exercise1> team = new ArrayList<Soccer_Exercise1>();

    public Soccer_Exercise1(Integer id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    
    public void viaje(){
        System.out.println("Viaje (clase Father) ");
    }
    
    public void partidoSoccer(){
        System.out.println("Asiste al partido de futbol (Clase Father) ");
    }

    
    
    public static void main(String[] args) {
        
        //polimorfismo
        Soccer_Exercise1 Benzema = new Futbolista(1, "Andres", "Benzema", 2, 18, "Interior Derecho");  
        Soccer_Exercise1 Ramirez = new Entredaor(2, "Ramirez", "Moreno", 60, 40);
        Soccer_Exercise1 delBosque = new Masajista(3, "Vicente", "Del Bosque", 23, "Licenciado en Fisioterapia", 2);
        
        team.add(Benzema);
        team.add(Ramirez);
        team.add(delBosque);
        
        for (Soccer_Exercise1 teams : team) {  // (Todos ejecutan el mismo método)
			System.out.print(teams.getNombre() + " " + teams.getApellidos() + " -> ");
			teams.viaje();
        }
        
        System.out.println("\n" + "Partido: Todos los integrantes tienen su función en un partido (Especialización) ");  //partido de futbol
        for (Soccer_Exercise1 teams : team) {
	System.out.print(teams.getNombre() + " " + teams.getApellidos() + " -> ");
	teams.partidoSoccer();
        }
        
        // ENTREVISTA
        System.out.println("\n" + "Entrevista: Solo el futbolista tiene el método para dar una entrevista:");
        System.out.print(Benzema.getNombre() + " " + Benzema.getApellidos() + " -> ");
        ((Futbolista) Benzema).entrevista();

        
        // PLANIFICAR ENTRENAMIENTO
        System.out.println("\n" + "Planificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
        System.out.print(Ramirez.getNombre() + " " + Ramirez.getApellidos() + " -> ");
        ((Entredaor) Ramirez).planificaEntrenamiento();
        
        // MASAJE
        System.out.println("\n" + "Masaje: Solo el masajista tiene el método para dar un masaje:");
        System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
        ((Masajista) delBosque).message();
        
        
        System.out.println("\n" + "Imprimiendo al team con ToString: ");
        System.out.println(Benzema.toString()); //futbolista
        System.out.println(Ramirez.toString()); // entrenador
        System.out.println(delBosque.toString()); //masajista
                
    }
}



class Futbolista extends Soccer_Exercise1 {
    
    private Integer dorsal;
    
    private String posicioDeJuego;

    public Futbolista(Integer dorsal, String nombre, String apellidos, Integer id, Integer edad, String posicioDeJuego) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.posicioDeJuego = posicioDeJuego;
    }
    
    @Override
    public void partidoSoccer(){   //Sobreescritura de metodos
        System.out.println("Juega partido de futbol (Clase Futbolista) ");
    }
    
    public void entrevista(){
        System.out.println("Da una entrevista");
    }

    @Override
    public String toString() {
        return "Futbolista{" + "dorsal=" + dorsal + ", nombre=" + nombre + ", apellidos=" + apellidos +  "id=" + id +", edad=" + edad + ", posicioDeJuego=" + posicioDeJuego + '}';
    }
    
}




class Entredaor extends Soccer_Exercise1{
    
    private Integer idFederacion;

    public Entredaor(Integer idFederacion,String nombre, String apellidos, Integer id, Integer edad ) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void partidoSoccer(){   //Sobreescritura de metodos
        System.out.println("Dirije al equipo (Clase Entrenador) ");
    }
    
    public void planificaEntrenamiento(){
        System.out.println("Planifica el entrenamiento ");
    }
    
    @Override
    public String toString() {
        return "Entredaor{" + "idFederacion=" + idFederacion + ", nombre=" + nombre + ", apellidos=" + apellidos +  ", id=" + id + ", edad=" + edad + '}';
    }
    
}





class Masajista extends Soccer_Exercise1{

    public Masajista( Integer id, String nombre, String apellidos, Integer edad,String titulacion, Integer aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    
    private String titulacion;
    
    private Integer aniosExperiencia;
    
    @Override
    public void partidoSoccer(){   //Sobreescritura de metodos
        System.out.println("Da asistencia al equipo (Clase Masajista) ");
    }
    
    public void message(){
        System.out.println("Da un mensaje");
    }

    @Override
    public String toString() {
        return "Masajista{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos +  ", edad=" + edad + ", titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + '}';
    }
    
}