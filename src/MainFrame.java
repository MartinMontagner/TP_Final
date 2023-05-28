import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {
    private JPanel jp;
    private JTabbedPane tabbedPane1;
    private JButton RESERVARUNTURNOButton;
    private JButton VERTURNOSButton;
    private JButton ELIMINARTURNOButton;
    private JButton VERCLIENTESButton;
    private JButton AGREGARCLIENTEButton;
    private JButton ELIMINARCLIENTEButton;
    private JPanel verTurnos;
    private JFormattedTextField formattedTextField1;


    public MainFrame() {
        VERTURNOSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("TURNOS");
                frame.setContentPane(new MainFrame().verTurnos);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setSize(300, 200);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);


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


