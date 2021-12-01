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
public class HistoriaMedicaDAO {
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar(int idPaciente){
        String sql = "SELECT * FROM historialmedico WHERE historialPaciente = " + idPaciente;
        List<HistoriaMedica> lista = new ArrayList<>();
        
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                HistoriaMedica hm = new HistoriaMedica();
                hm.setIdHistoria(rs.getInt(1));
                hm.setPeso(rs.getString(2));
                hm.setAltura(rs.getString(3));
                hm.setAntecedentes(rs.getString(4));
                hm.setMotivoConsulta(rs.getString(5));
                hm.setAlergias(rs.getString(6));
                hm.setFechaIngreso(rs.getString(7));
                hm.setMedicacion(rs.getString(8));
                hm.setHistorialPaciente(rs.getInt(9));
                lista.add(hm);
            }
            System.out.println(sql);
        }catch (Exception e){
            System.out.println("HistoriaMedicaDAO::agregar -- Algo salio mal!:c");
            System.out.println(e);
        }
        return lista;
    }
    
    public int agregar(HistoriaMedica hm){
        System.out.println("PacienteDAO::agregar -- Agregando paciente");
        String sql = "INSERT INTO historialmedico(peso, altura, antecedentes, motivoConsulta, alergias, fechaIngreso, medicacion, historialPaciente, historialMedico) VALUES (?,?,?,?,?,?,?,?,?)";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, hm.getPeso());
            ps.setString(2, hm.getAltura());
            ps.setString(3, hm.getAntecedentes());
            ps.setString(4, hm.getMotivoConsulta());
            ps.setString(5, hm.getAlergias());
            ps.setString(6, hm.getFechaIngreso());
            ps.setString(7, hm.getMedicacion());
            ps.setInt(8, hm.getHistorialPaciente());
            ps.setInt(9, hm.getHistorialMedico());
            
            ps.executeUpdate();
        } catch (SQLException e){
                    System.out.println("HistorialMedicoDAO::agregar -- Algo salio mal!:c");
                    System.out.println(e);
        }
        return 1;
    }
}
