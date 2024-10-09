import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CuentaBJFrame {
    static JLabel lblNumCuenta, lblNombreCliente, lblSaldo, lblResultado;
    static JTextField txtNumCuenta, txtNombreCliente, txtSaldo;
    static JTextArea txtAreaResultado;
    static JButton btnDesplegarCuenta;
    static JFrame frame;
    static JPanel panelPadre, firstSonPanel, secondSonPanel, thirdSonPanel;
    static CuentaBancaria cuentaBancaria;

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
        implementarBoton();
        frame.setVisible(true);
    }

    private static void implementarBoton() {
        btnDesplegarCuenta.addActionListener(e -> {
            crearCuentaBancaria();
            mostrarCuentaBancaria();
        });
    }

    private static void mostrarCuentaBancaria() {
        if (cuentaBancaria != null) {
            String resultado = "Numero de cuenta: " + cuentaBancaria.getNumeroCuenta() + "\nNombre: " + cuentaBancaria.getNombreCliente() + "\nSaldo: " + cuentaBancaria.getSaldo();
            txtAreaResultado.setText(resultado);
        }
    }

    private static void crearCuentaBancaria() {
        String numCuenta = txtNumCuenta.getText();
        String nombreCliente = txtNombreCliente.getText();
        double saldo = Double.parseDouble(txtSaldo.getText());
        cuentaBancaria = new CuentaBancaria(numCuenta, nombreCliente, saldo);
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
        thirdSonPanel.add(Box.createHorizontalStrut(15));
        thirdSonPanel.add(txtAreaResultado);
    }

    private static void addComponentsToSecondSonPanel() {
        secondSonPanel.add(btnDesplegarCuenta);
    }

    private static void addComponentsToFirstSonPanel() {
        firstSonPanel.add(lblNumCuenta);
        firstSonPanel.add(txtNumCuenta);
        firstSonPanel.add(Box.createVerticalStrut(10));
        firstSonPanel.add(lblNombreCliente);
        firstSonPanel.add(txtNombreCliente);
        firstSonPanel.add(Box.createVerticalStrut(10));
        firstSonPanel.add(lblSaldo);
        firstSonPanel.add(txtSaldo);
    }

    private static void inicializarThirdPanel() {
        thirdSonPanel = new JPanel();
        thirdSonPanel.setLayout(new BoxLayout(thirdSonPanel, BoxLayout.X_AXIS));
        thirdSonPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    }

    private static void inicializarSecondPanel() {
        secondSonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //secondSonPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        secondSonPanel.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new LineBorder(Color.LIGHT_GRAY)));
    }

    private static void inicializarFirstSonPanel() {
        firstSonPanel = new JPanel();
        firstSonPanel.setLayout(new BoxLayout(firstSonPanel, BoxLayout.Y_AXIS));
        firstSonPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
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
        txtAreaResultado.setRows(3);
        txtAreaResultado.setEditable(false);
        txtAreaResultado.setEnabled(false);
        txtAreaResultado.setDisabledTextColor(Color.GRAY);
        txtAreaResultado.setBorder(new LineBorder(Color.LIGHT_GRAY));
        btnDesplegarCuenta = new JButton("Desplegar Cuenta");
    }

    private static void inicializarJFrame() {
        //creacion del JFrame
        frame = new JFrame();
        frame.setSize(300, 280);
        //jFrameInterfaz.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Cuenta Bancaria");
    }
}
