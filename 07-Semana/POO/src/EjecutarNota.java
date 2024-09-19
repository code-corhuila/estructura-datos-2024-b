import Datos.Calificacion;

public class EjecutarNota {
    public static void main(String[]  arg){
        Calificacion calificacion = new Calificacion();

        String mensaje, mensajeOk, mensaneError;

        //Datos para parcial.
        mensaje = "Digitar nota del parcial: ";
        mensajeOk = "El la nota ingresada del parcial es válida.";
        mensaneError = "El la nota ingresada del parcial no es válida.";
        Double parcial = calificacion.CapturarNota(mensaje,mensajeOk,mensaneError);

        //Datos para trabajo.
        mensaje = "Digitar nota promedio del trabajo: ";
        mensajeOk = "El la nota ingresada del promedio de trabajos es válida.";
        mensaneError = "El la nota ingresada del promedio de trabajos no es válida.";
        Double trabajo = calificacion.CapturarNota(mensaje,mensajeOk,mensaneError);


        //Datos para certificación.
        mensaje = "Digitar nota de certificación: ";
        mensajeOk = "El la nota ingresada de certificación es válida.";
        mensaneError = "El la nota ingresada de certificación no es válida.";
        Double certificacion = calificacion.CapturarNota(mensaje,mensajeOk,mensaneError);

        //Datos para auto - coe.
        mensaje = "Digitar nota de auto - coe: ";
        mensajeOk = "El la nota ingresada de auto - coe es válida.";
        mensaneError = "El la nota ingresada de auto - coe no es válida.";
        Double autoCoe = calificacion.CapturarNota(mensaje,mensajeOk,mensaneError);

        calificacion.MostarNota(parcial,trabajo,certificacion,autoCoe);

    }

}
