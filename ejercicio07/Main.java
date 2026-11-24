// Ejercicio 7: Excepciones

class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
    }
}

class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double monto) throws FondosInsuficientesException {
        if (monto > saldo) {
            throw new FondosInsuficientesException("Fondos insuficientes. Saldo actual: $" + saldo);
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(100);

        try {
            cuenta.retirar(40);
            cuenta.retirar(100);
        } catch (FondosInsuficientesException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
