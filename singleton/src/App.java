import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener la instancia del gestor de tickets
        GestorTickets gestor = GestorTickets.getInstancia();

        // Solicitar información al usuario para crear un ticket
        System.out.println("Bienvenido al sistema de tickets.");
        System.out.print("Ingrese su ID de cliente: ");
        String idCliente = scanner.nextLine();

        System.out.print("Descripción del problema: ");
        String descripcionProblema = scanner.nextLine();


        // Crear un nuevo ticket con los datos ingresados
        DatosTicket datos = new DatosTicket(idCliente, descripcionProblema);
        Ticket ticket = gestor.crearTicket(datos);

        // Mostrar los datos del ticket
        System.out.println("\nTicket creado con los siguientes datos:");
        System.out.println("ID del ticket: " + ticket.getId());
        System.out.println("Descripción: " + ticket.getDescripcion());

 
        System.out.print("\n¿Desea confirmar la creación del ticket? (Sí/No): ");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("El ticket ha sido asignado correctamente.");
        } else {
            System.out.println("El ticket no ha sido asignado.");
        }

        scanner.close();
    }
}

