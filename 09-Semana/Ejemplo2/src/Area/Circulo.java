package Area;

public class Circulo {
    private Double radio;
    private Double area;

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double MostarArea(){
        this.setArea(Math.PI*(Math.pow(this.getRadio(),2)));
        return  this.getArea();
    }
}
