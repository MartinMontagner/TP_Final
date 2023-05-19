public class Factura  {
    private Double precio;
    private MedioPago medioPago;
    private ServicioManicura service;
    public Factura() {
    }

    public Factura(Double precio, MedioPago medioPago) {
        this.precio = precio;
        this.medioPago = medioPago;
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

    @Override
    public String toString() {
        return "Factura{" +
                "precio=" + precio +
                ", medioPago=" + medioPago +
                '}';
    }



}
