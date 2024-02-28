import java.awt.SplashScreen;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import UserInterface.Form.MainForm;
import UserInterface.Form.SplashScreenForm;

public class App {
    public static void main(String[] args) {
        iniciarSistema();
    }

    public static void iniciarSistema() {
        // SplashScreenForm.show();
        MainForm mainForm = new MainForm();
        JFrame frame = new JFrame("LovingFans");
        frame.add(mainForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        ImageIcon icon = new ImageIcon("Resource\\Icono.png");
        // Cambia
        // la ruta
        // logo
        frame.setIconImage(icon.getImage());
        frame.setSize(830, 750); // Por ejemplo, tamaño de 400x300 píxeles
        frame.setVisible(true);

    }
}
