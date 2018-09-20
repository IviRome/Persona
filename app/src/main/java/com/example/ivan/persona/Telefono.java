package com.example.ivan.persona;

import java.util.ArrayList;

public class Telefono {
    private int numero;
    private String descripcion;

    public Telefono(String des, int num){
        this.numero=num;
        this.descripcion=des;
    }

    public int GetNumero (){
        return numero;
    }

    public String GetDescripcion (){
        return descripcion;
    }

    public void Set(int num, String des){
        this.numero=num;
        this.descripcion=des;
    }
}
