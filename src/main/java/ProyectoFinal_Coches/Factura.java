/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal_Coches;

/**
 *
 * @author Camilo
 */
public class Factura {
    private String nombre;
    private int edad;
    private int identificacion;
    private double presupuesto;
    private String tipoPago;
    private int valor;
    private int numeroCompra;
    private String fechaCompra;
    private String placa;

    public Factura(String nombre, int edad, int identificacion, double presupuesto, String tipoPago,int valor ,int numeroCompra, String fechaCompra,String placa) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.presupuesto = presupuesto;
        this.tipoPago = tipoPago;
        this.numeroCompra = numeroCompra;
        this.fechaCompra = fechaCompra;
    }

    public String mostrarNombre() {
        return nombre;
    }

    public int mostrarEdad() {
        return edad;
    }

    public int mostrarIdentificacion() {
        return identificacion;
    }

    public double mostrarPresupuesto() {
        return presupuesto;
    }

    public String mostrarTipoPago() {
        return tipoPago;
    }

    public int mostrarNumeroCompra() {
        return numeroCompra;
    }

    public String mostrarFechaCompra() {
        return fechaCompra;
    }

    public void modificarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void modificarEdad(int edad) {
        this.edad = edad;
    }

    public void modificarIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void modificarPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void modificarTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public void modificarNumeroCompra(int numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public void modificarFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int mostrarValor() {
        return valor;
    }

    public void modificarValor(int valor) {
        this.valor = valor;
    }

    public String mostrarPlaca() {
        return placa;
    }

    public void modificarPlaca(String placa) {
        this.placa = placa;
    }
    
    
    public String toString1() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", identificacion=" + identificacion + ", presupuesto=" + presupuesto +'}';
    }

    @Override
    public String toString() {
        return "Factura{" + "nombre=" + nombre + ", edad=" + edad + ", identificacion=" + identificacion + ", presupuesto=" + presupuesto + ", tipoPago=" + tipoPago + ", valor=" + valor + ", numeroCompra=" + numeroCompra + ", fechaCompra=" + fechaCompra + ", placa=" + placa + '}';
    }

    
    
    

    
    
}
