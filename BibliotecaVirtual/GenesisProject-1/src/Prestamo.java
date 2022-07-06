
public class Prestamo {
    private int id;
    private int idUsuario;
    private int idLibro;
    private String fechaEntrega;
    private String fechaDevolucion;
    private String estado;

    public Prestamo() {
    }

    public Prestamo(int id, int usuario, int libro, String fechaEntrega, String fechaDevolucion, String estado) {
        this.id = id;
        this.idUsuario = usuario;
        this.idLibro = libro;
        this.fechaEntrega = fechaEntrega;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int libro) {
        this.idLibro = libro;
    }


    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
