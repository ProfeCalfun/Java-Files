/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menusentencias;

import java.util.Scanner;

/**
 *
 * @author Calfún
 */
public class MenuSentencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pizza pizza1=new Pizza("Pepperoni",8990);
        Pizza pizza2=new Pizza();
        
        Scanner teclado = new Scanner(System.in);
//Declarar variables
        int contPepperoni = 0;
        int contVegetariana = 0;
        int contItaliana = 0;
        int opcion = 0;

        do {
            System.out.println("\n------Menú de Pizzas----\n");
            System.out.println("1.- Mostrar datos");
            System.out.println("2.- Agregar nombre y valor.");
            System.out.println("3.- Pizza Italiana.");
            System.out.println("4.- Salir del programa.");
            System.out.print("\nIngresa una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    pizza1.imprimirDatos();
                    break;
                case 2:
                    System.out.println("Agregue un nomre: ");
                    String nombre=teclado.next();
                    pizza2.setNombre(nombre);
                    break;
                case 3:
                    System.out.println("Agregaste una Pizza Italiana.");
                    contItaliana++;
                    break;
                case 4:
                    System.out.println("Cantidad de Pepperonis: " + contPepperoni);
                    System.out.println("Cantidad de Vegetarianas: " + contVegetariana);
                    System.out.println("Cantidad de Italianas: " + contItaliana);
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Vuelva a intentarlo.");
                    break;
            }
        } while (opcion != 4);
        
        
        
                /*int cantEntradas=0;
        int contAdultos=0;
        int contNinos=0;
        
        System.out.println("Ingrese la cantidad de entradas: ");
        cantEntradas=teclado.nextInt();
        
        for (int i = 1; i <=cantEntradas; i++) {
            System.out.println("Ingrese la edad de la persona: ");
            int edad=teclado.nextInt();
            
            if(edad>=18){
                contAdultos++;
            }else{
                contNinos++;
            }
        }
        System.out.println("Cantidad de adultos: "+contAdultos);
        System.out.println("Cantida de niños: "+contNinos);
                 */
        
        
    }
}
