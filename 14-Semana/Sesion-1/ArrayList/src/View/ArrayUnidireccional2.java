package View;

import javax.swing.*;

public class ArrayUnidireccional2 {
    public static void main(String[] args) {
        //Definir cantidad.
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantida de estidantes."));

        //Crear tamaño de los vectores
        String[] nombre = new String[cantidad];
        Double[] nota = new Double[cantidad];
        String[] correo = new String[cantidad];

        //Capturar datos
        int i;
        for(i=0;i<cantidad;i++){
            nombre[i] = JOptionPane.showInputDialog(null,"Digite el nombre para el estudiante "+(i+1));
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la nota para  "+(nombre[i])));
            correo[i] = JOptionPane.showInputDialog(null,"Digite el correo de "+(nombre[i]));
        }

        //Recorrer datos.
        String separador = "\n ============================\n";
        for(i = 0;i<cantidad;i++){
            System.out.println(separador+"Nombre:"+nombre[i]+"\n Nota: "+nota[i]+"\n Correo: "+correo[i]);
        }
    }
}
