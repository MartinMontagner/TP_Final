import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Turno implements Serializable {
    private Cliente cliente;
    private Factura factura;
    private LocalDate fecha;


    //todo 1)Una lista con fechas por dias por ejemplo de lunes a viernes cuando se agrega un nuevo turno
    // se elimina del lista y añade al atributo fecha de la clase turno.

    public Turno(Cliente cliente, Factura factura, LocalDate fecha) {
        this.cliente = cliente;
        this.factura = factura;
        this.fecha = fecha;
    }

    public Turno() {
    }

    @Override
    public String toString() {
        return "Turno{" +
                "cliente=" + cliente +
                ", factura=" + factura +
                ", fecha=" + fecha +
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


    public void descuentoDeTurnos()
    {
        if(cliente.verificarTurnosCliente())
        {
            System.out.println("Precio: " + factura.getPrecio());
            factura.setPrecio(factura.getPrecio()*0.8);
            System.out.println("Precio: " + factura.getPrecio());
        }
        else {System.out.println("Probando no hay 20 turnos papafrita");}
    }
}
