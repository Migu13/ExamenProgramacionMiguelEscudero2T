/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogmiguelescudero2t;

/**
 *
 * @author miguel.escudero
 */
public class Visitante {
    private String nombre;
    private int idVisitante;
    private int edad;
    
    public Visitante(String nombre, int idVisitante, int edad){
        this.nombre = nombre;
        this.idVisitante = idVisitante;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getIdVisitante(){
        return idVisitante;
    }
    
    public void setIdVisitante(int idVisitante){
        this.idVisitante = idVisitante;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        if (edad < 0){
            System.out.println("La edad no puede ser negativa");
        }
        this.edad = edad;
    }
    
    public void comprarEntrada() {
        System.out.println(nombre + " ha comprado una entrada");
    }
    
    public void usarAtraccion(String atraccion) {
        System.out.println(nombre + " se esta montando en la atraccion " + atraccion);
    }
}
