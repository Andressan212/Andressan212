
public class Usuario extends Persona {
    private int id;
    private int idCuota;
    private String usuario;
    private String clave;

    public Usuario() {
    	super();
    }
    
    public Usuario(String nombre, String apellido, String dni, String domicilio, String telefono, int id, int idCuota, String usuario, String clave) {
    	super(nombre,apellido,dni,domicilio,telefono);
        this.id = id;
        this.idCuota = idCuota;
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCuota(){
    	return idCuota;
    }
    
    public void setIdCuota(int cuota) {
    	this.idCuota = cuota;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }   
}

