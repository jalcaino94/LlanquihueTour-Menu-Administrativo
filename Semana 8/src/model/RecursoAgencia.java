/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author acamp
 */
public abstract class RecursoAgencia {
    protected String id;
    protected String nombre;

    public RecursoAgencia(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public RecursoAgencia() {
    }

    // Agregamos estos getters y setters porque la GUI los va a necesitar para leer los datos
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}