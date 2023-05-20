import java.time.LocalDate;
import java.util.ArrayList;

public class Turno {
    private Cliente cliente;
    private Factura factura;
    private LocalDate fecha;
    public ArrayList <Turno> ListaTurnos;


    public Turno(Cliente cliente, Factura factura, LocalDate fecha) {
        this.cliente = cliente;
        this.factura = factura;
        this.fecha = fecha;
        this.ListaTurnos=new ArrayList<>();
    }
    public void agregarListaTurno(Cliente cliente,Factura factura, LocalDate fecha)
    {
        Turno turno= new Turno(cliente,factura,fecha);
        this.ListaTurnos.add(turno);
    }
    public Turno(){this.ListaTurnos=new ArrayList<>();}

    @Override
    public String toString() {
        return "Turno{" +
                "cliente=" + cliente +
                ", factura=" + factura +
                ", fecha=" + fecha +
                ", ListaTurnos=" + ListaTurnos +
                '}';
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
