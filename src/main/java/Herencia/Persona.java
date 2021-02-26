
package Herencia;

public class Persona {    //ejemplo 1

    private final String nombre;
    private final String apellido;
    private static int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("carlos", "perez", 12 , 123123, 23);
    }
}


class Estudiante extends Persona {
    
    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
        
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre() + "\n"
                + "Apellido: " + getApellido() + "\n"
                        + "Edad: " + getEdad()
                            + "Codigo: " + getCodigoEstudiante() + "\n"
                                + "Nota Final: " + getNotaFinal());
    }
 }
    
