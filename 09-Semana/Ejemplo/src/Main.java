import Area.Cuadrado;
import Funciones.Capturar;
import Funciones.Imprimir;

public class Main {
    public static void main(String[] args) {

        Capturar capturar = new Capturar();

        String nombreEstudiante = capturar.CapturarString("Digite nombre del estudiante: ");
        Double precio = capturar.CapturarDouble("Digite el precio: ");
        Integer edad = capturar.CapturarInteger("Digite su edad: ");

        Imprimir imprimir = new Imprimir();
        imprimir.setMensaje(nombreEstudiante);
        imprimir.ImprimirConsola();

        imprimir.setMensaje(precio.toString());
        imprimir.ImprimirConsola();

        imprimir.setMensaje(edad.toString());
        imprimir.ImprimirJOPtionPane();

        Double lado = capturar.CapturarDouble("Digite la medida de un lado del cuadrado a analizar: ");
        Cuadrado cuadrado = new Cuadrado(lado);
        cuadrado.MostarArea();

    }
}