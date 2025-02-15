
package com.mycompany.producto;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear dos objetos de Producto
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();

        // Solicitar datos para el primer producto
        System.out.println("Ingrese los datos del primer producto:");
        try {
            System.out.print("Descripción: ");
            producto1.setDescripcion(sc.nextLine());

            System.out.print("Código: ");
            producto1.setCodigo(sc.nextLine());

            System.out.print("Tipo: ");
            producto1.setTipo(sc.nextLine());

            System.out.print("Costo: ");
            producto1.setCosto(sc.nextDouble());

            System.out.print("Impuesto (%): ");
            producto1.setImpuesto(sc.nextDouble());
            sc.nextLine(); // Limpiar buffer
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida.");
            return;
        }

        // Solicitar datos para el segundo producto
        System.out.println("\nIngrese los datos del segundo producto:");
        try {
            System.out.print("Descripción: ");
            producto2.setDescripcion(sc.nextLine());

            System.out.print("Código: ");
            producto2.setCodigo(sc.nextLine());

            System.out.print("Tipo: ");
            producto2.setTipo(sc.nextLine());

            System.out.print("Costo: ");
            producto2.setCosto(sc.nextDouble());

            System.out.print("Impuesto (%): ");
            producto2.setImpuesto(sc.nextDouble());
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida.");
            return;
        }

        // Mostrar datos de los productos
        System.out.println("\nDatos del primer producto:");
        producto1.muestraProducto();

        System.out.println("\nDatos del segundo producto:");
        producto2.muestraProducto();

        // Comparar precios de venta
        System.out.print("\nIngrese el porcentaje de utilidad: ");
        double utilidad = sc.nextDouble();
        String resultado = compararProductos(producto1, producto2, utilidad);

        // Mostrar resultado de la comparación
        System.out.println("\nProducto con mayor precio de venta: " + resultado);
    }

    // Método estático compararProductos
    public static String compararProductos(Producto p1, Producto p2, double utilidad) {
        double precio1 = p1.calcularPrecio(utilidad);
        double precio2 = p2.calcularPrecio(utilidad);

        if (precio1 > precio2) {
            return p1.getDescripcion();
        } else if (precio2 > precio1) {
            return p2.getDescripcion();
        } else {
            return "Ambos productos tienen el mismo precio de venta.";
        }
    }
}
