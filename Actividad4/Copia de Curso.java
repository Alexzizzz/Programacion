package com.mycompany.actividad4;

public class Curso {
    private String nombre;
    private Materia[] materias;

    public Curso() {
        this.nombre = "";
        this.materias = new Materia[3];
    }

    public Curso(String nombre, Materia m1, Materia m2, Materia m3) {
        this.nombre = nombre;
        this.materias = new Materia[] { m1, m2, m3 };
    }

    public Curso(Curso curso) {
        this.nombre = curso.nombre;
        this.materias = curso.materias.clone();
    }

    public int calcularCreditos() {
        int total = 0;
        for (Materia m : materias) {
            total += m.getCreditos();
        }
        return total;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Materia[] getMaterias() { return materias; }
    public void setMaterias(Materia[] materias) { this.materias = materias; }
}