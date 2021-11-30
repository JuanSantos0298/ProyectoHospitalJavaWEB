/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Config.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author alex4
 */
public class MedicoDAO {
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Medico validar(String usuario, String password){
        Medico med = new Medico();
        String sql = "SELECT * FROM medico WHERE id_medico=? AND password=?";
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, password);
            rs=ps.executeQuery();
            while(rs.next()){
                med.setIdMedico(rs.getInt("id_medico"));
                med.setPassword(rs.getString("password"));
                med.setNombre(rs.getString("nombre"));
                med.setApellidoPaterno(rs.getString("apellido_paterno"));
                med.setApellidoMaterno(rs.getString("apellido_materno"));
                med.setEspecialidad(rs.getString("especialidad"));
            }
        }catch (Exception e){
            
        }
        return med;
    }
    
    /* OPERACIONES CRUD*/
    
}
