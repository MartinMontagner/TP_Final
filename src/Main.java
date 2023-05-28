import com.google.gson.Gson;

import javax.swing.*;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //todo usa como key de los mapas las fechas y lo value turnos
        // usa try y catch y los swtich
        // que se puede crear un cliente elegir el tipo de servicio el cual muestre su precio
        // y duracion etc usa todos los metodos
        // ordena las clases en carpetas asi es todos mas legible
//
        ServicioManicura servicioMano = new ServicioManicura(2.0, TipoDeManicura.GEL);
        ServicioPedicura servicioPie = new ServicioPedicura(2.0, TipoDePedicura.PREMIUM);

        Factura factura1 = new Factura(MedioPago.EFECTIVO, servicioMano);
        Factura factura2 = new Factura(MedioPago.TARJETA, servicioPie);

        Cliente cliente1 = new Cliente("Julian", "Zapata",0,"2234567899");
        Cliente cliente2 = new Cliente("Martin", "Montagner",1,"2234567899");
        Cliente cliente3 = new Cliente("Franco", "Guidi",2,"2234567899");
        Cliente cliente4 = new Cliente("Kevin", "Tolosa",3,"2234567899");

        List < Cliente > clientes = new ArrayList< >();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        //maneje archivos
        if (!(new File("clientes.json")).exists()) {
            File file = new File("clientes.json");
        }
        if (!(new File("turnos.json")).exists()) {
            File file = new File("turnos.json");
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("clientes.json"));
        Gson gson = new Gson();
        String jsonAsString = gson.toJson(clientes);
        gson.toJson(jsonAsString, String.class, bufferedWriter);

        bufferedWriter.newLine();
        bufferedWriter.close();


//        MapaGenerico<String, Turno> mapaDeTurnos = new MapaGenerico<>();
//        Cliente c = new Cliente();
//        Turno turno = new Turno(c, factura, LocalDate.now());
//        mapaDeTurnos.agregarDatoSinRepetir("a", turno);
//        Boolean b;
        //= mapaDeTurnos.agregarDatoSinRepetir("a", turno);

//        b = mapaDeTurnos.contieneLlave("ff");
//        if (b)
//            System.out.printf("la contien");
//        else
//            System.out.printf("no la cvontiene");
//


    }
}