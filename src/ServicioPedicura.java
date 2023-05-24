public class ServicioPedicura extends Servicio {

    private TipoDePedicura tipo;

    public ServicioPedicura(Double duracion, TipoDePedicura tipo) {
        super(duracion);
        this.tipo = tipo;
    }

    public ServicioPedicura(Double duracion) {
        super(duracion);
    }

    public TipoDePedicura getTipo() {
        return tipo;
    }

    public void setTipo(TipoDePedicura tipo) {
        this.tipo = tipo;
    }

    @Override
    public Double calcularPrecioxHora() {
        double precioHora = 0;

        if (this.getTipo() == TipoDePedicura.ESTANDAR) {
            precioHora = 200.0;
        } else if (this.getTipo() == TipoDePedicura.PREMIUM) {
            precioHora = 1000.0;
        }

        return precioHora * getDuracion();
    }
}
