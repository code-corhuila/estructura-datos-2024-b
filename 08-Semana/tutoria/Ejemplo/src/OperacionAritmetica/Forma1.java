package OperacionAritmetica;

import Funciones.Capturar;
import Funciones.Mostrar;

public class Forma1 {

    public static void main(String[] args) {
        Mostrar mostar = new Mostrar();
        Capturar capturar = new Capturar();

        mostar.MostrarMensaje("Hello world!");

        //Imprimir un saludo
        mostar.MostrarMensaje("Buenos días");

        //Capturar dos número
        double n1 = capturar.CapturarNumero("Ingrese el primer número");
        double n2 = capturar.CapturarNumero("Ingrese el segundo número");
        double resutarado = 0;

        //Realizar suma
        Suma suma = new Suma();
        suma.setNumero1(n1);
        suma.setNumero2(n2);
        resutarado = suma.MostrarResultado();
        mostar.MostrarMensaje("La suma de los número "+n1+" y "+n2+" es: "+resutarado);

        //Realizar resta
        Resta resta = new Resta();
        resta.setNumero1(n1);
        resta.setNumero2(n2);
        resutarado = resta.MostrarResultado();
        mostar.MostrarMensaje("La resta de los número "+n1+" y "+n2+" es: "+resutarado);

        //Realizar multiplicación
        Multiplicacion multiplicacion = new Multiplicacion();
        multiplicacion.setNumero1(n1);
        multiplicacion.setNumero2(n2);
        resutarado = multiplicacion.MostrarResultado();
        mostar.MostrarMensaje("La multiplicación de los número "+n1+" y "+n2+" es: "+resutarado);
    }
}
