
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private int id;
    private String nombre;
    private String descripcion;
    private List<Tarea> tareas;

    public Proyecto(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public float calcularProgreso() {
        if (tareas.isEmpty()) return 0;
        long completadas = tareas.stream().filter(t -> t.getEstado().equals("Completada")).count();
        return (completadas / (float) tareas.size()) * 100;
    }
}