// Clase para representar los tickets
public class Ticket {
    private String id;
    private String descripcion;
    private Usuario usuario;
    private Consultor consultorAsignado;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Consultor getConsultorAsignado() {
        return consultorAsignado;
    }
    public void setConsultorAsignado(Consultor consultorAsignado) {
        this.consultorAsignado = consultorAsignado;
    }
}

