import java.io.Serializable;

public enum MedioPago implements Serializable {
    TARJETA ("Tarjeta"), EFECTIVO ("Plata"), TRANSFERENCIA ("Mercado Pago");

    private String medioPago;

    MedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getMedioPago() {
        return medioPago;
    }

}
