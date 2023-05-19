public enum MedioPago {
    Tarjeta ("Tarjeta"), Efectivo ("Plata"), Transferencia("Mercado Pago");

    private String medioPago;

    MedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getMedioPago() {
        return medioPago;
    }

    @Override
    public String toString() {
        return "MedioPago{" +
                "medioPago='" + medioPago + '\'' +
                '}';
    }
}
