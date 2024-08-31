import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String arg[]){
        //Capturar las tres notas y el nombre del estudiante, e indicar si aprobó o no.
        //Se conoce que se aprueba con 3.0 o más.
        //Rango de notas permitido es 0.0 a 5.0
        //Genere mensaje dinámicos.

        Scanner scanner = new Scanner(System.in);
        String nombre;
        Double n1;
        Double n2;
        Double n3;
        Double resultado;
        String mensajeError =" Error, validar dato ";
        //Capturar datos
        System.out.print("Digite el nombre del estudiante: ");
        nombre = scanner.next();

        System.out.print(nombre+" digite la nota 1: ");
        n1 = scanner.nextDouble();
        //Validar
        if (n1>=0 && n1 <=5){
            System.out.print(nombre+" digite la nota 2: ");
            n2 = scanner.nextDouble();

            if(n2>=0 && n2<=5){
                System.out.print(nombre+" digite la nota 3: ");
                n3 = scanner.nextDouble();
                if(n3>=0 && n3<=5){

                }else {
                    System.out.printf(mensajeError+ "n3");
                }
            } else {
                System.out.printf(mensajeError+ "n2");
            }
        }else {
            System.out.printf(mensajeError+ "n1");
        }
    }
}
