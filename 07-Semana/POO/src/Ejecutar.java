import Datos.Persona;

public class Ejecutar {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.nombre = "Jesús";
        persona.apellido = "González";
        persona.tipoDocumento = "CC";
        persona.numeroDocumento = "1043";

        //Integer edad = persona.CalcularEdad(2000);
        //System.out.println(edad);

        persona.ImprimirNombre();

    }
}
