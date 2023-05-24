import java.io.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
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


        System.out.println(factura1.toString());
        System.out.println(factura2.toString());



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