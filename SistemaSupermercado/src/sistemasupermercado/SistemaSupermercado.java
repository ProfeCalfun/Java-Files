/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemasupermercado;

import java.util.Scanner;

/**
 *
 * @author Calfún
 */
public class SistemaSupermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
        Tarjeta tarjeta1=new Tarjeta(001,"Raquel",650000);
        Tarjeta tarjeta2=new Tarjeta(002,"Matias",200000);
        
        int opcion=0;
        
        do{
            System.out.println("\n---Menu---\n");
            System.out.println("1.- Tipo cliente");
            System.out.println("2.- Cupo Tarjeta");
            System.out.println("3.- Descuento diario");
            System.out.println("4.- Salir del programa");
            System.out.print("\nIngrese una opción: ");
            
           opcion=teclado.nextInt();
           
           switch(opcion){
               case 1:
                   System.out.println("El cliente "+tarjeta1.getNombreCliente()+" es de tipo: ");
                   System.out.println(tarjeta1.tipoCliente());
                   break;
               case 2:
                   System.out.println("Ingrese el total de su compra: ");
                   int totalCompra=teclado.nextInt();
                   tarjeta1.saldoCupoTarjeta(totalCompra);
                   break;
               case 3:
                   System.out.println("Ingrese el día para saber si hay descuentos: ");
                   String dia=teclado.next();
                   tarjeta1.descuentoDiario(dia);
                   break;
               case 4:
                   System.out.println("Saliendo del programa...");
                   break;
               default:
                   System.out.println("Intente nuevamente.");
                   break;
           }
        }while(opcion!=4);
    }
    
}
