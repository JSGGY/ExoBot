package UserInterface.Form; // Define el paquete donde se encuentra la clase PnlLoginSoldado

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import UserInterface.CustomerControl.SebButton;

public class RolPanel extends JPanel {

    private SebButton btnSoldado;
    private SebButton btnReina;
    private SebButton btnZangano;
    private SebButton btnRastreadora;
    private SebButton btnLarva;
    private Image backgroundImage;
    private SebButton btnRegresar;

    public RolPanel() {
        initializeComponents();
        setupLayout();
        setupActions();
        loadImage();
    }

    private void initializeComponents() {
        btnSoldado = new SebButton("Soldado");
        btnReina = new SebButton("Reina");
        btnZangano = new SebButton("Zángano");
        btnRastreadora = new SebButton("Rastreadora");
        btnLarva = new SebButton("Larva");
        btnSoldado.setPreferredSize(new Dimension(150, 50));
        btnReina.setPreferredSize(new Dimension(150, 50));
        btnZangano.setPreferredSize(new Dimension(150, 50));
        btnRastreadora.setPreferredSize(new Dimension(150, 50));
        btnLarva.setPreferredSize(new Dimension(150, 50));
        btnRegresar = new SebButton("Regresar");
    }

    private void setupLayout() {
        setLayout(new BorderLayout());

        JPanel panerIncicioSesion = new JPanel(new FlowLayout(FlowLayout.CENTER, 300, 270));
        panerIncicioSesion.setOpaque(false);
        JPanel btnPanel = new JPanel();
        btnPanel.setOpaque(false); // Hace que el panel de botones sea transparente
        btnPanel.add(btnSoldado);
        btnPanel.add(btnReina);
        btnPanel.add(btnZangano);
        btnPanel.add(btnRastreadora);
        btnPanel.add(btnLarva);
        panerIncicioSesion.add(btnPanel);
        add(panerIncicioSesion, BorderLayout.CENTER);
        JPanel panelRegresar = new JPanel(new FlowLayout(FlowLayout.LEFT)); // Nuevo panel para el botón "Regresar"
        panelRegresar.setOpaque(false); // Hacer transparente el panel

        panelRegresar.add(btnRegresar); // Agregar el botón "Regresar" al panel

        add(panelRegresar, BorderLayout.SOUTH); // Agregar el panel de "Regresar" en la parte inferior
    }

    private void setupActions() {
        btnSoldado.addActionListener(e -> SoldadoLoginPanel());

        // btnReina.addActionListener(e -> LoginAdminPanel());
        // btnZangano.addActionListener(e -> LoginRepartidorPanel());
        btnRegresar.addActionListener(e -> MainForm());
    }

    private void MainForm() {
        try {
            removeAll();
            add(new MainForm());
            revalidate();
            repaint();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar PatPnlPersonaSexo",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // private void LoginRepartidorPanel() {
    // try {
    // removeAll();
    // add(new LoginRepartidorPanel());
    // revalidate();
    // repaint();
    // } catch (Exception ex) {
    // ex.printStackTrace();
    // JOptionPane.showMessageDialog(this, "Error al cargar PatPnlPersonaSexo",
    // "ERROR", JOptionPane.ERROR_MESSAGE);
    // }
    // }

    // private void LoginAdminPanel() {
    // try {
    // removeAll();
    // add(new LoginAdminPanel());
    // revalidate();
    // repaint();
    // } catch (Exception ex) {
    // ex.printStackTrace();
    // JOptionPane.showMessageDialog(this, "Error al cargar PatPnlPersonaSexo",
    // "ERROR", JOptionPane.ERROR_MESSAGE);
    // }
    // }

    private void SoldadoLoginPanel() {
        try {
            removeAll();
            add(new SoldadoLoginPanel());
            revalidate();
            repaint();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar SoldadoLoginPanel",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadImage() {
        ImageIcon imagenFondo = new ImageIcon(
                "AntBot\\Resource\\FondoRolPaneles.png");
        backgroundImage = imagenFondo.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }

    // @Override
    // public Dimension getPreferredSize() {
    // return new Dimension(600, 400); // Establece el tamaño preferido del panel
    // }
}
