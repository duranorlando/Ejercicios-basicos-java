import java.util.Scanner;

public class AgendaPersonal {

    
    static class Contacto {
        String nombre;
        String telefono;

        Contacto(String nombre, String telefono) {
            this.nombre = nombre;
            this.telefono = telefono;
        }

    
        public String toString() {
            return nombre + " - " + telefono;
        }
    }

    
    private static Contacto[] contactos = new Contacto[10];
    private static int indiceContacto = 0;

    public static void main(String[] args) {
    
        mostrarMenu();
    }

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        
        while (true) {
            
            System.out.println("\n--- Menú de Agenda Personal ---");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Ver Contactos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  

        
            if (opcion == 1) {
                agregarContacto(scanner);
            } else if (opcion == 2) {
                verContactos();
            } else if (opcion == 3) {
                System.out.println("Saliendo... ¡Hasta luego!");
                break; 
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        
        scanner.close();
    }

    public static void agregarContacto(Scanner scanner) {
        if (indiceContacto < 10) {
            
            System.out.print("Ingrese el nombre del contacto: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el número de teléfono: ");
            String telefono = scanner.nextLine();

            
            contactos[indiceContacto] = new Contacto(nombre, telefono);
            indiceContacto++;

            System.out.println("¡Contacto agregado exitosamente!");
        } else {
            System.out.println("Agenda llena, no se pueden agregar más contactos.");
        }
    }

    public static void verContactos() {
        if (indiceContacto == 0) {
            System.out.println("No hay contactos registrados.");
        } else {
            System.out.println("\n--- Lista de Contactos ---");
            for (int i = 0; i < indiceContacto; i++) {
                System.out.println((i + 1) + ". " + contactos[i]);
            }
        }
    }
}
