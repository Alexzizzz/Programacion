package com.mycompany.actividad2_parte2;
public class Actividad2_parte2 {
    public static void main(String[] args) {
        int tamaño = 50; 
        int[] numerosPares = new int[tamaño];
        
        int numero = 2;
        for (int i = 0; i < tamaño; i++) {
            numerosPares[i] = numero;
            numero += 2;
        }
        
        for (int i = 0; i < tamaño; i++) {
            System.out.println(numerosPares[i]);
        }
    }
}