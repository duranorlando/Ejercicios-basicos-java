import java.util.Scanner;

public class AdministrarTareas {
    
    public static void main(String[] args) {
        iniciarGestorTareas();  
    }

    
    public static void iniciarGestorTareas() {
        Scanner lector = new Scanner(System.in);
        
        
        String respuestaUsuario = "si";
        
        
        while (respuestaUsuario.equalsIgnoreCase("si")) {
            
            String nombreTarea = ingresarNombreTarea(lector);
            String fechaVencimiento = ingresarFechaVencimiento(lector);
            
        
            mostrarDetallesTarea(nombreTarea, fechaVencimiento);
            
            
            respuestaUsuario = obtenerRespuestaUsuario(lector);
        }
        

        System.out.println("La gestión de tareas ha finalizado.");
        
        lector.close();
    }

    
    public static String ingresarNombreTarea(Scanner scanner) {
        System.out.print("Ingrese el nombre de la tarea: ");
        return scanner.nextLine();
    }

    // Método para ingresar la fecha de vencimiento de la tarea
    public static String ingresarFechaVencimiento(Scanner scanner) {
        System.out.print("Ingrese la fecha de vencimiento de la tarea (dd/mm/yyyy): ");
        return scanner.nextLine();
    }

    // Método para mostrar los detalles de la tarea ingresada
    public static void mostrarDetallesTarea(String nombreTarea, String fechaVencimiento) {
        System.out.println("Tarea ingresada correctamente.");
        System.out.println("Nombre: " + nombreTarea);
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
    }

    // Método para obtener la respuesta del usuario sobre si desea agregar más tareas
    public static String obtenerRespuestaUsuario(Scanner scanner) {
        System.out.print("¿Desea agregar otra tarea? (si/no): ");
        return scanner.nextLine();
    }
}
