
package com.mycompany.producto;
public class Producto {
    // Atributos privados
    private String descripcion;
    private String codigo;
    private String tipo;
    private Double costo;
    private Double impuesto;

    // Constructor vacío
    public Producto() {}

    // Métodos get
    public String getDescripcion() {
        return descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getCosto() {
        return costo;
    }

    public Double getImpuesto() {
        return impuesto;
    }

    // Métodos set
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }

    // Método muestraProducto
    public void muestraProducto() {
        System.out.println("Descripción: " + descripcion);
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo: $" + costo);
        System.out.println("Impuesto: " + impuesto + "%");
    }

    // Método calcularPrecio
    public double calcularPrecio(double utilidad) {
        double precioAntesImpuesto = costo + (costo * utilidad / 100);
        double precioFinal = precioAntesImpuesto + (precioAntesImpuesto * impuesto / 100);
        return precioFinal;
    }
}