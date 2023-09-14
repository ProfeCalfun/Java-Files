package casinoduoc;

/**
 *
 * @author Calfún
 */
public class Producto {

    private int idProducto;
    private String nombreProducto;
    private int precioProducto;
    private int cantidadProducto;

    public Producto(int idProducto, String nombreProducto, int precioProducto, int cantidadProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public void mostrarBoleta() {
        int compra = this.precioProducto * this.cantidadProducto;
        int iva = (int) (compra * 0.19);
        int totalCompra = compra + iva;
        System.out.println("El nombre es: " + this.nombreProducto);
        System.out.println("El precio es: " + this.precioProducto);
        System.out.println("La cantidad es: " + this.cantidadProducto);
        System.out.println("La compra es: " + compra);
        System.out.println("El iva es: " + iva);
        System.out.println("El total a pagar es: " + totalCompra);

    }

    public double descuentoAlumno(String jornada) {
        if (jornada == "diurno") {
            return 0.1;
        } else if (jornada == "vespertino") {
            return 0.15;
        } else {
            return 0.0;
        }
    }

    public void mostrarMensaje(int cupoTarjeta) {
        int compra = this.precioProducto * this.cantidadProducto;

        if (compra > cupoTarjeta) {
            System.out.println("Su cupo en la tarjeta es insuficiente.");
        } else if (compra < cupoTarjeta) {
            System.out.println("Su cupo es suficiente. Usted puede comprar.");
        } else {
            System.out.println("Datos no válidos.");
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + ", cantidadProducto=" + cantidadProducto + '}';
    }

}
