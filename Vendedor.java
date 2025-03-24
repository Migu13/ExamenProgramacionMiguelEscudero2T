/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogmiguelescudero2t;

/**
 *
 * @author miguel.escudero
 */
public class Vendedor extends Empleado {
    private int ventasRealizadas;
    
    public Vendedor(String nombre, int idEmpleado){
        super(nombre, idEmpleado, "Vendedor");
        this.ventasRealizadas = 0;
    }
    
    public int getVentasRealizadas(){
        return ventasRealizadas;
    }
    
    public void setVentasRealizadas(int ventasRealizadas){
        if (ventasRealizadas < 0) {
            System.out.println("Las ventas no pueden ser negativas");
        }
        this.ventasRealizadas = ventasRealizadas;
    }
    
    public void venderEntrada(){
        setVentasRealizadas(this.ventasRealizadas + 1);
        System.out.println(getNombre() + " ha vendido una entrada. Total vendidas: " + ventasRealizadas);
    }
    
    public void reportarVentas(){
        System.out.println(getNombre() + " ha vendido un total de entradas de : " + ventasRealizadas);
    }
    
}
