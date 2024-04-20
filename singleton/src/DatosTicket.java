public class DatosTicket {
    private String idCliente;
    private String descripcionProblema;
    
  
    // Constructor que inicializa los datos del ticket
    public DatosTicket(String idCliente, String descripcionProblema) {
        this.idCliente = idCliente;
        this.descripcionProblema = descripcionProblema;
    }

    // Getters y setters
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getDescripcionProblema() {
        return descripcionProblema;
    }

    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }

}