
package com.Main.app;

import modelo.*;

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario(1, "Carlos Pérez", "carlos@empresa.com", "Desarrollador", "12345");


        Proyecto proyecto = new Proyecto(1, "Sistema de Gestión", "Plataforma para organizar proyectos");


        Tarea tarea1 = new Tarea(1, "Diseñar Base de Datos", "Definir tablas y relaciones", usuario1);


        proyecto.agregarTarea(tarea1);

 
        System.out.println("Progreso del proyecto: " + proyecto.calcularProgreso() + "%");


        tarea1.marcarComoCompletada();
        System.out.println("Progreso tras completar tarea: " + proyecto.calcularProgreso() + "%");
    }
}