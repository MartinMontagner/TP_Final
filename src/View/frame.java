package View;

import Controller.ClienteController;

import javax.swing.*;
import java.awt.*;

public class frame extends JFrame {

    private CardLayout cardLayout;

    public frame() {
        super("JP+ NAIL SALON");
        cardLayout = new CardLayout();

        setLayout(cardLayout);

        ClientesForm clientesForm = new ClientesForm();
        ClientesDetails clientesDetails = new ClientesDetails();
        new ClienteController(clientesForm, clientesDetails);

        add(clientesForm, "clientesForm");
        add(clientesDetails, "CLIENTES");

        clientesForm.verClientes(e -> cardLayout.show(frame.this.getContentPane(), "CLIENTES"));
        clientesDetails.backButton(e -> cardLayout.show(frame.this.getContentPane(), "clientesForm"));


        ImageIcon imageIcon = new ImageIcon("src/assets/jp+.png");
        setIconImage(imageIcon.getImage());

        int FRAME_WIDTH = 1200;
        int FRAME_HEIGHT = 700;

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
