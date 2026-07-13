# LlanquihueTour-Menu-Administrativo

Gestión de Recursos Operativos

En esta etapa, el sistema ha dejado de ser una aplicación puramente de consola para incorporar una **Interfaz Gráfica de Usuario (GUI)** básica, la implementación de contratos de comportamiento mediante **Interfaces**, y la validación de tipos dinámicos en colecciones homogéneas.

---

##Nuevas Características

El sistema cumple con todos los indicadores de logro establecidos en la evaluación sumativa:
* **Contrato Común (Interfaz):** Definición de la interfaz `Registrable` en el paquete `model`, estableciendo el método abstracto `mostrarResumen()`[cite: 2].
* **Jerarquía Funcional (Herencia):** Implementación de la superclase abstracta `RecursoAgencia` con atributos protegidos, extendida por las subclases `GuiaTuristico` y `Vehiculo`[cite: 2].
* **Diferenciación Dinámica (`instanceof`):** Almacenamiento de datos en un `ArrayList<Registrable>` y uso del operador `instanceof` para aplicar etiquetas lógicas personalizadas según el tipo de objeto en tiempo de ejecución[cite: 2].
* **Interfaz Gráfica (GUI):** Menú interactivo y formularios de captura desarrollados mediante la librería `JOptionPane`, facilitando el ingreso de datos al personal administrativo[cite: 2].

---

##Estructura del Proyecto

```text
src/
└── model/               # Entidades y Contratos (Capa del Modelo)
    ├── Registrable.java      (Interfaz)
    ├── RecursoAgencia.java   (Clase Abstracta)
    ├── GuiaTuristico.java    (Subclase)
    └── Vehiculo.java         (Subclase)
└── data/                # Lógica de Datos y Almacenamiento
    └── GestorEntidades.java  (Colección e instanceof)
└── ui/                  # Capa de Usuario (Frontend Visual)
    └── Main.java             (Interfaz con JOptionPane)
