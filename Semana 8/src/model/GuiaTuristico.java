/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author acamp
 */
public class GuiaTuristico extends RecursoAgencia implements Registrable {
    private String idioma;

    public GuiaTuristico(String id, String nombre, String idioma) {
        super(id, nombre);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public void mostrarResumen() {
        // Usamos getId() y getNombre() que vienen heredados de RecursoAgencia
        System.out.println("[GUÍA] ID: " + getId() + " | Nombre: " + getNombre() + " | Idioma: " + idioma);
    }
}