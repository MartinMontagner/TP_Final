package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Locale;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;

public class TurnosForm extends JPanel {

    private DatePicker fechaPicker;
    private TimePicker horaPicker;
    private JButton addButton;
    private JButton viewButton;

    public TurnosForm() {

        JLabel fechaLabel = new JLabel("Fecha: ");
        JLabel horarioLabel = new JLabel("Apellido: ");
        JLabel clienteLabel = new JLabel("Cliente: ");

        DatePickerSettings fechaSettings = new DatePickerSettings(Locale.getDefault());
        fechaPicker = new DatePicker(fechaSettings);
        TimePickerSettings horaSettings = new TimePickerSettings(Locale.getDefault());
        horaPicker = new TimePicker(horaSettings);

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

        fechaSettings.setDateRangeLimits(LocalDate.now(), LocalDate.MAX);
        fechaSettings.setEnableMonthMenu(true);
        add(fechaPicker, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        add(horaPicker, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = buttonInset;

        add(addButton, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
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

    public void submitTurno(ActionListener actionListener) {
        addButton.addActionListener(actionListener);
    }

    public void verTurnos(ActionListener actionListener) {
        viewButton.addActionListener(actionListener);
    }

}
