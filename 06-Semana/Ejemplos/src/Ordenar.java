import java.util.Scanner;

public class Ordenar {
    public static void  main(String[] arg){
        //Ordenar ascendentemente tres números.
        //Regla: Si hay dos o más números iguales,
        // imprimir error

        Sumar sumar = new Sumar();
        System.out.println(sumar.Mensaje());

        //Definir variables
        Integer n1;
        Integer n2;
        Integer n3;
        Integer nMayor = 0;
        Integer nMenor = 0;
        Integer nMedio = 0;

        //Capturar datos
        n1 = Capturar("Digite el número 1: ");
        n2 = Capturar("Digite el número 2: ");
        n3 = Capturar("Digite el número 3: ");

        //Validar repetidos
        if(n1==n2 || n1==n3 || n2==n3){
            System.out.println("Ha ingresado un dato no válido");
        }else{
            //Ordenar datos

            //Mayor
            if(n1>n2 && n1>n3){
                nMayor = n1;
            }

            if(n2>n1 && n2>n3){
                nMayor = n2;
            }

            if(n3>n1 && n3>n2){
                nMayor = n3;
            }

            //Menor
            if(n1<n2 && n1<n3){
                nMenor = n1;
            }

            if(n2<n1 && n2<n3){
                nMenor = n2;
            }

            if(n3<n1 && n3<n2){
                nMenor = n3;
            }

            //Intermedio

            //Resultado


            System.out.println("Número menor: "+nMenor);
            System.out.println("Número medio: "+nMedio);
            System.out.println("Número mayor: "+nMayor);
        }
    }

    public static Integer Capturar(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        Integer numero = scanner.nextInt();
        return numero;
    }
}
