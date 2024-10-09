public class CuentaBancaria {
    private String numeroCuenta;
    private String nombreCliente;
    private double saldo;

    public CuentaBancaria() {
        numeroCuenta = "";
        nombreCliente = "";
        saldo = 0.0;
    }

    public CuentaBancaria(String numeroCuenta, String nombreCliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
