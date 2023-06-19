package Controller;

import Model.*;
import View.ClientesDetails;
import View.TurnosDetails;
import View.TurnosForm;

import javax.lang.model.type.NullType;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.File;

public class TurnoController {
    private String turnosFile = "src\\data\\turnosNew.txt";
    private String clientesFile = "src\\data\\clientesNew.txt";
    private String clientesJson = "src\\data\\clientesNew.json";
    private TurnosDatabase turnosDatabase;
    private ClientesDatabase clientesDatabase;
    private TurnosForm form;
    private TurnosDetails turnosDetails;

    public TurnoController(TurnosForm form, TurnosDetails turnosDetails) {
        this.turnosDatabase = new TurnosDatabase();
        this.clientesDatabase = new ClientesDatabase();
        this.form = form;
        this.turnosDetails = turnosDetails;

        this.clientesDatabase.cargarArrayListDesdeJson(new File(clientesJson));

        this.form.submitTurno(e -> {
            String fecha = this.form.getFecha().trim();
            String apellido = this.form.getHora().trim();
       //     Cliente cliente = this.form.getCliente();
       //     Servicio servicio = this.form.getServicio();

            // validaciones
            if(fecha.isEmpty()) {
                JOptionPane.showMessageDialog(this.form, "Ingrese Fecha.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            } else if(apellido.isEmpty()) {
                JOptionPane.showMessageDialog(this.form, "Ingrese Hora.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;

//            } else if(cliente.getNombre().isEmpty()) {
//                JOptionPane.showMessageDialog(this.form, "Ingrese Cliente.", "Error",
//                        JOptionPane.ERROR_MESSAGE);
//                return;
//            }   else if() {
//                JOptionPane.showMessageDialog(this.form, "Ingrese Servicio.", "Error",
//                        JOptionPane.ERROR_MESSAGE);
//                return;
            }

         //   this.database.agregarTurno(new Turno(cliente, factura, telefono));
          //  this.database.guardarCliente(new File(databaseFile));
          //  this.form.reset(true);
        });




        // carga turno
        this.form.verTurnos(e -> {
            this.turnosDetails.getTurnos(this.turnosDatabase.cargaTurno(new File(turnosFile)));
        });
    }
}
