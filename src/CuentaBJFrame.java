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
        addComponentsToFirstSonPanel();
        addComponentsToSecondSonPanel();
        addComponentsToThirdSonPanel();
        addComponentsToPanelPadre();
        addPanelPadreToFrame();
        frame.setVisible(true);
    }

    private static void addPanelPadreToFrame() {
        frame.getContentPane().add(panelPadre);
    }

    private static void addComponentsToPanelPadre() {
        panelPadre.add(firstSonPanel, BorderLayout.NORTH);
        panelPadre.add(secondSonPanel, BorderLayout.CENTER);
        panelPadre.add(thirdSonPanel, BorderLayout.SOUTH);
    }

    private static void addComponentsToThirdSonPanel() {
        thirdSonPanel.add(lblResultado);
        thirdSonPanel.add(txtAreaResultado);
    }

    private static void addComponentsToSecondSonPanel() {
        secondSonPanel.add(btnDesplegarCuenta);
    }

    private static void addComponentsToFirstSonPanel() {
        firstSonPanel.add(lblNumCuenta);
        firstSonPanel.add(txtNumCuenta);
        firstSonPanel.add(lblNombreCliente);
        firstSonPanel.add(txtNombreCliente);
        firstSonPanel.add(lblSaldo);
        firstSonPanel.add(txtSaldo);
    }

    private static void inicializarThirdPanel() {
        thirdSonPanel = new JPanel();
        thirdSonPanel.setLayout(new BoxLayout(thirdSonPanel, BoxLayout.X_AXIS));
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
