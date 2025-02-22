package com.mycompany.actividad4;

public class Materia {
    private String nombre;
    private String clave;
    private int creditos;
    private int horasSemanales;

    public Materia() {
        this.nombre = "";
        this.clave = "";
        this.creditos = 0;
        this.horasSemanales = 0;
    }

    public Materia(String nombre, String clave, int creditos, int horasSemanales) {
        this.nombre = nombre;
        this.clave = clave;
        this.creditos = creditos;
        this.horasSemanales = horasSemanales;
    }

    public Materia(Materia materia) {
        this.nombre = materia.nombre;
        this.clave = materia.clave;
        this.creditos = materia.creditos;
        this.horasSemanales = materia.horasSemanales;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }

    public int getCreditos() { return creditos; }
    public void setCreditos(int creditos) { this.creditos = creditos; }

    public int getHorasSemanales() { return horasSemanales; }
    public void setHorasSemanales(int horasSemanales) { this.horasSemanales = horasSemanales; }
}