import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTurno extends Turno{
    public List listaTurno = new ArrayList<Turno>();

    public ListaTurno(List listaTurno) {
        this.listaTurno = listaTurno;
    }

    public ListaTurno() {
    }

    public List getListaTurno() {
        return listaTurno;
    }

    public void setListaTurno(List listaTurno) {
        this.listaTurno = listaTurno;
    }

    @Override
    public String toString() {
        if (listaTurno.size()==0)
            return "no hay turnos";



        return "ListaTurno{" +
                "listaTurno=" + listaTurno +
                '}';

    }
    private Turno crearTurno(ListaCliente listaCliente)
    {
        Turno turno= new Turno();
        Scanner scanner = new Scanner(System.in);
        turno.setCliente(listaCliente.buscarCliente());
        System.out.print("Ingrese fecha del turno DD/MM/AAAA: ");
        Integer fechaTurnoDia = scanner.nextInt() ;
        Integer fechaTurnoMes = scanner.nextInt() ;
        Integer fechaTurnoAnio = scanner.nextInt() ;
        turno.setFecha(LocalDate.of(fechaTurnoAnio,fechaTurnoMes,fechaTurnoDia));
        System.out.print("Ingrese Maniana(M), Tarde(T), Noche(N): ");
        turno.setHorario(scanner.nextLine());

        return turno;
    }
    public Boolean agregarTurnoALaLista (ListaCliente listaCliente)
    {
        Turno turno = new Turno();

        if (listaTurno.size()<3)
        {
            turno= crearTurno(listaCliente);
            if(verificacionDisponible(turno))
            {
                listaTurno.add(turno);
                return true;
            }
        }
        return false;
    }
    //MANIANA TARDE NOCHE VERIFICACION
    public Boolean verificacionDisponible(Turno turno)
    {
        if(listaTurno.contains(turno.getHorario()))
        {
            return false;
        }
        return true;
    }

}
