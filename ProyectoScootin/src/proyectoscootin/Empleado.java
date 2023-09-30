/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoscootin;

/**
 *
 * @author Calfún
 */
public class Empleado {
    
    private String rutEmpleado;
    private String nombreEmpleado;
    private char sexoEmpleado;
    private int añosServicio;
    private int edadEmpleado;
    private Puesto puestoEmpleado;

    public Empleado(String rutEmpleado, String nombreEmpleado, char sexoEmpleado, int añosServicio, int edadEmpleado, Puesto puestoEmpleado) {
        this.rutEmpleado = rutEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.sexoEmpleado = sexoEmpleado;
        this.añosServicio = añosServicio;
        this.edadEmpleado = edadEmpleado;
        this.puestoEmpleado = puestoEmpleado;
    }

    public Empleado() {
    }

    public String getRutEmpleado() {
        return rutEmpleado;
    }

    public void setRutEmpleado(String rutEmpleado) {
        this.rutEmpleado = rutEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public char getSexoEmpleado() {
        return sexoEmpleado;
    }

    public void setSexoEmpleado(char sexoEmpleado) {
        this.sexoEmpleado = sexoEmpleado;
    }

    public int getAñosServicio() {
        return añosServicio;
    }

    public void setAñosServicio(int añosServicio) {
        this.añosServicio = añosServicio;
    }

    public int getEdadEmpleado() {
        return edadEmpleado;
    }

    public void setEdadEmpleado(int edadEmpleado) {
        this.edadEmpleado = edadEmpleado;
    }

    public Puesto getPuestoEmpleado() {
        return puestoEmpleado;
    }

    public void setPuestoEmpleado(Puesto puestoEmpleado) {
        this.puestoEmpleado = puestoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "rutEmpleado=" + rutEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", sexoEmpleado=" + sexoEmpleado + ", a\u00f1osServicio=" + añosServicio + ", edadEmpleado=" + edadEmpleado + ", puestoEmpleado=" + puestoEmpleado + '}';
    }
    
    
}
