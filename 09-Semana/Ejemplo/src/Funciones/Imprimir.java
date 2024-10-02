package Funciones;

import javax.swing.*;

public class Imprimir {

    private String mensaje;

    private String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void  ImprimirConsola(){
        System.out.println(this.getMensaje());
    }

    public void  ImprimirJOPtionPane(){
        JOptionPane.showMessageDialog(null, this.getMensaje());
    }
}
