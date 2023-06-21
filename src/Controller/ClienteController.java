package Controller;



import Model.Cliente;
import Model.ClientesDatabase;
import View.ClientesDetails;
import View.ClientesForm;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ClienteController {
    private String jsonFile = "src\\data\\clientes.json";
    private ClientesDatabase database;
    private ClientesForm form;
    private ClientesDetails clientesDetails;

    public ClienteController(ClientesForm form, ClientesDetails clientesDetails) {
        this.database = new ClientesDatabase();
        this.form = form;
        this.clientesDetails = clientesDetails;

        this.database.cargarArrayListDesdeJson(new File(jsonFile));

        // pasa cliente
        this.form.submitClientes(e -> {
            String nombre = this.form.getNombre().trim();
            String apellido = this.form.getApellido().trim();
            String telefono = this.form.getTelefono().trim();

            // validaciones
            if(nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this.form, "Ingrese Nombre.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            } else if(apellido.isEmpty()) {
                JOptionPane.showMessageDialog(this.form, "Ingrese Apellido.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            } else if(telefono.isEmpty()) {
                    JOptionPane.showMessageDialog(this.form, "Ingrese Teléfono.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
            }

            this.database.agregarCliente(new Cliente(nombre, apellido, telefono));

            JOptionPane.showMessageDialog(this.form, "Cliente " + nombre + " " + apellido + " guardado correctamente.", "Cliente Guardado", JOptionPane.INFORMATION_MESSAGE);

            this.database.guardarArrayClientesJson(new File(jsonFile));
            this.form.reset(true);

        });

        // carga clientes
        this.form.verClientes(e -> {
            this.clientesDetails.getClientesJson(this.database.cargarArrayListDesdeJson(new File(jsonFile)));
        });


    }

}
