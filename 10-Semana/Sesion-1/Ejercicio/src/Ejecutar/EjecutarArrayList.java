package Ejecutar;

import java.util.ArrayList;
import  Class.Persona;

public class EjecutarArrayList {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Carlos", "Pérez", 25));
        listaPersonas.add(new Persona("Ana", "Gómez", 30));
        for (Persona persona : listaPersonas) {
            System.out.println(persona.toString());
        }
    }
}