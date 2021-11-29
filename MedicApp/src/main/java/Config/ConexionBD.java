package Config;

/**
 *
 * @author Juan Santos
 */

//Importamos las librerias necesarias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionBD {
   public static final String URL = "jdbc:mysql://localhost:3306/hospitalphp";
   public static final String User = "root";
   public static final String Pass = "";
   
   public Statement sentencia; 
   public ResultSet resultado; 
   
   public static Connection conectar;
   
   public Connection getConnection(){
       //Connection conectar = null;
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(URL, User, Pass);
           
           sentencia = conectar.createStatement();          
       }
       catch (Exception e){
           System.out.print(e.getMessage());
       }
       return conectar;
   }
}

