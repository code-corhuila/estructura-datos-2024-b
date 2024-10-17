package Class;

public class Nota {
    private String nombre;
    private Double dfT; //25%
    private Double dfP; //70%
    private Double dfAC; //5%
    private Double df;

    public Nota() {
    }

    public Nota(String nombre, Double dfT, Double dfP, Double dfAC) {
        this.nombre = nombre;
        this.dfT = dfT;
        this.dfP = dfP;
        this.dfAC = dfAC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDfT() {
        return dfT;
    }

    public void setDfT(Double dfT) {
        this.dfT = dfT;
    }

    public Double getDfP() {
        return dfP;
    }

    public void setDfP(Double dfP) {
        this.dfP = dfP;
    }

    public Double getDfAC() {
        return dfAC;
    }

    public void setDfAC(Double dfAC) {
        this.dfAC = dfAC;
    }

    public Double getDf() {
        return df;
    }

    private void setDf(Double df) {
        this.df = df;
    }

    private void CalcularNota(){
        this.setDf((this.getDfT()*0.25)+(this.getDfP()*0.7)+(this.getDfAC()*0.05));
        //System.out.printf("Nota definitiva: "+String.format( "%.2f", this.getDf()));
    }

    @Override
    public String toString() {
        this.CalcularNota();
        return "Nota{" +
                "nombre='" + nombre + '\'' +
                ", dfT=" + dfT +
                ", dfP=" + dfP +
                ", dfAC=" + dfAC +
                ", df=" + String.format( "%.2f", this.getDf()) +
                '}';
    }
}
