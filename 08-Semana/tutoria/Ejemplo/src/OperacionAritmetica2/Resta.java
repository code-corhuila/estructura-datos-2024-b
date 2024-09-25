package OperacionAritmetica2;

import Funciones.Mostrar;

public class Resta extends Operacion {
    @Override
    public void MostrarResultado(double n1, double n2){
        Mostrar mostar = new Mostrar();
        this.setNumero1(n1);
        this.setNumero2(n2);
        this.setResultado(this.getNumero1()-this.getNumero2());

        mostar.MostrarMensaje("La resta de los número "+getNumero1()+" y "+getNumero2()+" es: "+getResultado());
    }
}
