package com.example.ivan.persona;

import java.util.ArrayList;

public class Principal {
    public static void main(String args[]){
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona(53886305, "Ivan", "Romero"));

        personas.get(0).anyadir(new Telefono("Movil", 722756498));
        personas.get(0).anyadir(new Telefono("Casa", 961432390));

        Persona p = buscar(personas, "Ivan");
        p.mostrarTelefono();
    }
    public static Persona buscar(ArrayList<Persona> personas, String nombre){
        for(int i = 0; i<=personas.size(); i++){
            if(nombre.equals(personas.get(i).getNombre())){
                return personas.get(i);
            }
        }
        //En el caso de que no hubiera ninguna persona con ese nombre:
        return null;
    }
}
