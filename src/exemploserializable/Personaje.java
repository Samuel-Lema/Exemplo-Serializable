package exemploserializable;

import java.io.Serializable;

public class Personaje implements Serializable {
    
    private String nombre;
    private int vida;
    private int daño;

    public Personaje(String nombre, int vida, int daño) {
        this.nombre = nombre;
        this.vida = vida;
        this.daño = daño;
    }

    // Metodos de Acceso

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
    
    // To String

    @Override public String toString() {
        return "Personaje { " + "nombre: " + nombre + ", vida: " + vida + ", da\u00f1o: " + daño + " }";
    }
}
