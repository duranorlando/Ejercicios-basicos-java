import java.util.Scanner;

public class Elevator {

    public static void main(String[] args) {
    
    }

    public static void launchElevator() {
        Scanner inputScanner = new Scanner(System.in);

    
        System.out.print("Por favor, ingrese el número de piso al que desea dirigirse: ");
        int destinoPiso = inputScanner.nextInt();

        
        moverAscensor(destinoPiso);
        
        inputScanner.close();
    }

    public static void moverAscensor(int destino) {
        System.out.println("El ascensor está en movimiento hacia el piso: " + destino);
       
    }
}
