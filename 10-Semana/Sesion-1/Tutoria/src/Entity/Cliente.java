package Entity;

import java.math.BigDecimal;

public class Cliente {
    private String nombre;
    private String correo;
    private BigDecimal totalPagar;

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public BigDecimal getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(BigDecimal totalPagar) {
        this.totalPagar = totalPagar;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", totalPagar=" + totalPagar +
                '}';
    }
}
