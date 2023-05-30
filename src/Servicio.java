import java.io.Serializable;

public abstract class Servicio implements Cobros, Serializable {
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

}
