package View;

import Model.Cliente;
import Model.ListaCliente;
import Model.ListaTurno;
import Model.MapaGenerico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFrame {
    private JPanel jp;
    private JTabbedPane tabbedPane1;
    private JButton RESERVARUNTURNOButton;
    private JButton VERTURNOSButton;
    private JButton ELIMINARTURNOButton;
    private JButton VERCLIENTESButton;
    private JButton AGREGARCLIENTEButton;
    private JButton ELIMINARCLIENTEButton;
    private JPanel verClientes;
    private JList listadoClientes;


    public MainFrame() {
        VERCLIENTESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String title = "CLIENTES";
                JFrame f = new JFrame(title);
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
              //  JList list = new JList(clientes.toArray());
              //  JScrollPane scrollPane = new JScrollPane(list);

                Container contentPane = f.getContentPane();
             //   contentPane.add(scrollPane, BorderLayout.CENTER);

                f.setSize(300, 400);
                f.setLocationRelativeTo(null);
                f.setVisible(true);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JP+ NAIL SALON");
        frame.setContentPane(new MainFrame().jp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void pedirUnTurno(ListaCliente lista) {

        MapaGenerico<LocalDate, ListaTurno> mapita = new MapaGenerico<>();

        LocalDate fecha = LocalDate.of(2023, 06, 01);
        int ultimoDiaDelMes = fecha.lengthOfMonth();
        List<LocalDate> fechasDelMes = new ArrayList<>();

        for (int dia = 1; dia <= ultimoDiaDelMes; dia++) {
            LocalDate fechaActual = fecha.withDayOfMonth(dia);
            fechasDelMes.add(fechaActual);
        }

        for (LocalDate localDate : fechasDelMes) {
            mapita.agregarDatoSobreescribiendo(localDate, new ListaTurno());
        }
        System.out.println("Estos son los dias con los turnos disponibles");
        mapita.recorrerElMapitaYVerLasKeys();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese fecha del turno DD/MM/AAAA: ");
        Integer fechaTurnoDia = scanner.nextInt();
        Integer fechaTurnoMes = scanner.nextInt();
        Integer fechaTurnoAnio = scanner.nextInt();
        scanner.nextLine();
        LocalDate fechaEspecifica = LocalDate.of(fechaTurnoAnio, fechaTurnoMes, fechaTurnoDia);
        mapita.agregarTurnoAMapa(fechaEspecifica, lista);

        mapita.recorrerElMapitaYMostrar();
    }
}


