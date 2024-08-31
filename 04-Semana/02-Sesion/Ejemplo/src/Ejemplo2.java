import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String arg[]) {
        //Genere un algoritmo que ordene ascendentemente dos números.
        //El programa debe validar que no se ingrese datos iguales.
        Scanner scanner = new Scanner(System.in);
        Integer n1;
        Integer n2;

        System.out.print("Digite el dato 1: ");
        n1 = scanner.nextInt();

        System.out.print("Digite el dato 2: ");
        n2 = scanner.nextInt();

        if(n1 != n2){
            if(n1<n2){
                System.out.printf(n1+", "+n2);
            }else{
                System.out.printf(n2+", "+n1);
            }
        }else{
            System.out.print("Error, deben ser datos diferentes.");
        }

    }
}
