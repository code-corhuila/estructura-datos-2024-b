package Funcion;

import javax.swing.*;

public class Capturar {

    private static String CapturarDato(String mensaje){
        String dato;
        dato=JOptionPane.showInputDialog(mensaje);
        return dato;
    }

    public static Double CapturarNumero(String mensaje){
        Mostrar mostrar = new Mostrar();
        Double numero = 0.0;
        boolean error = false;
        do {
            try {
                numero = Double.parseDouble(CapturarDato(mensaje));
                error = true;
            }catch (Exception e){
                mostrar.MostrarMensajeJOption("Error, solo digitar números.");
            }
        }while (error==false);

        return numero;
    }

    public static String CapturarCadena(String mensaje){
        Mostrar mostrar = new Mostrar();
        return CapturarDato(mensaje);
    }
}
