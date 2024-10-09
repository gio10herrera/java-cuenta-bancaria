import javax.swing.*;
import java.awt.*;

public class CuentaBJFrame {
    static JLabel lblNumCuenta, lblNombreCliente, lblSaldo, lblResultado;
    static JTextField txtNumCuenta, txtNombreCliente, txtSaldo;
    static JTextArea txtAreaResultado;
    static JButton btnDesplegarCuenta;
    static JFrame frame;
    static JPanel panelPadre, firstSonPanel, secondSonPanel, thirdSonPanel;

    public static void main(String[] args) {
        inicializarJFrame();
        inicializarComponentes();
        inicializarPanelPadre();
        inicializarFirstSonPanel();
        inicializarSecondPanel();
        inicializarThirdPanel();
        frame.setVisible(true);
    }

    private static void inicializarThirdPanel() {
        thirdSonPanel = new JPanel();
    }

    private static void inicializarSecondPanel() {
        secondSonPanel = new JPanel(new GridLayout(1, 1));
    }

    private static void inicializarFirstSonPanel() {
        firstSonPanel = new JPanel();
        firstSonPanel.setLayout(new BoxLayout(firstSonPanel, BoxLayout.Y_AXIS));
    }

    private static void inicializarPanelPadre() {
        panelPadre = new JPanel(new BorderLayout());
    }

    private static void inicializarComponentes() {
        lblNumCuenta = new JLabel("Numero de Cuenta");
        lblNumCuenta.setHorizontalAlignment(SwingConstants.CENTER);
        lblNombreCliente = new JLabel("Nombre Cliente");
        lblNombreCliente.setHorizontalAlignment(SwingConstants.CENTER);
        lblSaldo = new JLabel("Saldo");
        lblSaldo.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultado = new JLabel("Resultado");
        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
        txtNumCuenta = new JTextField();
        txtNumCuenta.setHorizontalAlignment(SwingConstants.CENTER);
        txtNombreCliente = new JTextField();
        txtNombreCliente.setHorizontalAlignment(SwingConstants.CENTER);
        txtSaldo = new JTextField();
        txtSaldo.setHorizontalAlignment(SwingConstants.CENTER);
        txtAreaResultado = new JTextArea();
        btnDesplegarCuenta = new JButton("Desplegar Cuenta");
    }

    private static void inicializarJFrame() {
        //creacion del JFrame
        frame = new JFrame();
        frame.setSize(300, 400);
        //jFrameInterfaz.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Cuenta Bancaria");
    }
}
