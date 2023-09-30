/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoscootin;

/**
 *
 * @author Calfún
 */
public class Puesto {
    
    private int codigoPuesto;
    private String nombrePuesto;

    public Puesto(int codigoPuesto, String nombrePuesto) {
        this.codigoPuesto = codigoPuesto;
        this.nombrePuesto = nombrePuesto;
    }

    public Puesto() {
    }

    public int getCodigoPuesto() {
        return codigoPuesto;
    }

    public void setCodigoPuesto(int codigoPuesto) {
        this.codigoPuesto = codigoPuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    @Override
    public String toString() {
        return "Puesto{" + "codigoPuesto=" + codigoPuesto + ", nombrePuesto=" + nombrePuesto + '}';
    }
    
    
}
