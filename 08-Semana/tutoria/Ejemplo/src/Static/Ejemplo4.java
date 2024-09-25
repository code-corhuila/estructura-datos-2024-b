package Static;

import javax.swing.*;

public class Ejemplo4 {
   public static void main(String[] args) {

        MostrarMensaje("Hello world!");

        //Imprimir un saludo
        MostrarMensaje("Buenos días");

        //Capturar dos número
        int n1 = CapturarNumero("Ingrese el primer número");
        int n2 = CapturarNumero("Ingrese el segundo número");
        int resutarado = 0;

        //Realizar suma        
        resutarado = Sumar(n1, n2);
        MostrarMensaje("La suma de los número "+n1+" y "+n2+" es: "+resutarado);

        //Realizar resta
        resutarado = Restar(n1, n2);
        MostrarMensaje("La resta de los número "+n1+" y "+n2+" es: "+resutarado);

        //Realizar multiplicación
        resutarado = Multiplicar(n1, n2);
        MostrarMensaje("La multiplicación de los número "+n1+" y "+n2+" es: "+resutarado);
    }

    public static void MostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public static void MostrarMensajeJOption(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static int CapturarNumeroJOption(String mensaje){
        int numero = 0;
        numero=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return numero;
    }

    public static int CapturarNumero(String mensaje){
        int numero = 0;
        boolean error = false;
        do{
            try{
                numero = CapturarNumeroJOption(mensaje);
                error = true;
            }catch(NumberFormatException e){
                MostrarMensajeJOption("Error, el valor ingresado no es un número");
            }
        }while(error == false);

        return numero;
    }

    public static int Sumar(int n1, int n2){
        int numero = 0;
        numero = n1 + n2;
        return numero;
    }

    public static int Restar(int n1, int n2){
        int numero = 0;
        numero = n1 - n2;
        return numero;
    }

    public static int Multiplicar(int n1, int n2){
        int numero = 0;
        numero = n1 * n2;
        return numero;
    }

    public static int Dividir(int n1, int n2){
        int numero = 0;
        numero = n1 / n2;
        return numero;
    }
}