package Model;


public class CuentaBancaria {
    //atributos
    private int numeroCuenta;
    private String titular;
    private double saldo;

    //constructor que inicialice los atributos
    public CuentaBancaria(int numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    //getters 
    public int getNumeroCuenta() {
        return numeroCuenta;   
    }
   
    public String getTitular() {
        return titular;
    }
  
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad <= 0) {

            throw new ArithmeticException("Cantidad debe ser mayor que cero.");
        }
            saldo += cantidad;
    }
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            throw new ArithmeticException("Cantidad debe ser mayor que cero.");
        }

        if (cantidad > saldo) {
            throw new ArithmeticException("Saldo insuficiente.");
        }

        saldo -= cantidad;
    }
    public void mostrarSaldo() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

}
