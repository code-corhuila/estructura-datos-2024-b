package View;

public class ArrayUnidireccional {
    public static void main(String[] args) {
        String[] diasSemana = new String[7];

        diasSemana[0] = "Lunes";
        diasSemana[1] = "Martes";
        diasSemana[2] = "Miércoles";
        diasSemana[3] = "Jueves";
        diasSemana[4] = "Viernes";
        diasSemana[5] = "Sábado";
        diasSemana[6] = "Domingo";

        // Imprimir los días de la semana
        String cadena = "";
        for (String dia : diasSemana) {
            cadena+=dia+" - ";
        }
        System.out.printf(cadena);
    }
}
