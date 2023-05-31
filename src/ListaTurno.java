import java.util.ArrayList;
import java.util.List;

public class ListaTurno {
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

    public Boolean agregar (Turno turno)
    {
        if (listaTurno.size()<3)
        {
            //verificacionDisponible(turno);
            listaTurno.add(turno);
            return true;
        }
        return false;
    }
    //MANIANA TARDE NOCHE VERIFICACION
//    public Boolean verificacionDisponible(Turno turno)
//    {
//        if()
//        return false;
//    }

}
