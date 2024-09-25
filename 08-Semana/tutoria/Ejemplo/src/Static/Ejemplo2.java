package Static;

public class Ejemplo2 {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Imprimir un saludo
        MostrarMensaje("Buenos días");

        //Imprimir la suma de dos números
        int n1 = 5;
        int n2 = 10;
        int suma = n1 + n2;
        MostrarMensaje("La suma de los número "+n1+" y "+n2+" es: "+suma);
    }

    public static void MostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}