package Ejecutar;
import  Class.Nota;

import javax.swing.*;

public class EjecutarNota {
    public static void main(String[] arg){
        int i = 0;

        Nota[] notas = new Nota[4];
        for (i=0;i< notas.length;i++){
            notas[i] = new Nota();
            notas[i].setNombre(Capturar("Digitar nombre: "));
            notas[i].setDfT(Double.parseDouble(Capturar("Digitar ponderación de trabajos: ")));
            notas[i].setDfP(Double.parseDouble(Capturar("Digitar ponderación de parcial: ")));
            notas[i].setDfAC(Double.parseDouble(Capturar("Digitar ponderación de auto-coe: ")));
        }

        for (i=0;i< notas.length;i++){
            System.out.printf(notas[i].toString()+"\n");
        }
    }

    public static String Capturar(String mensaje){
        String data = JOptionPane.showInputDialog(null,mensaje);
        return data;
    }
}
