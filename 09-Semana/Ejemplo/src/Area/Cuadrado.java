package Area;

import Funciones.Imprimir;

public class Cuadrado {
    private  Double lado;
    private  Double area;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    private Double getLado() {
        return lado;
    }

    private void setLado(Double lado) {
        this.lado = lado;
    }

    private Double getArea() {
        return area;
    }

    private void setArea(Double area) {
        this.area = area;
    }

    public void  MostarArea(){
        Imprimir imprimir = new Imprimir();

        //Operación lógica
        this.setArea(this.getLado()*this.getLado());

        imprimir.setMensaje("El área de un cuadrado con medida de lado "+this.getLado()+" es de "+this.getArea());
        imprimir.ImprimirJOPtionPane();
        imprimir.ImprimirConsola();
    }


}
