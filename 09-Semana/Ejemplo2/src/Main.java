import Area.Circulo;
import Funcion.Capturar;
import Funcion.Mostrar;

public class Main {
    public static void main(String[] args) {

        Mostrar mostrar = new Mostrar("Ejemplo de POO");
        Capturar capturar = new Capturar();

        /*mostrar.MostrarJOptionPane();
        String nombre = capturar.CapturarCadenaConsola("Digitar nombre: ");
        mostrar.setDato("\n"+nombre);
        mostrar.MostrarConsola();

        String producto = capturar.CapturarCadenaJOPtionPane("Digitar el nombre  del producto.");
        mostrar.setDato(producto);
        mostrar.MostrarJOptionPane();*/

        Double precio = capturar.CapturarDouble("Digite el valor del produto ");
        mostrar.setDato(precio.toString());
        mostrar.MostrarJOptionPane();

        Integer cantidad = capturar.CapturarInteger("Digite la cantidad");
        mostrar.setDato(cantidad.toString());
        mostrar.MostrarJOptionPane();

        Double radio = capturar.CapturarDouble("Digite el radio del círculo");
        Circulo circulo = new Circulo();
        circulo.setRadio(radio);
        mostrar.setDato(circulo.MostarArea().toString());
        mostrar.MostrarJOptionPane();

    }
}