package View;

import javax.swing.*;

public class Matriz3 {
    public static void main(String[] args) {
        //Definir cantidad
        int cantidad = 2;

        String[][] matriz = new String[cantidad][3];

        // Imprimir la matriz
        int i;
        int j;
        for (i = 0; i < matriz.length; i++) {
            matriz[i][0] = JOptionPane.showInputDialog(null,"Digite el nombre del estudiante "+(i+1)+":");
            matriz[i][1] = JOptionPane.showInputDialog(null,"Digite la nota de "+(matriz[i][0])+":");
        }

        //Validar si aprobó o desaprobó
        for (i = 0; i < matriz.length; i++) {
            Double df = Double.parseDouble(matriz[i][1]);
            if(df>=3.0){
                matriz[i][2]="Aprobó";
            }else{
                matriz[i][2]="Desaprobó";
            }
        }

        //Mostar resultado.
        System.out.printf("Resultados de los estudiantes. \n =========================\n");
        for (i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][0]+" "+matriz[i][1]+" "+matriz[i][2]);
        }
    }
}
