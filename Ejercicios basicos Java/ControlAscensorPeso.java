import java.util.Scanner;

public class ControlAscensorPeso {

    public static void main(String[] args) {
        
        verificarPesoYDestino();
    }

    public static void verificarPesoYDestino() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Por favor, ingrese su peso (kg): ");
        double pesoUsuario = scanner.nextDouble();

        
        if (pesoUsuario > 150) {
            System.out.println("ERROR: El peso ingresado excede el límite permitido para el ascensor.");
            scanner.close();
            return; 
        }

    
        System.out.print("Ingrese el número de piso al que desea dirigirse: ");
        int pisoDeseado = scanner.nextInt();

    
        if (pesoUsuario <= 150) {
            System.out.println("El ascensor está en movimiento hacia el piso " + pisoDeseado + ".");
        }

        
        scanner.close();
    }
}
