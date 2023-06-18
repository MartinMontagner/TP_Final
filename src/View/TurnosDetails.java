package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class TurnosDetails extends JPanel {

    private JTable turnosTable;
    private String[] turnosTableColumn = {"FECHA", "HORA", "SERVICIO", "CLIENTE"};

    private JButton backButton;

    public TurnosDetails() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        JToolBar toolBar = new JToolBar();
        turnosTable = new JTable();

        JScrollPane userTableScroll = new JScrollPane(turnosTable, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        backButton = new JButton("SALIR");
        add(toolBar);
        toolBar.add(backButton);
        toolBar.setMaximumSize(new Dimension(Integer.MAX_VALUE, toolBar.getMinimumSize().height));
        add(userTableScroll);

    }

    // carga table desde database
    public void getTurnos(Object[] objects) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) turnosTable.getModel();
        defaultTableModel.setColumnIdentifiers(turnosTableColumn);
        int i = 0;
        while(i < objects.length) {
            String row = objects[i].toString().trim();
            String[] rows = row.split(",");
            defaultTableModel.addRow(rows);
            i++;
        }
    }

    public void backButton(ActionListener actionListener) {
        backButton.addActionListener(actionListener);
    }
}
