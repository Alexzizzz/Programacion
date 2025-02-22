package com.mycompany.actividad4;

public class Profesor {
    private String nombre;
    private String numeroNomina;
    private double sueldoPorHora;
    private Materia materia;

    public Profesor() { }

    public Profesor(String nombre, String numeroNomina, double sueldoPorHora, Materia materia) {
        this.nombre = nombre;
        this.numeroNomina = numeroNomina;
        this.sueldoPorHora = sueldoPorHora;
        this.materia = materia;
    }

    public double calcularSueldoSemanal() {
        return sueldoPorHora * materia.getHorasSemanales();
    }
}