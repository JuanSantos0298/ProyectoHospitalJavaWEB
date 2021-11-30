/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author alex4
 */
public class HistoriaMedica {
    
    int idHistoria;
    String peso;
    String altura;
    String antecedentes;
    String motivoConsulta;
    String alergias;
    String fechaIngreso;
    String medicacion;
    int historialPaciente;
    
    public HistoriaMedica() {
    }

    public HistoriaMedica(int idHistoria, String peso, String altura, String antecedentes, String motivoConsulta, String alergias, String fechaIngreso, String medicacion, int historialPaciente) {
        this.idHistoria = idHistoria;
        this.peso = peso;
        this.altura = altura;
        this.antecedentes = antecedentes;
        this.motivoConsulta = motivoConsulta;
        this.alergias = alergias;
        this.fechaIngreso = fechaIngreso;
        this.medicacion = medicacion;
        this.historialPaciente = historialPaciente;
    }

    public int getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(String medicacion) {
        this.medicacion = medicacion;
    }

    public int getHistorialPaciente() {
        return historialPaciente;
    }

    public void setHistorialPaciente(int historialPaciente) {
        this.historialPaciente = historialPaciente;
    }
}
