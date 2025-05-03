package org.uniquindio.edu.co.poo.model;

public class Cajero extends Usuario{
    // atributos
    private String codigo;


    // Constructor
    public Cajero(String nombre, Byte edad, String id, String codigo){
        super(nombre, edad, id);
        this.codigo = codigo;
    }

    @Override
    public String toString(){
        return "Cajero: "        +
                super.toString() +
                "\n Codigo: " + codigo;
    }
}