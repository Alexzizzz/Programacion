package com.mycompany.actividad4;

public class Actividad4 {
    public static void main(String[] args) {
        Materia m1 = new Materia("Matemáticas", "MAT101", 5, 4);
        Materia m2 = new Materia("Historia", "HIS102", 3, 3);
        Materia m3 = new Materia("Ciencia", "CIE103", 4, 4);

        Curso curso = new Curso("Curso Básico", m1, m2, m3);

        Alumno alumno = new Alumno("A001", "Miles Morales", 15, curso);

        Profesor profesor = new Profesor("Tony Stark", "P001", 200, m1);

        System.out.println("Alumno: " + alumno.getNombre() + ", Curso: " + alumno.getCurso().getNombre());
        System.out.println("Curso tiene " + curso.calcularCreditos() + " créditos.");
        System.out.println("Sueldo semanal del profesor: $" + profesor.calcularSueldoSemanal());
    }
}