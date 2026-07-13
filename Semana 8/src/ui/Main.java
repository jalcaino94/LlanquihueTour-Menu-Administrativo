package ui;

import data.GestorEntidades;
import model.GuiaTuristico;
import model.Vehiculo;
import javax.swing.JOptionPane;

/**
 * Clase Principal con Interfaz Gráfica Básica para Llanquihue Tour
 * @author acamp
 */
public class Main {

    public static void main(String[] args) {
        // Instanciamos el gestor para manejar la lista dinámica
        GestorEntidades gestor = new GestorEntidades();
        int opcion = 0;

        // Ciclo principal del menú visual
        while (opcion != 4) {
            String menu = "=== LLANQUIHUE TOUR - MENÚ ADMINISTRATIVO ===\n"
                        + "1. Registrar Guía Turístico\n"
                        + "2. Registrar Vehículo de la Agencia\n"
                        + "3. Visualizar Resumen de Entidades\n"
                        + "4. Salir\n\n"
                        + "Seleccione una opción (1-4):";

            // Mostramos el menú y capturamos la opción del usuario
            String entrada = JOptionPane.showInputDialog(null, menu, "Gestión de Entidades", JOptionPane.QUESTION_MESSAGE);

            // Validamos si el usuario presionó Cancelar o cerró la ventana
            if (entrada == null) {
                break;
            }

            try {
                opcion = Integer.parseInt(entrada);

                switch (opcion) {
                    case 1:
                        // FORMULARIO PARA GUÍA TURÍSTICO
                        String idGuia = JOptionPane.showInputDialog("Ingrese ID del Guía:");
                        String nomGuia = JOptionPane.showInputDialog("Ingrese Nombre del Guía:");
                        String idioma = JOptionPane.showInputDialog("Ingrese Idioma del Guía:");

                        if (idGuia != null && nomGuia != null && idioma != null) {
                            GuiaTuristico nuevoGuia = new GuiaTuristico(idGuia, nomGuia, idioma);
                            gestor.agregarEntidad(nuevoGuia);
                            JOptionPane.showMessageDialog(null, "¡Guía Turístico registrado con éxito!");
                        }
                        break;

                    case 2:
                        // FORMULARIO PARA VEHÍCULO
                        String idVehiculo = JOptionPane.showInputDialog("Ingrese ID del Vehículo:");
                        String modVehiculo = JOptionPane.showInputDialog("Ingrese Modelo del Vehículo:");
                        String patente = JOptionPane.showInputDialog("Ingrese Patente del Vehículo:");

                        if (idVehiculo != null && modVehiculo != null && patente != null) {
                            Vehiculo nuevoVehiculo = new Vehiculo(idVehiculo, modVehiculo, patente);
                            gestor.agregarEntidad(nuevoVehiculo);
                            JOptionPane.showMessageDialog(null, "¡Vehículo registrado con éxito!");
                        }
                        break;

                    case 3:
                        // VISUALIZACIÓN DE REGISTROS
                        if (gestor.getLista().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No hay entidades registradas en el sistema todavía.", "Lista Vacía", JOptionPane.WARNING_MESSAGE);
                        } else {
                            // Imprimimos la cabecera en la consola para el video
                            System.out.println("\n=== DESPLIEGUE DE RESUMEN DESDE LA GUI ===");
                            
                            // Ejecutamos tu método polimórfico con instanceof
                            gestor.listarTodo(); 
                            
                            JOptionPane.showMessageDialog(null, "El resumen se ha impreso con éxito en la consola de NetBeans.", "Visualización Correcta", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 4:
                        JOptionPane.showMessageDialog(null, "Saliendo del sistema de gestión. ¡Hasta pronto!");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Intente con números del 1 al 4.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero válido.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}