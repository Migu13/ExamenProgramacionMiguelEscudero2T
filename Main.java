/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogmiguelescudero2t;
import java.util.Scanner;
/**
 *
 * @author miguel.escudero
 */
public class Main {
    public static void main(String[] args){
        ParqueAtracciones parque = new ParqueAtracciones();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        
        do {
            System.out.println("----- MENU DEL PARQUE DE ATRACCIONES -----");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Agregar Atraccion");
            System.out.println("3. Agregar Visitante");
            System.out.println("4. Mostrar Informacion del Parque");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion){
                case 1:
                    System.out.println("Nombre del Empleado: ");
                    String nombreEmpleado = scanner.nextLine();
                    System.out.println("ID del empleado: ");
                    int ID = scanner.nextInt();
                    System.out.println("Puesto del empleado: ");
                    String puesto = scanner.nextLine();
                    if (puesto.equalsIgnoreCase("Mantenimiento")){
                        System.out.println("Area Responsable: ");
                        String areaResponsable = scanner.nextLine();
                        Mantenimiento mantenimiento = new Mantenimiento(nombreEmpleado,ID, areaResponsable);
                        parque.agregarEmpleado(mantenimiento);
                    } else if (puesto.equalsIgnoreCase("Vendedor")){
                        Vendedor vendedor = new Vendedor(nombreEmpleado, ID);
                        parque.agregarEmpleado(vendedor);
                    } else {
                        System.out.println("Puesto no valido");
                    }
                    break;
                   
                    
                case 2:
                    System.out.println("Nombre de la Atraccion:");
                    String nombreAtraccion = scanner.nextLine();
                    System.out.println("Capacidad de la Atraccion:");
                    int capacidad = scanner.nextInt();
                    Atraccion atraccion = new Atraccion(nombreAtraccion, capacidad);
                    parque.agregarAtraccion(atraccion);
                    break;
                    
                case 3: 
                    System.out.println("Nombre del Visitante:");
                    String nombreVisitante = scanner.nextLine();
                    System.out.println("ID del Visitante:");
                    int id = scanner.nextInt();
                    System.out.println("Edad del Visitante: ");
                    int edad = scanner.nextInt();
                    Visitante visitante = new Visitante(nombreVisitante, id, edad);
                    parque.agregarVisitante(visitante);
                    break;
                
                case 4: 
                    parque.mostrarInformacionParque();
                    break;
                
                case 5 : 
                    System.out.println("Saliendo del programa...");
                    break;
                    
            }
        }while (opcion != 5);
    }
}
