
public class Stock {
    private int id;
    private int Cantidad;

    public Stock() {
    } 

    public Stock(int id, int Cantidad) {
        this.id = id;
        this.Cantidad = Cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
}
