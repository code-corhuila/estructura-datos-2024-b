
______________ Funcion;

______________ ______________.swing.*;

public class Capturar {

    private static String ______________(String ______________){
        ______________ dato;
        ______________=JOptionPane.showInputDialog(mensaje);
        return ______________;
    }

    public ______________ Double CapturarNumero(String mensaje){
        Mostrar mostrar = new Mostrar();
        Double numero = 0.0;
        boolean error = false;
        do {
            try {
                numero = ______________.parseDouble(CapturarDato(______________));
                error = true;
            }catch (Exception e){
                ______________.MostrarMensajeJOption("Error, solo digitar ______________.");
            }
        }while (error==false);

        return numero;
    }

    public static String CapturarCadena(String mensaje){
        Mostrar mostrar = ______________ Mostrar();
        return CapturarDato(mensaje);
    }
}  

package Funcion;

import javax.______________.*;

public class Mostrar {

    public static void MostrarMensajeConsola(String mensaje){
        System.out.println(mensaje);
    }
    public static void MostrarMensajeJOption(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static ______________ MostrarConfirmacion(String ______________) {
        int opcion = JOptionPane.showConfirmDialog(______________, mensaje, "Confirmación", JOptionPane.______________);
        return opcion;
    }
}

package Tienda;

import Funcion.Mostrar;

public class Venta {
    private String nombreCliente;
    private String producto;
    private Double ______________;
    private ______________ cantidad;
    private double totalPagar;

    ______________ Venta(String nombreCliente, String producto, Double precio, ______________ cantidad) {
        this.nombreCliente = nombreCliente;
        this.producto = producto;
        this.precio = precio;
        this.______________ = cantidad;
    }

    public ______________ getNombreCliente() {
        return nombreCliente;
    }

    public void ______________(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getProducto() {
        return producto;
    }

    public void ______________(String producto) {
        this.producto = ______________;
    }

    ______________ Double ______________() {
        return ______________;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return ______________;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        ______________.totalPagar = totalPagar;
    }

    private void TotalPagar(){
        this.setTotalPagar(this.getCantidad()*this.getPrecio());
    }

    ______________ void ImprimirFactura(){
        Mostrar mostrar = new Mostrar();
        String factura = "********** ______________ **********\n" +
                "______________: " + this.______________() + "\n" +
                "Producto: " + this.getProducto() + "\n" +
                "Cantidad: " + this.getCantidad() + "\______________" +
                "Precio unitario: $" + String.format("%.2f", this.getPrecio()) + "\n" +
                "Total a pagar: $" + String.______________("%.2f", this.getTotalPagar()) + "\n" +
                "****************************\n";

        mostrar.MostrarConfirmacion("Confirmar");
        mostrar.MostrarMensajeConsola(______________);
    }
}

import Funcion.Capturar;
______________ Funcion.Mostrar;
import ______________.Venta;

public class Ejecutar {
    public static void main(String[] args) {

        Mostrar mostrar = new Mostrar();
        Capturar capturar = new Capturar();

        ______________ nombreCliente = "";
        String producto = "";
        Double precio = 0.0;
        Integer cantidad = 0;

        nombreCliente = Capturar.CapturarCadena("Digite su nombre: ");
        producto = ______________.CapturarCadena("Digite el nombre del producto: ");
        precio = Capturar.______________("Digite el precio unitario "+producto+": ");
        cantidad = Capturar.______________("Digite la ______________  "+producto+" a comprar: ").______________();

        Venta ______________ = new Venta(nombreCliente,producto,precio,cantidad);
        ______________.ImprimirFactura();
    }
}
