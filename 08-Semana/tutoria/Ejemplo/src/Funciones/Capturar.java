package Funciones;

import javax.swing.*;

public class Capturar {

    public static int CapturarNumeroJOption(String mensaje){
        int numero = 0;
        numero=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return numero;
    }

    public static int CapturarNumero(String mensaje){
        Mostrar mostrar = new Mostrar();
        int numero = 0;
        boolean error = false;
        do{
            try{
                numero = CapturarNumeroJOption(mensaje);
                error = true;
            }catch(NumberFormatException e){
                mostrar.MostrarMensajeJOption("Error, el valor ingresado no es un número");
            }
        }while(error == false);

        return numero;
    }
}
