/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogmiguelescudero2t;

/**
 *
 * @author miguel.escudero
 */
public class Mantenimiento extends Empleado {
    private String areaResponsable;
    
    public Mantenimiento(String nombre, int idEmpleado, String areaResponsable){
        super(nombre, idEmpleado, "Mantenimiento");
        this.areaResponsable = areaResponsable;
    }
    
    public String getAreaResponsable(){
        return areaResponsable;
    }
    
    public void setAreaResponsable(String areaResponsable){
        this.areaResponsable = areaResponsable;
    }
    
    public void realizarMantenimiento(){
        System.out.println(getNombre() + " esta realizando el mantenimiento en el area: " + areaResponsable);
    }
    
    public void reportarProblema(){
        System.out.println(getNombre() + " ha reportado un problema en el area: " + areaResponsable);
        
    }
    
    
}
