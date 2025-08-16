package Actividad1;

public class Contacto {

    public String nombre;
    public int telefono;
    public String direccion;

    public Contacto() {
        this.nombre = "Default";
        this.telefono = 1111111111;
        this.direccion = "Default";
    }

    public Contacto(String nombre, int telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    @Override
    public String toString() {
        return "|" + "Nombre: " + nombre + "Telefono: " + telefono + "Dirección: " + direccion + "|";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Contacto))
            return false;
        Contacto c = (Contacto) obj;
        return this.nombre.equalsIgnoreCase(c.nombre) &&
                this.telefono == (c.telefono);
    }

}
