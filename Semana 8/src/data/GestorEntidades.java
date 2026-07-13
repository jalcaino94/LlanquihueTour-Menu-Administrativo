/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import model.Registrable;
import model.GuiaTuristico;
import model.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author acamp
 */
public class GestorEntidades {
    // Colección genérica de tipo Registrable
    private ArrayList<Registrable> listaEntidades = new ArrayList<>();

    public void agregarEntidad(Registrable entidad) {
        listaEntidades.add(entidad);
    }

    public void listarTodo() {
        for (Registrable r : listaEntidades) {
            // Uso de instanceof adaptado estrictamente a tus dos clases actuales
            if (r instanceof GuiaTuristico) {
                System.out.print("[OPERACIÓN INTERNA - PERSONAL] -> ");
            } else if (r instanceof Vehiculo) {
                System.out.print("[LOGÍSTICA - TRANSPORTE] -> ");
            }
            
            r.mostrarResumen(); // Llamada polimórfica
        }
    }
    
    public ArrayList<Registrable> getLista() { 
        return listaEntidades; 
    }
}