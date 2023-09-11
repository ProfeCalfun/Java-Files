/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasupermercado;

/**
 *
 * @author Calfún
 */
public class Tarjeta {
    
    private int idTarjeta;
    private String nombreCliente;
    private int cupoTarjeta;

    public Tarjeta(int idTarjeta, String nombreCliente, int cupoTarjeta) {
        this.idTarjeta = idTarjeta;
        this.nombreCliente = nombreCliente;
        this.cupoTarjeta = cupoTarjeta;
    }

    public Tarjeta() {
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCupoTarjeta() {
        return cupoTarjeta;
    }

    public void setCupoTarjeta(int cupoTarjeta) {
        this.cupoTarjeta = cupoTarjeta;
    }

    public String tipoCliente(){
        if(this.cupoTarjeta<250000){
            return "básico";
        }else if(this.cupoTarjeta>=250000 && this.cupoTarjeta<=500000){
            return "premium";
        }else if(this.cupoTarjeta>500000){
            return "gold";
        }else{
            return "Cupo no válido.";
        }
    }
    
    public void saldoCupoTarjeta(int valorCompra){
        if(this.cupoTarjeta>valorCompra){
            this.cupoTarjeta=this.cupoTarjeta-valorCompra;
            System.out.println("El cupo es: "+this.cupoTarjeta);
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public void descuentoDiario(String dia){
        if(dia.equals("lunes") && this.tipoCliente().equals("básico")){
            System.out.println("El cliente tiene un 10% de descuento");
        }else if(this.tipoCliente()=="premium" && dia=="miércoles"){
            System.out.println("El cliente tiene un 15% de descuento.");
        }else if("gold".equals(this.tipoCliente()) && "viernes".equals(dia)){
            System.out.println("El cliente tiene un 20% de descuento.");
        }else{
            System.out.println("No hay descuentos...");
        }
    }
    @Override
    public String toString() {
        return "Tarjeta{" + "idTarjeta=" + idTarjeta + ", nombreCliente=" + nombreCliente + ", cupoTarjeta=" + cupoTarjeta + '}';
    }
    
    
}
