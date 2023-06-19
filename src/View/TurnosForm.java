package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Locale;

import Model.Cliente;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import com.github.lgooddatepicker.optionalusertools.PickerUtilities;
import com.github.lgooddatepicker.optionalusertools.TimeVetoPolicy;


public class TurnosForm extends JPanel {

    private DatePicker fechaPicker;
    private TimePicker horaPicker;
    private JButton addButton;
    private JButton viewButton;
    private JList<String> listadoClientes;

    private static class TiempoPermitido implements TimeVetoPolicy {

        @Override
        public boolean isTimeAllowed(LocalTime time) {
            // admite tiempo de 9am a 5pm.
            return PickerUtilities.isLocalTimeInRange(
                    time, LocalTime.of(9, 00), LocalTime.of(17, 00), true);
        }

    }

    public TurnosForm() {


        JLabel fechaLabel = new JLabel("Fecha: ");
        JLabel horarioLabel = new JLabel("Hora: ");
        JLabel clienteLabel = new JLabel("Cliente: ");

        DatePickerSettings fechaSettings = new DatePickerSettings();
        fechaPicker = new DatePicker(fechaSettings);
        TimePickerSettings horaSettings = new TimePickerSettings(Locale.getDefault());
        horaPicker = new TimePicker(horaSettings);

        listadoClientes= new JList<>();
        listadoClientes.setVisible(true);

        addButton = new JButton("Agregar Turno");
        addButton.setPreferredSize(new Dimension(278, 40));
        viewButton = new JButton("Ver todos los Turnos");
        viewButton.setPreferredSize(new Dimension(278, 40));


        Insets fieldsInset = new Insets(0, 0, 10, 0);

        Insets buttonInset = new Insets(20,0,0,0);

        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = fieldsInset;
        gridBagConstraints.fill = GridBagConstraints.NONE;

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        add(fechaLabel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        fechaSettings.setLocale(new Locale("es", "ES"));
        fechaSettings.setDateRangeLimits(LocalDate.now(), LocalDate.MAX);
        fechaSettings.setEnableMonthMenu(true);
        fechaSettings.setVisibleClearButton(false);
        add(fechaPicker, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        add(horarioLabel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        horaSettings.setVetoPolicy(new TiempoPermitido());
        add(horaPicker, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        add(clienteLabel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = GridBagConstraints.WEST;


        add(listadoClientes, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = buttonInset;

        add(addButton, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = buttonInset;

        add(viewButton, gridBagConstraints);
    }


    public String getFecha() {
        return fechaPicker.getText();
    }
    public String getHora() {
        return horaPicker.getText();
    }
   // public String getCliente() {return fonoField.getText();}

    public void verTurnos(ActionListener actionListener) {
        viewButton.addActionListener(actionListener);
    }

    public void submitTurno(ActionListener actionListener) {
        addButton.addActionListener(actionListener);
    }

    public void listarClientes(ArrayList<Cliente> clientes) {
        listadoClientes=new JList<>(clientes.toArray(new String[clientes.size()]));
    }



}
