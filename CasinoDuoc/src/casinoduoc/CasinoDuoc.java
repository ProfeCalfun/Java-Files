package casinoduoc;

import java.util.Scanner;

/**
 *
 * @author Calfún
 */
public class CasinoDuoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Producto producto1 = new Producto(001, "Takis", 1100, 3);
        Producto producto2 = new Producto(002, "Bebida", 900, 3);

        int opcion = 0;

        do {
            System.out.println("\n----Menú de compras----\n");
            System.out.println("1.- Boleta electrónica");
            System.out.println("2.- Descuento por jornada");
            System.out.println("3.- Cupo de tarjeta");
            System.out.println("4.- Salir del programa");
            System.out.println("\nSeleccione una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su boleta electrónica es la siguiente: \n");
                    producto1.mostrarBoleta();
                    break;
                case 2:
                    System.out.println("Usted tiene el siguiente descuento: ");
                    System.out.println("Descuento del " + producto1.descuentoAlumno("diurno") * 100 + "%");
                    break;
                case 3:
                    System.out.println("Su saldo de su tarjeta es: ");
                    producto1.mostrarMensaje(5000);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    System.out.println("Gracias por comprar");
                    System.out.println("Casino Duoc UC");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;

            }
        } while (opcion != 4);

    }

}
