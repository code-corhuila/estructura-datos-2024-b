package View;

public class Ejemplo1 {
    public static void main(String[] args) {
        int i;
        int j;
        int A[] = new int[50];

        //Llnenar el vector
        for(i=0; i<A.length; i++){
            A[i] = i;
        }

        //Recorrer la data del vecto.
        String data = "A:[";
        int control=0;
        for(j=0;j<(A.length/10);j++){
            data+="\n";
            for(i=control;i<(control+10);i++){
                data+=i+", ";
            }
            control+=10;
        }
        data = data.substring(0, data.length() - 2);
        data+="]";

        //Imprimir salida
        System.out.printf(data);

        // Sumatoria
        int acumulador = 0;
        for(i=0;i<A.length;i++){
            acumulador+=A[i];
        }

        System.out.printf("\n El valor acumulado de los dígitos es: "+acumulador);

    }
}