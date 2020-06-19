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
public class Cajero extends Persona {

    private Persona idCajero;

    public Cajero() {
    }

    public Persona getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(Persona idCajero) {
        this.idCajero = idCajero;
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

    @Override
    public int calcularEdad() {
        return 0;
    }

}
