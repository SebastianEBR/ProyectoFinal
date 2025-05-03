package org.uniquindio.edu.co.poo.model;

public abstract class Usuario{
    // atributos
    private String nombre;
    private byte edad;
    private String id;


    // Constructor
    public Usuario(String nombre, Byte edad, String id){
        this.nombre = nombre;
        this.edad   = edad;
        this.id     = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "\n"           +
                "\n Nombre: " + nombre +
                "\n Nit: "    + edad    +
                "\n ID: "     + id;

    }
}