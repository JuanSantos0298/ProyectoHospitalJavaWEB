package main;

//Importamos las librerias correspondientes
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Juan Santos
 */
public class PruebaBD {
    ConexionBD conexion = new ConexionBD();
    Connection conecta = conexion.getConnection();
    
    String msg = "Se ha establecido la conexion a la base de datos. :D"; 
}
