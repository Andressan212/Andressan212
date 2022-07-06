
public class Cuota {
	
	private int id;
	private String fechaInicio; 
	private String fechaFinal;
	private String periodo;
	private String estadoCuota;
	private double importe;
	
	public Cuota() {
    }
    
    public Cuota(int id, String fechaInicio, String fechaFinal, String periodo, String estadoCuota, double importe) {
    
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.periodo = periodo;
        this.estadoCuota = estadoCuota;
        this.importe = importe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfechaInicio(){
    	return fechaInicio;
    }
    
    public void setfechaInicio(String fechaInicio) {
    	this.fechaInicio = fechaInicio;
    }
    
    public String getfechaFinal() {
        return fechaFinal;
    }

    public void setfechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }


    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }   
    
    public String getestadoCuota() {
        return estadoCuota;
    }

    public void setestadoCuota(String estadoCuota) {
        this.estadoCuota = estadoCuota;
    } 
    
    public double getimporte() {
        return importe;
    }

    public void setimporte(double importe) {
        this.importe = importe;
    } 
}
