public enum MedioPago {
    TARJETA ("Tarjeta"), EFECTIVO ("Plata"), TRANSFERENCIA ("Mercado Pago");

    private String medioPago;

    MedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getMedioPago() {
        return medioPago;
    }

}
