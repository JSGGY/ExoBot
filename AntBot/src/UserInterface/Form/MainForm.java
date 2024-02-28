package UserInterface.Form;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import UserInterface.CustomerControl.SebButton;

public class MainForm extends JPanel {
    SebButton btnIniciarSesion = new SebButton("Iniciar Sesión"),
            btnCrearCuenta = new SebButton("Crear Cuenta");
    private JLabel background; // Etiqueta para la imagen de fondo

    public MainForm() {

        cusromizarPanel();
        btnIniciarSesion.addActionListener(e -> rolPanelIniciar());

        btnCrearCuenta.addActionListener(e -> btnCrearCuentaClick());
    }

    private void rolPanelIniciar() {
        try {
            removeAll();
            add(new RolPanel());
            revalidate();
            repaint();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar PatPnlPersonaSexo",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnCrearCuentaClick() {
        JOptionPane.showMessageDialog(this, "Por el momento no puedes Crear una cuenta");

    }

    private void cusromizarPanel() {
        setLayout(new BorderLayout()); // Establece el diseño del MainForm como BorderLayout

        // Carga la imagen de fondo
        ImageIcon backgroundImage = new ImageIcon(
                "AntBot\\Resource\\FondoMainPanel.png"); // Cambia la
        // ruta por
        // la
        // ubicación
        // de tu imagen
        background = new JLabel(backgroundImage);

        // Establece el tamaño del fondo para que coincida con el tamaño del MainForm
        background.setPreferredSize(new Dimension(getWidth(), getHeight()));

        // Establece el diseño del fondo como BorderLayout para que cubra todo el
        // MainForm
        background.setLayout(new BorderLayout());

        // Agrega los botones al fondo
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setOpaque(false); // Hace que el panel de botones sea transparente
        buttonsPanel.add(btnIniciarSesion);
        buttonsPanel.add(btnCrearCuenta);

        // Agrega el panel de botones al centro del fondo
        background.add(buttonsPanel, BorderLayout.CENTER);

        // Agrega el fondo al MainForm
        add(background);
    }
}
