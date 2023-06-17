import java.io.*;
import java.time.LocalDate;
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
       // ServicioManicura servicioMano = new ServicioManicura(2.0, TipoDeManicura.GEL);
//        ServicioPedicura servicioPie = new ServicioPedicura(2.0, TipoDePedicura.PREMIUM);
//
        //Factura factura1 = new Factura(MedioPago.EFECTIVO, servicioMano);
        //factura1.toString();
//        Factura factura2 = new Factura(MedioPago.TARJETA, servicioPie);
//
//        Cliente cliente1 = new Cliente("Julian", "Zapata", "2234567899");
//        Cliente cliente2 = new Cliente("Martin", "Montagner", "2234567899");
        Cliente cliente3 = new Cliente("f", "Guidi", "2234567899");
//        Cliente cliente4 = new Cliente("Kevin", "Tolosa", "2234567899");


//        ListaTurno listaTurno = new ListaTurno();

        // lista.agregarClientesALaLista();

        // lista.mostrarListaClientes();
        //listaTurno.agregarTurnoALaLista(lista);
        // ArchivoJsonGenericos<ListaCliente> archivoJsonGenericos = new ArchivoJsonGenericos<>(lista);

        //  archivoJsonGenericos.escribirArchivo(lista);
        // archivoJsonGenericos.leerArchivo(lista);

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
        ListaCliente lista = new ListaCliente();
        //lista.agregarClienteUnico(cliente3);
    MainFrame myObject = new MainFrame();
    for(int i=0;i<3;i++) {
        myObject.pedirUnTurno(lista);
    }
    
//        Turno turno2 = new Turno(cliente4, factura2, LocalDate.now(),"T");
//        Turno turno3 = new Turno(cliente1, factura2, LocalDate.now(),"T");
//        Turno turno4 = new Turno(cliente2, factura2, LocalDate.now(),"N");
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

//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Ingrese fecha del turno DD/MM/AAAA: ");
//            Integer fechaTurnoDia = scanner.nextInt();
//            Integer fechaTurnoMes = scanner.nextInt();
//            Integer fechaTurnoAnio = scanner.nextInt();
//            scanner.nextLine();
//             LocalDate fecha2 =(LocalDate.of(fechaTurnoAnio, fechaTurnoMes, fechaTurnoDia));
////MAPA
//
            //Turno turno1 = new Turno(cliente3, factura1, LocalDate.now(), "M");

            //LocalDate fecha = LocalDate.of(2023, 06, 01);
//            int ultimoDiaDelMes = fecha2.lengthOfMonth();
//            List<LocalDate> fechasDelMes = new ArrayList<>();
//
//            for (int dia = 1; dia <= ultimoDiaDelMes; dia++) {
//                LocalDate fechaActual = fecha2.withDayOfMonth(dia);
//                fechasDelMes.add(fechaActual);
//            }
//
//
//            MapaGenerico<LocalDate, ListaTurno> mapita = new MapaGenerico<>();
//            for (LocalDate localDate : fechasDelMes) {
//                mapita.agregarDatoSobreescribiendo(localDate, new ListaTurno());
//            }
//            System.out.println("Estos son los dias con los turnos disponibles");
//            mapita.recorrerElMapitaYVerLasKeys();
//
//
//            for (int i = 0; i < 2; i++) {
//                mapita.agregarTurnoAMapa(LocalDate.of(2023, 06, 06), lista);
//                //lista.mostrarListaClientes();
//                mapita.recorrerElMapitaYMostrar();
//            }


//        mapita.agregarDatoSinRepetir(LocalDate.of(1979, 01, 01), new ListaTurno());
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingrese fecha del turno DD/MM/AAAA: ");
//        Integer fechaTurnoDia = scanner.nextInt();
//        Integer fechaTurnoMes = scanner.nextInt();
//        Integer fechaTurnoAnio = scanner.nextInt();
//        scanner.nextLine();
        // LocalDate fecha2 =(LocalDate.of(fechaTurnoAnio, fechaTurnoMes, fechaTurnoDia));

        //   mapita.agregarTurnoAMapa(fecha, lista);
//        mapita.agregarTurnoAMapa(turno2, LocalDate.now());
//        mapita.agregarTurnoAMapa(turno3, LocalDate.now());
//        mapita.agregarTurnoAMapa(turno4, LocalDate.now());
        //  mapita.recorrerElMapitaYMostrar();
    }
}/// poner en las keys en vez de no hay turnos que la lista esta disponible para agregar turnos y cuando la lista este completa mostrar no disponibles (veamoslo)
//agregar el servicio cuando se muestra el turno