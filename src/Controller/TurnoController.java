package Controller;

import Model.*;
import View.ClientesDetails;
import View.TurnosDetails;
import View.TurnosForm;

import javax.lang.model.type.NullType;
import javax.swing.*;
import java.io.File;

public class TurnoController {
    private String databaseFile = "src\\data\\turnosNew.txt";
    private TurnosDatabase database;
    private TurnosForm form;
    private TurnosDetails turnosDetails;
    private ClientesDetails clientesDetails;

    public TurnoController(TurnosForm form, TurnosDetails turnosDetails) {
        this.database = new TurnosDatabase();
        this.form = form;
        this.turnosDetails = turnosDetails;

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

        // carga clientes
        this.form.verTurnos(e -> {
            this.turnosDetails.getTurnos(this.database.cargaTurno(new File(databaseFile)));
        });
    }
}
