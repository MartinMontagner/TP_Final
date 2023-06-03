import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

                Cliente cliente1 = new Cliente("Julian", "Zapata", "2234567899");
                Cliente cliente2 = new Cliente("Martin", "Montagner", "2234567899");
                Cliente cliente3 = new Cliente("Franco", "Guidi", "2234567899");
                Cliente cliente4 = new Cliente("Kevin", "Tolosa", "2234567899");


                ArrayList<Cliente> clientes =new ArrayList<Cliente>();
                clientes.add(cliente1);
                clientes.add(cliente2);
                clientes.add(cliente3);
                clientes.add(cliente4);

                String title = "CLIENTES";
                JFrame f = new JFrame(title);
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                JList list = new JList(clientes.toArray());
                JScrollPane scrollPane = new JScrollPane(list);

                Container contentPane = f.getContentPane();
                contentPane.add(scrollPane, BorderLayout.CENTER);

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
}


