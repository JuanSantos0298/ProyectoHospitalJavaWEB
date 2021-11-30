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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alex4
 */
public class PacienteDAO {
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    int r;

    public List listar(){
        String sql = "SELECT * FROM paciente";
        List<Paciente> lista = new ArrayList<>();
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt(1));
                paciente.setNombre(rs.getString(2));
                paciente.setApellidoPaterno(rs.getString(3));
                paciente.setApellidoMaterno(rs.getString(4));
                paciente.setTelefono(rs.getString(5));
                paciente.setDireccion(rs.getString(6));
                paciente.setSeguroMedico(rs.getString(7));
                paciente.setEdad(rs.getInt(8));
                paciente.setEstadoCivil(rs.getString(9));
                
                lista.add(paciente);
            }
        } catch (Exception e){
        
        }
        return lista;
    }
    
    public int agregar(Paciente paciente){
        String sql = "INSERT INTO paciente(nombre, apellido_paterno, apellido_materno, telefono, direccion, seguroMedico, edad, estadoCivil, medicoAsignado) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.apellidoPaterno);
            ps.setString(3, paciente.getApellidoMaterno());
            ps.setString(4, paciente.getTelefono());
            ps.setString(5, paciente.getDireccion());
            ps.setString(6, paciente.getSeguroMedico());
            ps.setInt(7, paciente.getEdad());
            ps.setString(8, paciente.getEstadoCivil());
            ps.setInt(9, paciente.getMedicoAsignado());
            ps.executeUpdate();
        } catch (Exception e){
            
        }
        return r;
    }
    
    public Paciente listarId(int id){
        Paciente paciente = new Paciente();
        String sql = "SELECT * FROM paciente WHERE id_paciente =" + id;
        
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                paciente.setIdPaciente(rs.getInt(1));
                paciente.setNombre(rs.getString(2));
                paciente.setApellidoPaterno(rs.getString(3));
                paciente.setApellidoMaterno(rs.getString(4));
                paciente.setTelefono(rs.getString(5));
                paciente.setDireccion(rs.getString(6));
                paciente.setSeguroMedico(rs.getString(7));
                paciente.setEdad(rs.getInt(8));
                paciente.setEstadoCivil(rs.getString(9));
                paciente.setMedicoAsignado(rs.getInt(10));
            }
        } catch(SQLException e){
            
        }
        return paciente;
    }
    
     public int actualizar(Paciente paciente){
        String sql = "UPDATE paciente set nombre=?, apellido_paterno=?, apellido_materno=?, telefono=?, direccion=?, seguroMedico=?, edad=?, estadoCivil=?, medicoAsignado=?"
                + "WHERE id_paciente = ?";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.apellidoPaterno);
            ps.setString(3, paciente.getApellidoMaterno());
            ps.setString(4, paciente.getTelefono());
            ps.setString(5, paciente.getDireccion());
            ps.setString(6, paciente.getSeguroMedico());
            ps.setInt(7, paciente.getEdad());
            ps.setString(8, paciente.getEstadoCivil());
            ps.setInt(9, paciente.getMedicoAsignado());
            ps.setInt(10, paciente.idPaciente);
            ps.executeUpdate();
        } catch (Exception e){
            
        }
        return r;
    }
     
     public void delete(int id){
         String sql = "DELETE FROM paciente WHERE id_paciente =" + id;
         try{   
             con = cn.getConnection();
             ps = con.prepareStatement(sql);
             ps.executeUpdate();
         } catch (SQLException e){
             
         }
     }
}
