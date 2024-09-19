package Datos;

import javax.swing.*;

public class Calificacion {
    private Double nota;
    private String mensaje;

    public Double CapturarNota(String mensaje, String mensajeOk, String mensajeError){
        Double x = 0.0;

        do {
            x = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
            if (x<0 || x>5){
                JOptionPane.showMessageDialog(null, mensajeError);
            }else{
                JOptionPane.showMessageDialog(null, mensajeOk);
            }
        }while (x<0 || x>5);

        return x;
    }

    public void MostarNota(Double parcial, Double trabajo, Double certi, Double autoCoe){
        this.nota  = (parcial*0.7)+(trabajo*0.15)+(certi*0.1)+(autoCoe*0.05);
        JOptionPane.showMessageDialog(null,"La nota definitiva es: "+this.nota);
    }
}
