package Funciones;

import javax.swing.*;

public class Mostrar {


    public static void MostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public static void MostrarMensajeJOption(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
