package View;

import Entity.Persona;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Predro");
        persona.setEdad((byte) 20);

        ArrayList<Persona> listaPersona = new ArrayList<>();
        listaPersona.add(persona);

        for (int i=0; i< listaPersona.size();i++ ){
            System.out.printf("\n"+listaPersona.get(i).getNombre());
            System.out.printf("\n"+String.valueOf(listaPersona.get(i).getEdad()));
        }
        /*for(Persona persona1: listaPersona){
            System.out.printf(persona1.toString());
        }*/

    }
}