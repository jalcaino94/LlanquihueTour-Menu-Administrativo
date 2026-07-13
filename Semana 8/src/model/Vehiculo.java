/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author acamp
 */
public class Vehiculo extends RecursoAgencia implements Registrable {
    private String patente;

    public Vehiculo(String id, String nombre, String patente) {
        super(id, nombre);
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public void mostrarResumen() {
        // Usamos los getters heredados de RecursoAgencia para evitar errores de acceso
        System.out.println("[VEHÍCULO] ID: " + getId() + " | Modelo: " + getNombre() + " | Patente: " + patente);
    }
}