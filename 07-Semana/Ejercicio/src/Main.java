import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double parcial;
        Double trabajo;
        Double certificacion;
        Double autoCoe;
        Double notaDF;
        Boolean bandera;

        //Llenar variables
        parcial = CapturarNumero("Digite la nota del parcial: ");
        trabajo = CapturarNumero("Digite la nota promedio de los trabajos: ");
        certificacion = CapturarNumero("Digite la nota de la certificación: ");
        autoCoe = CapturarNumero("Digite la nota de la auto y coe: ");

        //Verificar
        bandera = Validar(parcial);
        System.out.println(bandera);

        bandera = Validar(trabajo);
        System.out.println(bandera);


        //Proceso
        notaDF = (parcial*0.7)+(trabajo*0.15)+(certificacion*0.1)+(autoCoe*0.05);
        System.out.println("la nota fue: "+notaDF);
    }


    public static Double CapturarNumero(String mensaje){
        Scanner x = new Scanner(System.in);
        Double numero;

        System.out.print(mensaje);
        numero = x.nextDouble();

        return numero;
    }

    public static Boolean Validar(Double x){
        Boolean bandera = true;
        if(x>=0.0 && x<=5.0){
            bandera = true;
        }else {
            bandera = false;
        }
        return bandera;
    }

}