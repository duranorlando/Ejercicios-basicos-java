import java.util.Scanner;

public class GestorDeLibros {

    public static void main(String[] args) {
        gestionarLibros();
    }

    public static void gestionarLibros() {
        Scanner scanner = new Scanner(System.in);

    
        int cantidadDeLibros = 0;

    
        while (cantidadDeLibros < 5) {
            
            System.out.println("\nPor favor ingrese los detalles del libro:");

            System.out.print("Ingrese el título del libro: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingrese el nombre del autor: ");
            String autor = scanner.nextLine();

            System.out.print("Ingrese el número de páginas: ");
            int paginas = scanner.nextInt();
            scanner.nextLine();  

        
            System.out.println("\nDetalles del libro ingresado:");
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Páginas: " + paginas);

            cantidadDeLibros++; 

        
            System.out.println("Has ingresado " + cantidadDeLibros + " libro(s).");
        }

    
        System.out.println("\n¡Has registrado 5 libros! Gracias por tu tiempo.");
        
    
        scanner.close();
    }
}
