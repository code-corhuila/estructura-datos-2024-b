package Datos;

public class Persona {
    public String nombre;
    public String apellido;
    public String numeroDocumento;
    public String tipoDocumento;

    private void Caminar(){
        System.out.println(" estoy caminado.");
    }

    public Integer CalcularEdad(Integer anioNacimiento){
        Integer x=0;

        x = 2024 - anioNacimiento;
        return  x;
    }

    public void ImprimirNombre(){
        System.out.print(nombre+" "+apellido);
        Caminar();
    }
}
