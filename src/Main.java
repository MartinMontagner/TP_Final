import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.*;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

//        Cliente cliente1 = new Cliente("Julian", "Zapata", "2234567899");
//       Cliente cliente2 = new Cliente("Martin", "Montagner", "2234567899");
//        Cliente cliente3 = new Cliente("Franco", "Guidi", "2234567899");
//        Cliente cliente4 = new Cliente("Kevin", "Tolosa", "2234567899");



        ListaCliente lista = new ListaCliente();

        lista.agregarClientesALaLista();
        lista.mostrarListaClientes();

        ArchivoJsonGenericos<ListaCliente> archivoJsonGenericos = new ArchivoJsonGenericos<>(lista);

        archivoJsonGenericos.escribirArchivo(lista);
//        archivoJsonGenericos.leerArchivo(lista);

/*
Asi se hace sin la clase

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingrese el nombre del archivo a escribir: ");
//        String archivoAEscribir = scanner.nextLine();
//
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(archivoAEscribir + ".json"));
//
//        gson.toJson(lista, ListaCliente.class, bufferedWriter);
//        bufferedWriter.close();

//        BufferedReader bufferedReader = new BufferedReader(new FileReader(archivoAEscribir + ".json"));
//
//        ListaCliente listaExterna = gson.fromJson(bufferedReader, ListaCliente.class);
//        System.out.println(listaExterna);*/


//TURNOS
//        Turno turno1 = new Turno(cliente3, factura1, LocalDate.now());
//        Turno turno2 = new Turno(cliente4, factura2, LocalDate.now());
//        Turno turno3 = new Turno(cliente1, factura2, LocalDate.now());
//        Turno turno4 = new Turno(cliente2, factura2, LocalDate.now());
//        turno1.descuentoDeTurnos();
//        System.out.println(turno1.toString());

//ARCHIVOS
//        if (!(new File("clientes.json")).exists()) {
//            File file = new File("clientes.json");
//        }
//        if (!(new File("turnos.json")).exists()) {
//            File file = new File("turnos.json");
//        }

//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("clientes.json"));
//        Gson gson = new Gson();
//        String jsonAsString = gson.toJson(clientes);
//        gson.toJson(jsonAsString, String.class, bufferedWriter);
//
//        bufferedWriter.newLine();
//        bufferedWriter.close();


//MAPA
//        MapaGenerico<LocalDate, ListaTurno> mapita = new MapaGenerico<>();
//        mapita.agregarDatoSinRepetir(LocalDate.now(), new ListaTurno());
//
//        mapita.agregarTurnoAMapa(turno1, LocalDate.now());
//        mapita.agregarTurnoAMapa(turno2, LocalDate.now());
//        mapita.agregarTurnoAMapa(turno3, LocalDate.now());
//        //mapita.agregarTurnoAMapa(turno4, LocalDateTime.);
//        mapita.recorrerElMapitaYMostrar();
    }
}