package Excercises;
import Model.CuentaBancaria;

public class OperacionesBancarias {
    
    public static void ejecutar() {
        // Crear una cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria(12345, "Zoro Roronoa", 1240.0);

        // Mostrar saldo inicial
        System.out.println(" *** Operaciones Bancarias ***");
        System.out.println();
        System.out.println("Saldo inicial:");
        cuenta.mostrarSaldo();
        System.out.println();

     // Operación 1: depósito válido
        try {
            cuenta.depositar(200);
            System.out.println("Operacion 1: deposito de 200 realizado.");
        } catch (ArithmeticException e) {
            System.out.println("Operacion 1 - Error: El deposito no fué realizado " );
        }

        // Operación 2: depósito inválido (negativo)
        try {
            cuenta.depositar(-100);
            System.out.println("Operacion 2: deposito de -100 realizado.");
        } catch (ArithmeticException e) {
            System.out.println("Operacion 2 - Error: El monto a depositar debe ser positivo " );
        }

        // Operación 3: retiro válido
        try {
            cuenta.retirar(150);
            System.out.println("Operacion 3: retiro de 150 realizado.");
        } catch (ArithmeticException e) {
            System.out.println("Operacion 3 - Error: El retiro no fué realizado " );
        }

        // Operación 4: retiro mayor al saldo disponible
        try {
            cuenta.retirar(5000);
            System.out.println("Operacion 4: retiro de 5000 realizado.");
        } catch (ArithmeticException e) {
            System.out.println("Operacion 4 - Error: El monto a retirar excede el saldo disponible " );
        }

        // Operación 5: retiro de cantidad cero
        try {
            cuenta.retirar(0);
            System.out.println("Operacion 5: retiro de 0 realizado.");
        } catch (ArithmeticException e) {
            System.out.println("Operacion 5 - Error: El monto a retirar debe ser mayor que cero " );
        }

        // Saldo final
        System.out.println();
        System.out.println("--- Saldo final ---");
        cuenta.mostrarSaldo();
    }
}
