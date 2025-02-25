import java.util.Scanner;

public class AsistenciaVirtualCine {

    public static void main(String[] args) {
    
        gestionarAsistenciaAlCine();
    }

    public static void gestionarAsistenciaAlCine() {
        
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Por favor, ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();  

        
        if (edad >= 0 && edad <= 6) {
            
            System.out.println("Recomendamos películas animadas y educativas.");
        } else if (edad >= 7 && edad <= 17) {
        
            System.out.println("Recomendamos películas de animación, aventuras y comedias familiares.");
        } else if (edad >= 18 && edad <= 30) {
            
            System.out.println("Recomendamos películas de acción, drama, comedia y ciencia ficción.");
        } else if (edad >= 31) {
            
            System.out.println("Recomendamos películas de comedia y dramas de interés.");
        } else {
        
            System.out.println("Edad no válida. Por favor ingrese una edad correcta.");
        }

    
        scanner.close();
    }
}
