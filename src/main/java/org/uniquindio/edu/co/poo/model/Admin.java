package org.uniquindio.edu.co.poo.model;

public class Admin extends Usuario{
    // atributos
    private String codigo;


    // Constructor
    public Admin(String nombre, Byte edad, String id, String codigo){
        super(nombre, edad, id);
        this.codigo = codigo;
    }

    @Override
    public String toString(){
        return "Admin: "         +
                super.toString() +
                "\n Codigo: " + codigo;
    }
}