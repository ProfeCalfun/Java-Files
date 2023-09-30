/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoscootin;

import java.util.ArrayList;

/**
 *
 * @author Calfún
 */
public class Empresa {
    
    //atributo de la clase empresa
    private ArrayList<Empleado> listaEmpleados;

    public Empresa(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Empresa() {
        this.listaEmpleados=new ArrayList<Empleado>();
    }
     
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    //Método que insertar empleados a la lista.
    public boolean agregarEmpleado(Empleado emp){
        this.listaEmpleados.add(emp);
        return true;
    }
    
    //Método que muestra los empleados.
    public void listarEmpleados(){
        for(Empleado emp:this.listaEmpleados){
            System.out.println(emp);
        }
    }
    
    //Método buscar un empleado.
    public boolean buscarEmpleado(String rut){
        for(Empleado emp:this.listaEmpleados){
            if(rut.equals(emp.getRutEmpleado())){
                System.out.println("El rut es: "+emp.getRutEmpleado());
                System.out.println("El nombre es: "+emp.getNombreEmpleado());
                return true;
            }
        }
        return false;
    }
    
    //Método eliminar un empleado
    public boolean eliminarEmpleado(String rut){
        for(Empleado emp:this.listaEmpleados){
            if(rut.equals(emp.getRutEmpleado())){
                this.listaEmpleados.remove(emp);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Empresa{" + "listaEmpleados=" + listaEmpleados + '}';
    }
    
    
}
