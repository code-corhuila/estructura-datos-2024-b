package Static;

import javax.swing.*;

public class Ejemplo3 {
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

    public static int CapturarNumero(String mensaje){
        int numero = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

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