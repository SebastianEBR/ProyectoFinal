package org.uniquindio.edu.co.poo.model;

public class Cliente extends Usuario{
    // atributos
    private String codigo;

    // comunicación con otras clases
    private TipoCuenta tipoCuenta;
    private CuentaBancaria cuentaBancaria;


    // Constructor
    public Cliente(String nombre, Byte edad, String id, String codigo){
        super(nombre, edad, id);
        this.codigo = codigo;
    }

    @Override
    public String toString(){
        return "Client: "        +
                super.toString() +
                "\n Codigo: " + codigo;
    }
}
