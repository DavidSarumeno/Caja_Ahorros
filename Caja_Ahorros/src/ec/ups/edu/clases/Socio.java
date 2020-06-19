/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.clases;

/**
 *
 * @author David
 */
public class Socio extends Persona {

    private Persona idSocio;
    private String nombreEmpresa;
    private String rucEmpresa;

    public Socio() {
    }

    public Persona getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(Persona idSocio) {
        this.idSocio = idSocio;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRucEmpresa() {
        return rucEmpresa;
    }

    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }

    @Override
    public String toString() {
        return "Socio{" + "nombreEmpresa=" + nombreEmpresa + ", rucEmpresa=" + rucEmpresa + '}';
    }

    @Override
    public int calcularEdad() {
        return 0;

    }

    @Override
    public void crearPersona() {
    }

    @Override
    public String buscarPersona(String cedula) {
        return cedula;
    }

    @Override
    public String actualizarPersona(String cedula) {
        return cedula;
    }

    @Override
    public String eliminarPersona(String cedula) {
        return cedula;
    }

}
