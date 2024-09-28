package Funcion;
import javax.swing.*;
public class Mostrar {

    public static void MostrarMensajeConsola(String mensaje){
        System.out.println(mensaje);
    }
    public static void MostrarMensajeJOption(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static int MostrarConfirmacion(String mensaje) {
        int opcion = JOptionPane.showConfirmDialog(null, mensaje, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        return opcion;
    }
}
