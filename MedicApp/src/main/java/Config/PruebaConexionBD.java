package Config;

/**
 *
 * @author Juan Santos
 */

//Importamos las librerias necesarias
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaConexionBD {

    public static void main(String[] args) {
        try {
            ConexionBD conexion = new ConexionBD();
            Connection conecta = conexion.getConnection(); 

            String msg = "Se ha establecido la conexion con la base de datos. :D"; 

            System.out.println(msg);

            String user = "Juan Carlos";
            int id = 12000;

            //Pruebas
            String SQL = "Select nombre from medico where id_medico = '"+id+"';";
            conexion.resultado = conexion.sentencia.executeQuery(SQL);
            System.out.println("Registro encontrado. ");
            
            //
            String sql = "Select * from medico where id_medico = '"+id+"';";
            ResultSet data = conexion.sentencia.executeQuery(sql);
            
            while(data.next()){
                System.out.println(data.getString("id_medico") + " " + data.getString("nombre") + " " + data.getString("apellido_paterno") + " " + data.getString("apellido_materno") + " " + data.getString("especialidad"));
            }
            
        }catch(SQLException ex){
            
            System.out.println(ex);
        }
    }
}
