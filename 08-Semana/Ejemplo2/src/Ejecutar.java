import Funcion.Capturar;
import Funcion.Mostrar;
import Tienda.Venta;
public class Ejecutar {
    public static void main(String[] args) {

        Mostrar mostrar = new Mostrar();
        Capturar capturar = new Capturar();

        String nombreCliente = "";
        String producto = "";
        Double precio = 0.0;
        Integer cantidad = 0;

        nombreCliente = Capturar.CapturarCadena("Digite su nombre: ");
        producto = capturar.CapturarCadena("Digite el nombre del producto: ");
        precio = capturar.CapturarNumero("Digite el precio unitario "+producto+": ");
        cantidad = capturar.CapturarNumero("Digite la cantidad  "+producto+" a comprar: ").intValue();

        Venta venta = new Venta(nombreCliente,producto,precio,cantidad);
        venta.ImprimirFactura();
    }
}