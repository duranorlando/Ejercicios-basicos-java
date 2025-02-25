import java.util.Scanner;

public class SistemaAscensor {

    public static void main(String[] args) {
        
        iniciarAscensor();
    }

    public static void iniciarAscensor() {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Por favor, ingrese la temperatura ambiente en grados Celsius: ");
        int temperaturaAmbiente = entrada.nextInt();

    
        int temperaturaOptima = 25;

        
        if (temperaturaAmbiente <= temperaturaOptima) {
    
            System.out.print("La temperatura es adecuada. Por favor, ingrese el piso al que desea ir: ");
            int pisoDeseado = entrada.nextInt();
            System.out.println("Ascensor en movimiento hacia el piso " + pisoDeseado + ".");
        } else {
            
            System.out.println("ALERTA: La temperatura es demasiado alta. El ascensor no puede moverse.");
        }

        
        entrada.close();
    }
}

