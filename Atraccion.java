/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogmiguelescudero2t;

/**
 *
 * @author miguel.escudero
 */
public class Atraccion {
    private String nombre;
    private int capacidad;
    private String estado;
    
    public Atraccion(String nombre, int capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estado = "Operativa";
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getCapacidad(){
        return capacidad;
    }
    
    public void setCapacidad (int capacidad){
        this.capacidad = capacidad;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        if (estado.equals("Operativa") || estado.equals("Mantenimiento")|| estado.equals("Fuera de Servicio")){
            this.estado = estado;
        }
        System.out.println("Estado no valido");
    }
    
    public void iniciarAtraccion(){
        System.out.println("La atraccion " + nombre + " se esta iniciando");
    }
    
    public void detenerAtraccion(){
        System.out.println("La atraccion" + nombre + " se esta deteniendo");
    }
    
    public void cambiarEstado(String nuevoEstado){
        if (estado.equals("Operativa") || estado.equals("Mantenimiento")|| estado.equals("Fuera de Servicio")){
           setEstado(nuevoEstado);
           System.out.println("Estado de la atraccion " + nombre + " cambiado a: " + nuevoEstado );
        }
        System.out.println("Estado no valido");
    }
    
}
