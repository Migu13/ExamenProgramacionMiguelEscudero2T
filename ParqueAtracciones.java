/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogmiguelescudero2t;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author miguel.escudero
 */
public class ParqueAtracciones {
    private List<Empleado> listaEmpleados;
    private List<Atraccion> listaAtracciones;
    private List<Visitante> listaVisitantes;
    
    public ParqueAtracciones(){
        listaEmpleados = new ArrayList<>();
        listaAtracciones = new ArrayList<>();
        listaVisitantes = new ArrayList<>();
    }
    
    public List<Empleado> getListaEmpleados(){
        return listaEmpleados;
    }
    
    public List<Atraccion> getListaAtracciones(){
        return listaAtracciones;
    }
    
    public List<Visitante> getListaVisitantes(){
        return listaVisitantes;
    }
    
    public void agregarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }
    
    public void agregarAtraccion(Atraccion atraccion){
        listaAtracciones.add(atraccion);
    }
    
    public void agregarVisitante(Visitante visitante){
        listaVisitantes.add(visitante);
        
    }
    
    public void mostrarInformacionParque(){
        System.out.println("Empleados:");
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado);
        }
        
        System.out.println("Atracciones:");
        for (Atraccion atraccion : listaAtracciones){
            System.out.println(atraccion);
        }
        
        System.out.println("Visitantes: ");
        for (Visitante visitante : listaVisitantes){
            System.out.println(visitante);
        }
    }
}
