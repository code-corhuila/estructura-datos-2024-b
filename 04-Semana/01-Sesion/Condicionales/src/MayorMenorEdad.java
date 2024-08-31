import java.util.Scanner;

public class MayorMenorEdad {

    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ejercicio 1: ");

        String nombre;
        int edad;

        //Captura de datos
        System.out.print("Digite su nombre: ");
        nombre = scanner.next();
        System.out.print(nombre+ " digite su edad: ");
        edad = scanner.nextInt();

        //Realizar proceso
        if(edad> 0 && edad<=120){
            if (edad<=18){
                System.out.printf(nombre+" es menor de edad.");
            }else{
                System.out.printf(nombre+" es mayor de edad.");
            }
        }else{
            System.out.printf("Dato no permitido.");
        }
    }
}
