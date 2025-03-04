
package com.Main.app;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        // Crear usuario
        Usuario usuario1 = new Usuario(1, "Carlos Pérez", "carlos@empresa.com", "Desarrollador", "12345");

        // Crear proyecto
        Proyecto proyecto = new Proyecto(1, "Sistema de Gestión", "Plataforma para organizar proyectos");

        // Crear tarea y asignarla al usuario
        Tarea tarea1 = new Tarea(1, "Diseñar Base de Datos", "Definir tablas y relaciones", usuario1);

        // Agregar tarea al proyecto
        proyecto.agregarTarea(tarea1);

        // Mostrar progreso inicial
        System.out.println("Progreso del proyecto: " + proyecto.calcularProgreso() + "%");

        // Completar la tarea
        tarea1.marcarComoCompletada();
        System.out.println("Progreso tras completar tarea: " + proyecto.calcularProgreso() + "%");
    }
}