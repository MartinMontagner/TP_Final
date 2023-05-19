public class ServicioManicura{
    private Double precio;
    private Double duracion;
    private TipoDeUnia tipoDeUnia;

    public ServicioManicura(Double precio, Double duracion, TipoDeUnia tipoDeUnia) {
        this.precio = precio;
        this.duracion = duracion;
        this.tipoDeUnia= tipoDeUnia;
    }

    public ServicioManicura() {
    }

    public TipoDeUnia getTipoDeUnia() {
        return tipoDeUnia;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "ServicioManicura{" +
                "precio=" + precio +
                ", duracion=" + duracion +
                ", tipoDeUnia=" + tipoDeUnia +
                '}';
    }
}
