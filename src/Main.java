public class Main {
    public static void main(String[] args) {

        Servicio servicio = new Servicio(2.0, TipoDeUnia.GEL);

        Factura factura = new Factura(MedioPago.EFECTIVO, servicio);

        factura.calcularPrecioFactura(servicio);

        System.out.println(factura.toString());


    }
}