public abstract class Servicio implements Cobros {
    private Double duracion;

    public Servicio(Double duracion) {
        this.duracion = duracion;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return " duracion de =" + duracion + " horas";
    }

//    @Override
//    public Double calcularPrecioxHora() {
//        double precioHora = 0;
//
//        if (this.getTipo() == TipoDeManicura.GEL) {
//            precioHora = 500.0;
//        } else if (this.getTipo() == TipoDeManicura.ESCULPIDA) {
//            precioHora = 400.0;
//        }
//
//        double precioTotal = precioHora * duracion ;
//
//        return precioTotal;
//    }

}
