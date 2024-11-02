package View;

import Entity.ObjectObject;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //ObjectObject objeto = new ObjectObject("Pedro",3.0,"pedro@prueba.com");
        //objeto.Mostar();

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digitar la cantidad de estudiantes del grupo: "));
        ObjectObject[] estructuraDatos = new ObjectObject[cantidad];

        //Llenada data
        int i;
        for(i=0;i<estructuraDatos.length;i++){
            estructuraDatos[i] = new ObjectObject();
            estructuraDatos[i].setNombre(JOptionPane.showInputDialog("Digita en nombre del estudiantes "+(i+1)+": "));
            estructuraDatos[i].setCorreo(JOptionPane.showInputDialog("Digita el corre de "+(estructuraDatos[i].getNombre())+": "));
            estructuraDatos[i].setNota(Double.parseDouble(JOptionPane.showInputDialog("Digita la nota de "+(estructuraDatos[i].getNombre())+": ")));
            estructuraDatos[i].CalcularNota();
        }

        //Solo mostrar la data
        for(i=0;i<estructuraDatos.length;i++){
            System.out.println(
                            estructuraDatos[i].getNombre()+": "+
                            estructuraDatos[i].getNota()
            );;
        }
    }
}