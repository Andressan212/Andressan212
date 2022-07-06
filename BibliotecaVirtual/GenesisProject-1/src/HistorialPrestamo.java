
public class HistorialPrestamo {
	
	private int id;
	private String fechaReal; 
	
	
	public HistorialPrestamo() {
    }
    
    public HistorialPrestamo(int id, String fechaReal) {
    
        this.id = id;
        this.fechaReal = fechaReal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfechaReal(){
    	return fechaReal;
    }
    
    public void setfechaReal(String fechaReal) {
    	this.fechaReal = fechaReal;
    }
    
}
