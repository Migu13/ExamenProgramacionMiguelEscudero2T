/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogmiguelescudero2t;

/**
 *
 * @author miguel.escudero
 */
public class Empleado {
    private String nombre;
    private int idEmpleado;
    private String puesto;
    
    public Empleado (String nombre, int idEmpleado, String puesto) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getIdEmpleado(){
        return idEmpleado;
    }
    
    public void setIdEmpleado(int idEmpleado){
        this.idEmpleado = idEmpleado;
    }
    
    public String getPuesto(){
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public void asignarTarea(String tarea) {
        System.out.println(nombre + " en el puesto " + puesto + " se le ha asignado a: " + tarea);
    }
    
    public void realizarTarea() {
        System.out.println(nombre + " esta realizando su tarea como " + puesto);
    }
    
    
    
}
