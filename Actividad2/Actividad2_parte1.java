package com.mycompany.actividad2;
import java.util.Scanner;

public class Actividad2_parte1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su usuario: ");
        String nombreIngresado = scanner.nextLine().trim();
        
        String nombreReferencia = "Bruce Wayne";
        
        if (nombreIngresado.equalsIgnoreCase(nombreReferencia)) {
            System.out.println("¡Buen dia Sr, " + nombreIngresado + "! Bienvenido a la baticueva.");
        } else {
            System.out.println("El usuario " + nombreIngresado + ". No esta autorizado.");
        }
        
        scanner.close();
    }
}


