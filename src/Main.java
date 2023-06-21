
import View.frame;
import View.intro;


import javax.swing.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {



        //USA THREAD NUEVO DE AWT PARA LA VIEW
        new intro();
        SwingUtilities.invokeLater(frame::new);


    }


}






















        //todo usa como key de los mapas las fechas y lo value turnos
        // usa try y catch y los swtich
        // que se puede crear un cliente elegir el tipo de servicio el cual muestre su precio
        // y duracion etc usa todos los metodos
        // ordena las clases en carpetas asi es todos mas legible
//
       // Model.ServicioManicura servicioMano = new Model.ServicioManicura(2.0, Model.TipoDeManicura.GEL);
//        Model.ServicioPedicura servicioPie = new Model.ServicioPedicura(2.0, Model.TipoDePedicura.PREMIUM);
//
        //Model.Factura factura1 = new Model.Factura(Model.MedioPago.EFECTIVO, servicioMano);
        //factura1.toString();
//        Model.Factura factura2 = new Model.Factura(Model.MedioPago.TARJETA, servicioPie);
//
//        Model.Cliente cliente1 = new Model.Cliente("Julian", "Zapata", "2234567899");
//       Model.Cliente cliente2 = new Model.Cliente("Martin", "Montagner", "2234567899");
//        Cliente cliente3 = new Cliente("f", "Guidi", "2234567899");
//        Model.Cliente cliente4 = new Model.Cliente("Kevin", "Tolosa", "2234567899");
//
//        ClientesDatabase database = new ClientesDatabase();
////       database.setListaClientes(new ArrayList<Cliente>());
////       database.agregarCliente(cliente1);
////       database.agregarCliente(cliente2);
////       database.agregarCliente(cliente3);
////        database.agregarCliente(cliente4);
//
////      database.guardarArrayClientesJson(new File("clientesJsonNEW.json"));
//            database.cargarArrayListDesdeJson(new File("clientesJsonNEW.json"));
//        System.out.println(database.getListaClientes());


//        Model.ListaTurno listaTurno = new Model.ListaTurno();

        // lista.agregarClientesALaLista();

        // lista.mostrarListaClientes();
        //listaTurno.agregarTurnoALaLista(lista);
        // Model.ArchivoJsonGenericos<Model.ListaCliente> archivoJsonGenericos = new Model.ArchivoJsonGenericos<>(lista);

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
//        gson.toJson(lista, Model.ListaCliente.class, bufferedWriter);
//        bufferedWriter.close();

//        BufferedReader bufferedReader = new BufferedReader(new FileReader(archivoAEscribir + ".json"));
//
//        Model.ListaCliente listaExterna = gson.fromJson(bufferedReader, Model.ListaCliente.class);
//        System.out.println(listaExterna);*/

//TURNOS
 ///       ListaCliente lista = new ListaCliente();
        //lista.agregarClienteUnico(cliente3);
 //   MainFrame myObject = new MainFrame();
 //   for(int i=0;i<3;i++) {
 //       myObject.pedirUnTurno(lista);
 //   }
    
//        Model.Turno turno2 = new Model.Turno(cliente4, factura2, LocalDate.now(),"T");
//        Model.Turno turno3 = new Model.Turno(cliente1, factura2, LocalDate.now(),"T");
//        Model.Turno turno4 = new Model.Turno(cliente2, factura2, LocalDate.now(),"N");
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
        //Gson gson = new Gson();
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
            //Model.Turno turno1 = new Model.Turno(cliente3, factura1, LocalDate.now(), "M");

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
//            Model.MapaGenerico<LocalDate, Model.ListaTurno> mapita = new Model.MapaGenerico<>();
//            for (LocalDate localDate : fechasDelMes) {
//                mapita.agregarDatoSobreescribiendo(localDate, new Model.ListaTurno());
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


//        mapita.agregarDatoSinRepetir(LocalDate.of(1979, 01, 01), new Model.ListaTurno());
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingrese fecha del turno DD/MM/AAAA: ");
//        Integer fechaTurnoDia = scanner.nextInt();
//        Integer fechaTurnoMes = scanner.nextInt();
//        Integer fechaTurnoAnio = scanner.nextInt();
//        scanner.nextLine();
        // LocalDate fecha2 =(LocalDate.of(fechaTurnoAnio, fechaTurnoMes, fechaTurnoDia));

        //mapita.agregarTurnoAMapa(fecha, lista);
//        mapita.agregarTurnoAMapa(turno2, LocalDate.now());
//        mapita.agregarTurnoAMapa(turno3, LocalDate.now());
//        mapita.agregarTurnoAMapa(turno4, LocalDate.now());
        //mapita.recorrerElMapitaYMostrar();
/// poner en las keys en vez de no hay turnos que la lista esta disponible para agregar turnos y cuando la lista este completa mostrar no disponibles (veamoslo)
//agregar el servicio cuando se muestra el turno