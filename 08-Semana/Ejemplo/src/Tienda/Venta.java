package Tienda;

import Funcion.Mostrar;

public class Venta {
    private String nombreCliente;
    private String producto;
    private Double precio;
    private int cantidad;
    private double totalPagar;

    public Venta(String nombreCliente, String producto, Double precio, int cantidad) {
        this.nombreCliente = nombreCliente;
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    private void TotalPagar(){
        this.setTotalPagar(this.getCantidad()*this.getPrecio());
    }

    public void ImprimirFactura(){
        Mostrar mostrar = new Mostrar();
        String factura = "********** FACTURA **********\n" +
                "Cliente: " + this.getNombreCliente() + "\n" +
                "Producto: " + this.getProducto() + "\n" +
                "Cantidad: " + this.getCantidad() + "\n" +
                "Precio unitario: $" + String.format("%.2f", this.getPrecio()) + "\n" +
                "Total a pagar: $" + String.format("%.2f", this.getTotalPagar()) + "\n" +
                "****************************\n";

        mostrar.MostrarConfirmacion("Confirmar");
        mostrar.MostrarMensajeConsola(factura);
    }
}