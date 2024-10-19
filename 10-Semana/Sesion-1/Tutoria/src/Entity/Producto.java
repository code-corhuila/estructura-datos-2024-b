package Entity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Producto {
    private String nombre;
    private BigDecimal valorUnitario;
    private int cantidad;
    private BigDecimal valorPagar;

    public Producto() {
    }

    public Producto(String nombre, BigDecimal valorUnitario, int cantidad) {
        this.nombre = nombre;
        this.valorUnitario = valorUnitario;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValorPagar() {
        return valorPagar;
    }

    private void setValorPagar(BigDecimal valorPagar) {
        this.valorPagar = valorPagar;
    }

    public void CalcularValorPagar(){
        BigDecimal total = this.getValorUnitario().multiply(BigDecimal.valueOf(this.getCantidad()));
        this.setValorPagar(total.setScale(1, RoundingMode.HALF_UP));
    }

    @Override
    public String toString() {
        this.CalcularValorPagar();
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", valorUnitario=" + valorUnitario +
                ", cantidad=" + cantidad +
                ", valorPagar=" + valorPagar +
                '}';
    }
}
