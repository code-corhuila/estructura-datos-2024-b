package Model;

public class CarritoCompra {

    private String cliente;
    private String producto;
    private int cantidad;
    private Double valorUnitario;
    private Double porcentajeDescuento;
    private Double valorDescuento;
    private Double totalPagar;

    public CarritoCompra() {
    }

    public CarritoCompra(String cliente, String producto, int cantidad, Double valorUnitario, Double porcentajeDescuento) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Double getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(Double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public Double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(Double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public void ObtenarFactura(){
        //Calcular valor del descuento
        Double pd = this.getPorcentajeDescuento()/100; //Porcentaje descuento en decimal
        Double tpb = this.getValorUnitario()*this.getCantidad(); //Total pagar bruto
        this.setValorDescuento(tpb*pd); // Valor del decuento.
        this.setTotalPagar(tpb-this.getValorDescuento()); // Calcular el descuento.

    }

    @Override
    public String toString() {
        return "Factura de Carrito de Compra:" +
                "\nCliente: " + cliente +
                "\nProducto: " + producto +
                "\nCantidad: " + cantidad +
                "\nValor Unitario: " + valorUnitario +
                "\nPorcentaje de Descuento: " + porcentajeDescuento + "%" +
                "\nValor Descuento: " + valorDescuento +
                "\nTotal a Pagar: " + totalPagar +
                "\n";
    }
}
