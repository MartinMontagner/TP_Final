package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTurno{
    public List listaTurno;

    public ListaTurno(List listaTurno) {
        this.listaTurno = listaTurno;
    }

    public ListaTurno() {
        this.listaTurno = new ArrayList<>();
    }

    public List getListaTurno() {
        return listaTurno;
    }

    public void setListaTurno(List listaTurno) {
        this.listaTurno = listaTurno;
    }

    @Override
    public String toString() {
        if (listaTurno.isEmpty())
            return "no hay turnos";

        return "Model.ListaTurno{" +
                "listaTurno=" + listaTurno +
                '}';

    }

    private Turno crearTurno(ListaCliente listaCliente)
    {
        Turno turno = new Turno();
        Scanner scanner = new Scanner(System.in);
        Cliente c = listaCliente.buscarCliente();
        if (c != null) {
            turno.setCliente(c);
        } else {
            System.out.println("No se encontro el cliente, por favor ingrese los datos para crear un nuevo cliente");
           turno.setCliente(listaCliente.crearCliente());
        }
        //Model.ServicioManicura servicioMano = new Model.ServicioManicura(2.0, Model.TipoDeManicura.GEL);
        //turno.setFactura(new Model.Factura(Model.MedioPago.EFECTIVO, servicioMano));
        turno.setFactura(crearFactura());
        //turno.setFecha(fechaDelTurno);
        System.out.print("Ingrese Mañana(M), Tarde(T), Noche(N): ");
        turno.setHorario(scanner.nextLine());

        return turno;
    }
    private Factura crearFactura() {
        Scanner scanner = new Scanner(System.in);
        boolean medioPagoValido = false;
        MedioPago medioPago = null;
        Servicio servicio = null;

        while (!medioPagoValido) {
            System.out.println("Ingrese el medio de pago (TARJETA/EFECTIVO/TRANSFERENCIA): ");
            String medioPagoStr = scanner.nextLine().toUpperCase();

            try {
                medioPago = MedioPago.valueOf(medioPagoStr);

                switch (medioPago) {
                    case TARJETA:
                    case EFECTIVO:
                    case TRANSFERENCIA:
                        medioPagoValido = true;
                        break;
                    default:
                        System.out.println("Medio de pago no válido");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Elección de medio de pago inválida");
            }
        }

        System.out.println("Ingrese la duración del servicio: ");
        Double duracion = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Seleccione el tipo de servicio (Pedicura/Manicura): ");
        String tipoServicioStr = scanner.nextLine().toUpperCase();

        switch (tipoServicioStr) {
            case "PEDICURA":
                System.out.println("Seleccione el tipo de pedicura (ESTANDAR/PREMIUM): ");
                String tipoPedicuraStr = scanner.nextLine().toUpperCase();
                TipoDePedicura tipoPedicura = TipoDePedicura.valueOf(tipoPedicuraStr);
                servicio = new ServicioPedicura(duracion, tipoPedicura);
                break;
            case "MANICURA":
                System.out.println("Seleccione el tipo de manicura (GEL/ESCULPIDA): ");
                String tipoManicuraStr = scanner.nextLine().toUpperCase();
                TipoDeManicura tipoManicura = TipoDeManicura.valueOf(tipoManicuraStr);
                servicio = new ServicioManicura(duracion, tipoManicura);
                break;
            default:
                System.out.println("Tipo de servicio no válido");
                break;
        }

        Factura factura = new Factura(medioPago, servicio);

        return factura;
    }



    public Boolean agregarTurnoALaLista(ListaCliente listaCliente) {
        Turno turno;
        if (listaTurno.size() < 3)
        {
            turno = crearTurno(listaCliente);
            if (!verificacionDisponible(turno)) {
                listaTurno.add(turno);
                return true;
            }
        }
        return false;
    }

    //MANIANA TARDE NOCHE VERIFICACION
    public boolean verificacionDisponible(Turno turno) {
        return listaTurno.stream().anyMatch(t -> t.equals(turno));
    }



}
