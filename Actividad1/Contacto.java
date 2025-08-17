/** * Autor: Melissa Yaretzi Hernández Flores
 * * Fecha: 16/08/2025 
 * * Descripción: La clase contacto sirve para guardar la informacion de los contactos, es decir lo que debe llevar 
 * el contacto como nombre, direccion y telefono
 * **/
package Actividad1;

public class Contacto {

    public String NOMBRE;
    public int TELEFONO;
    public String DIRECCION;

    public Contacto() {
        this.NOMBRE = "Default";
        this.TELEFONO = 111111111;
        this.DIRECCION = "Default";
    }

    public Contacto(String NOMBRE, int TELEFONO, String DIRECCION) {
        this.NOMBRE = NOMBRE;
        this.TELEFONO = TELEFONO;
        this.DIRECCION = DIRECCION;
    }

    public void setNombre(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public void setTelefono(int TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public void setDireccion(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getNombre() {
        return this.NOMBRE;
    }

    public int getTelefono() {
        return this.TELEFONO;
    }

    public String getDireccion() {
        return this.DIRECCION;
    }

    @Override
    public String toString() {
        return "|" + "Nombre: " + NOMBRE + ", Telefono: " + TELEFONO + ", Dirección: " + DIRECCION + "|";
    }

    public boolean equals(String NOMBRE) {
        return this.NOMBRE.equalsIgnoreCase(NOMBRE);
    }

}
