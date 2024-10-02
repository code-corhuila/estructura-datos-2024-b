package Funcion;

import javax.swing.*;

public class Mostrar {
    private String dato;

    public Mostrar(String dato) {
        this.dato = dato;
    }

    private String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public void MostrarConsola(){
        System.out.print(this.getDato());
    }

    public void MostrarJOptionPane(){
        JOptionPane.showMessageDialog(null, this.getDato());
    }
}
