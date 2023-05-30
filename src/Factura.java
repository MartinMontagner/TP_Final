import java.io.Serializable;
import java.util.Scanner;

public class Factura implements Serializable  {
    private Double precio;
    private MedioPago medioPago;
    private Servicio service;

    public Factura(Double precio) {
    }

    public Factura(MedioPago medioPago, Servicio service) {
        this.medioPago = medioPago;
        this.service = service;
        this.precio = calcularPrecioFactura();

    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public MedioPago getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(MedioPago medioPago) {
        this.medioPago = medioPago;
    }

    public Servicio getService() {
        return service;
    }

    public void setService(Servicio service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Factura{" + service +
                ", con un precio de=" + precio +
                ", pagado con= " + medioPago + "}";
    }
    public Double calcularPrecioFactura() {

        double precioFactura = this.service.calcularPrecioxHora();

        int flag = 0;

        while (flag == 0) {
            try {
                switch (this.medioPago) {
                    case TARJETA:
                        precioFactura *= 1.1;
                        flag = 1;
                        break;
                    case TRANSFERENCIA:
                        precioFactura *= 1.05;
                        flag = 1;
                        break;
                    case EFECTIVO:
                        precioFactura *= 0.95;
                        flag = 1;
                        break;
                        default:
                        System.out.println("Método de pago inválido, introduce uno de los siguientes:\n -TARJETA \n -TRANSFERENCIA \n -EFECTIVO\n");
                        Scanner scan = new Scanner(System.in);
                        String nuevoMedio = scan.next();
                        medioPago = MedioPago.valueOf(nuevoMedio.toUpperCase());
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Método de pago inválido.");
            }

        }

            return precioFactura;
    }



}

