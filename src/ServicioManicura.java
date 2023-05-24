public class ServicioManicura extends Servicio{

private TipoDeManicura tipoDeManicura;

    public ServicioManicura(Double duracion, TipoDeManicura tipoDeManicura) {
        super(duracion);
        this.tipoDeManicura = tipoDeManicura;
    }

    public ServicioManicura(Double duracion) {
        super(duracion);
    }

    public TipoDeManicura getTipoDeManicura() {
        return tipoDeManicura;
    }

    public void setTipoDeManicura(TipoDeManicura tipoDeManicura) {
        this.tipoDeManicura = tipoDeManicura;
    }

    @Override
    public Double calcularPrecioxHora() {
        double precioHora = 0;

        if (this.getTipoDeManicura() == TipoDeManicura.GEL) {
            precioHora = 500.0;
        } else if (this.getTipoDeManicura() == TipoDeManicura.ESCULPIDA) {
            precioHora = 400.0;
        }

        return precioHora * getDuracion();
    }

}
