import java.util.Random;
// Clase Singleton para manejar el sistema de tickets
public class GestorTickets {
    private static GestorTickets instancia;

    private GestorTickets() {
        // Inicialización de recursos, como conexiones a base de datos
    }

    public static synchronized GestorTickets getInstancia() {
        if (instancia == null) {
            instancia = new GestorTickets();
        }
        return instancia;
    }

    // Métodos para manejar tickets y consultores
    public Ticket crearTicket(DatosTicket datos) {
        
            // Crear un nuevo ticket con los datos ingresados
            Ticket nuevoTicket = new Ticket();
            nuevoTicket.setId(generarIdUnico()); // Generar un ID único para el ticket
            nuevoTicket.setDescripcion(datos.getDescripcionProblema());
            return nuevoTicket;
    }

    private String generarIdUnico() {
        int x = 0;
        Random random = new Random();
        x = random.nextInt();
        return Integer.toString(x);
    }

    public void asignarTicket(Ticket ticket) {
        // Me falta implementar
        //Acá relacionariamos el id del ticket con el consultor
    }


}