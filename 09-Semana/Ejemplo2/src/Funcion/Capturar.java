package Funcion;

import javax.swing.*;
import java.util.Scanner;

public class Capturar {
    private  String dato;

    private String getDato() {
        return dato;
    }

    private void setDato(String dato) {
        this.dato = dato;
    }

    private void LlenarDato(String dato){
        this.setDato(dato);
    }

    private void CapturarConsola(String mensaje){
        Scanner scanner = new Scanner(System.in);
        Mostrar mostrar = new Mostrar(mensaje);
        mostrar.MostrarConsola();
        this.LlenarDato(scanner.next());
    }

    private void CapturarJOptionPane(String mensaje){
        this.LlenarDato(JOptionPane.showInputDialog(null,mensaje));
    }

    public String CapturarCadenaConsola(String mensaje){
        this.CapturarConsola(mensaje);
        return this.getDato();
    }

    public String CapturarCadenaJOPtionPane(String mensaje){
        this.CapturarJOptionPane(mensaje);
        return this.getDato();
    }

    public Double CapturarDouble(String mensaje){
        Double numero = 0.0;
        Boolean bandera = false;
        do {
            try {
                numero = Double.valueOf(this.CapturarCadenaJOPtionPane(mensaje));
                bandera = true;
            }catch (Exception e){
                Mostrar mostrar = new Mostrar("Error, dato no válido.");
                mostrar.MostrarJOptionPane();
            }
        }while(bandera == false);
        return  numero;
    }

    public Integer CapturarInteger(String mensaje){
        Integer numero = 0;
        numero = CapturarDouble(mensaje).intValue();
        return  numero;
    }

}
