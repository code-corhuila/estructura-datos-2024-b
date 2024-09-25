package OperacionAritmetica;

public class Multiplicacion extends Operacion {
    @Override
    public double MostrarResultado(){
        this.setResultado(this.getNumero1()*this.getNumero2());
        return  this.getResultado();
    }
}
