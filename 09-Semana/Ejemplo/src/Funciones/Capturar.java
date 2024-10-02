package Funciones;

import javax.swing.*;

public class Capturar {
    private String dato;

    Imprimir imprimir = new Imprimir();

    private String getDato() {
        return dato;
    }
    private void setDato(String dato) {
        this.dato = dato;
    }

    private String Capturar(String mensaje){
        this.setDato(JOptionPane.showInputDialog(null,mensaje));
        return  this.getDato();
    }

    public String CapturarString(String mensaje){
        String cadena = "";
        cadena = this.Capturar(mensaje);
        return  cadena;
    }

    public Double CapturarDouble(String mensaje){
        Double numero = 0.0;
        Boolean bandera = false;
        do {
            try {
                numero = Double.valueOf(this.Capturar(mensaje));
                bandera = true;
            }catch (Exception e){
                imprimir.setMensaje("Error, dato no válido");
                imprimir.ImprimirJOPtionPane();

            }
        }while (bandera == false);
        return numero;
    }

    public Integer CapturarInteger(String mensaje){
        Integer numero = 0;
        numero = CapturarDouble(mensaje).intValue();
        return numero;
    }
}
