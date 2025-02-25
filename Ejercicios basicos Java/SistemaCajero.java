import java.util.Scanner;

public class SistemaCajero {

    public static void main(String[] args) {
        realizarTransaccion();
    }

    public static void realizarTransaccion() {
        Scanner scanner = new Scanner(System.in);
        double saldoCuenta = 1000.00; 
        double montoRetiro;

    
        System.out.println("Bienvenido al cajero automático.");
        System.out.println("Saldo actual: $" + saldoCuenta);


        System.out.print("Ingrese el monto que desea retirar: $");
        montoRetiro = scanner.nextDouble();


        while (montoRetiro > saldoCuenta) {
            System.out.println("Error: El monto que desea retirar excede el saldo disponible.");
            System.out.print("Por favor ingrese un monto menor o igual al saldo disponible: $");
            montoRetiro = scanner.nextDouble();
        }

        
        saldoCuenta -= montoRetiro;
        System.out.println("Transacción realizada con éxito.");
        System.out.println("Monto retirado: $" + montoRetiro);
        System.out.println("Nuevo saldo: $" + saldoCuenta);
        scanner.close();
    }
}
