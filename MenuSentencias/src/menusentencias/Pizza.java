/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menusentencias;

/**
 *
 * @author Calfún
 */
public class Pizza {
    private String nombre;
    private int precio;

    public Pizza(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Pizza() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void imprimirDatos(){
        System.out.println("La Pizza es: "+nombre);
        System.out.println("El precio de la pizza es: "+this.precio);
    }
}
