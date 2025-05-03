package org.uniquindio.edu.co.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Banco{
    // atributos
    private String nombre;
    private String nit;

    // comunicación con otras clases
    private List<Usuario> listUsuarios;
    private List<CuentaBancaria> listCuentasBancarias;


    // Constructor
    public Banco(String nombre, String nit){
        this.nombre = nombre;
        this.nit    = nit;
        this.listUsuarios         = new ArrayList<>();
        this.listCuentasBancarias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public List<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(List<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }

    public List<CuentaBancaria> getListCuentasBancarias() {
        return listCuentasBancarias;
    }

    public void setListCuentasBancarias(List<CuentaBancaria> listCuentasBancarias) {
        this.listCuentasBancarias = listCuentasBancarias;
    }

    @Override
    public String toString(){
        return "Banco: "                +
                "\n Nombre: "           + nombre       +
                "\n Nit: "              + nit          +
                "\n Lista de usarios: " + listUsuarios +
                "\n Lista de cuentas: " + listCuentasBancarias;
    }
}
