package modelo;

public class Usuario {
    private int id;
    private String nombre;
    private String correo;
    private String puesto;
    private String contraseña;

    public Usuario(int id, String nombre, String correo, String puesto, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.puesto = puesto;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }
}