package OperacionAritmetica2;

public abstract class Operacion {
    private double numero1;
    private double numero2;
    private double resultado;

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    public double getNumero1(){
        return this.numero1;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    public double getNumero2(){
        return this.numero2;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public double getResultado(){
        return this.resultado;
    }

    public void MostrarResultado(double n1, double n2){

    }
}
