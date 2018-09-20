package com.example.ivan.persona;

import java.util.ArrayList;

public class Persona {
    private int dni;
    private String nombre="";
    private String apellido="";
    private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();

    public Persona(int dni , String nom, String ape){
        this.dni= dni;
        this.nombre=nom;
        this.apellido=ape;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public int getDni(){
        return this.dni;
    }

    public void anyadir(Telefono tel){
        this.telefonos.add(tel);
    }

    public void mostrarTelefono(){
        for(int i = 0; i<=this.telefonos.size(); i++){
            System.out.println("Descripcion: "+this.telefonos.get(i).GetDescripcion()+"Número: "+this.telefonos.get(i).GetNumero());
        }
    }

}
