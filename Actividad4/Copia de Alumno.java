package com.mycompany.actividad4;

public class Alumno {
    private String matricula;
    private String nombre;
    private int edad;
    private Curso curso;

    public Alumno() {
        this.matricula = "";
        this.nombre = "";
        this.edad = 0;
        this.curso = new Curso();
    }

    public Alumno(String matricula, String nombre, int edad, Curso curso) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public Alumno(Alumno alumno) {
        this.matricula = alumno.matricula;
        this.nombre = alumno.nombre;
        this.edad = alumno.edad;
        this.curso = new Curso(alumno.curso);
    }

    public String getNombre() { return nombre; }
    public Curso getCurso() { return curso; }
}