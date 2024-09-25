package OperacionAritmetica2;


import Funciones.Capturar;
import Funciones.Mostrar;

public class Forma2 {

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
        OperacionAritmetica2.Suma suma = new Suma();
        suma.MostrarResultado(n1,n2);

        // Suma 2
        suma.MostrarResultado(2,9);
        suma.MostrarResultado(12,-5);
        suma.MostrarResultado(2.5,1.4);


        //Realizar resta
        OperacionAritmetica2.Resta resta = new Resta();
        resta.MostrarResultado(n1,n2);

        //Realizar multiplicación
        OperacionAritmetica2.Multiplicacion multiplicacion = new Multiplicacion();
        multiplicacion.MostrarResultado(n1,n2);
    }
}
