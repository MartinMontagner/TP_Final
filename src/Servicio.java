public class Servicio implements Cobros {
    private Double duracion;

    private TipoDeUnia tipo;

    public Servicio(Double duracion, TipoDeUnia tipo) {
        this.duracion = duracion;
        this.tipo = tipo;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public TipoDeUnia getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeUnia tipo) {
        tipo = tipo;
    }

    @Override
    public String toString() {
        return "Manicura de tipo= " + tipo +
                ", con duracion de =" + duracion + " horas";
    }

    @Override
    public Double calcularPrecioxHora() {
        double precioHora = 0;

        if (this.getTipo() == TipoDeUnia.GEL) {
            precioHora = 500.0;
        } else if (this.getTipo() == TipoDeUnia.ESCULPIDA) {
            precioHora = 400.0;
        }

        double precioTotal = precioHora * duracion ;

        return precioTotal;
    }
}
