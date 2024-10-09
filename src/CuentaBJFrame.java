import javax.swing.*;

public class CuentaBJFrame {
    static JLabel lblNumCuenta, lblNombreCliente, lblSaldo, lblResultado;
    static JTextField txtNumCuenta, txtNombreCliente, txtSaldo;
    static JTextArea txtAreaResultado;
    static JButton btnDesplegarCuenta;
    static JFrame frame;
    static JPanel panelPadre, firstSonPanel, secondSonPanel, thirdSonPanel;

    public static void main(String[] args) {
        inicializarJFrame();
        frame.setVisible(true);
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
