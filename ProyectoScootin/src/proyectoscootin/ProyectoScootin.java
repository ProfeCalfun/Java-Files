/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoscootin;

import java.util.Scanner;

/**
 *
 * @author Calfún
 */
public class ProyectoScootin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        Puesto puesto1=new Puesto(001,"Supervisor");
        Puesto puesto2=new Puesto(002,"Auxiliar");
        Puesto puesto3=new Puesto(003,"Desarrollador");
        
        Empleado empleado1=new Empleado("1111111","Claudio Murua",'M',15,45,puesto1);
        Empleado empleado2=new Empleado("2222222","Angelina Mendoza",'F',20,50,puesto2);
        Empleado empleado3=new Empleado("3333333","Renato Vera",'M',5,30,puesto3);
        
        Empresa empresa1=new Empresa();    
        
        int opcion;
        
        do{
            System.out.println("\n-----Menu RRHH----\n");
            System.out.println("1.- Mostrar empleados");
            System.out.println("2.- Agregar empleados");
            System.out.println("3.- Eliminar empleados");
            System.out.println("4.- Buscar empleados");
            System.out.println("5.- Salir");
            
            opcion=teclado.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Los empleados son:");
                    empresa1.listarEmpleados();
                    break;
                case 2:
                    empresa1.agregarEmpleado(empleado1);
                    empresa1.agregarEmpleado(empleado2);
                    System.out.println("Empleados agregados exitosamente.\n");
                    break;
                case 3:
                    if(empresa1.buscarEmpleado("1234")==true){
                        empresa1.eliminarEmpleado("1234");
                        System.out.println("Empleado eliminado exitosamente.");
                    }else{
                        System.out.println("Empleado no existe. Intente de nuevo.");
                    }
                    break;
                case 4:
                    empresa1.buscarEmpleado("1111111");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }while(opcion!=5);
        
        if(empresa1.buscarEmpleado("3333333")==true){
            System.out.println("El rut existe");
            
        }else{
            System.out.println("Empleado ingresado con éxito.");
            empresa1.agregarEmpleado(empleado3);
        }
        
        empresa1.listarEmpleados();
    }
    
}
