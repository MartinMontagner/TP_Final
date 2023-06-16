import java.time.LocalDate;
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

        return "ListaTurno{" +
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
           turno.setCliente(listaCliente.crearCliente());
        }
        //turno.setFecha(fechaDelTurno);
        System.out.print("Ingrese Mañana(M), Tarde(T), Noche(N): ");
        turno.setHorario(scanner.nextLine());

        return turno;
    }

    public Boolean agregarTurnoALaLista(ListaCliente listaCliente) {
        Turno turno;
        if (listaTurno.size() < 3)
        {
            turno = crearTurno(listaCliente);
           // if (verificacionDisponible(turno)) {
                listaTurno.add(turno);
                return true;
          //  }
        }
        return false;
    }

    //MANIANA TARDE NOCHE VERIFICACION
    public Boolean verificacionDisponible(Turno turno) {
        if (listaTurno.contains(turno.getHorario())) {
            return true;
        }
        return false;
    }

}
