package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	Connection con; 
	private String DRIVER = "com.mysql.cj.jdbc.Driver";
	private String BD_URL= "jdbc:mysql://localhost:3308/biblioteca";
	private String USER = "root";
	private String PASS = "";
	
	public Connection conectar() {
		try {
			Class.forName(DRIVER); 
			con = DriverManager.getConnection(BD_URL,USER,PASS); 
			
		}catch(Exception error) { 
			System.out.println("Problemas al intentar conectar a la bd" );
		}
		return con;
	}
}
