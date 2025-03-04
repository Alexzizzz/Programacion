package modelo;

import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private int id;
    private String titulo;
    private String descripcion;
    private String estado;
    private Usuario asignadoA;
    private List<Tarea> dependencias;

    public Tarea(int id, String titulo, String descripcion, Usuario asignadoA) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = "Pendiente";
        this.asignadoA = asignadoA;
        this.dependencias = new ArrayList<>();
    }

    public void marcarComoCompletada() {
        this.estado = "Completada";
    }

    public String getEstado() {
        return estado;
    }
}