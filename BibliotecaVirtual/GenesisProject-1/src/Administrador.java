
public class Administrador extends Persona{
	
	private int id;
	private String usuario;
	private String clave;
	
	public Administrador() {
    	super();
    }
    
    public Administrador(String nombre, String apellido, String dni, String domicilio, String telefono, int id, String usuario, String clave) {
    	super(nombre,apellido,dni,domicilio,telefono);
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
    } 
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
