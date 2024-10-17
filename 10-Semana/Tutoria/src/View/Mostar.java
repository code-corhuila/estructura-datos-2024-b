package View;

import Entity.Cliente;
import Entity.Producto;

import javax.swing.*;
import java.math.BigDecimal;

public class Mostar {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        Cliente[] cliente = new Cliente[2];


        for (j=0; j<cliente.length; j++){
            cliente[i] = new Cliente();
            cliente[i].setNombre(Capturar("Digite nombre del cliente ["+(i+1)+"]:"));
            cliente[i].setCorreo(Capturar("Digite el correo de "+cliente[i].getNombre()));;

            /*************************************
             * Gestión de la factura111
             * ***********************************/
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de productos a llevar: "));
            Producto[] producto = new Producto[cantidad];

            //Llenar datos
            String nombreProducto;
            BigDecimal valorUnitarioProducto;
            int cantidadProducto;

            for (i=0; i<producto.length; i++){
                //Capturar datos
                nombreProducto = Capturar("Digite el nombre del producto ["+(i+1)+": ]");
                valorUnitarioProducto = new BigDecimal(Capturar("Digite el valor unitario de "+nombreProducto+"."));
                cantidadProducto = Integer.parseInt(Capturar("Digite la cantidad de "+nombreProducto+" a llevar."));

                producto[i] = new Producto();
                producto[i].setNombre(nombreProducto);
                producto[i].setValorUnitario(valorUnitarioProducto);
                producto[i].setCantidad(cantidadProducto);
                producto[i].CalcularValorPagar();

            }

            //recorrer datos
            //Acumulador del valor de los diferentes prodcutos que compro el cliente
            BigDecimal acumulador = BigDecimal.ZERO;
            System.out.printf("\n**********4*************** factura"+(j+1)+": *******\n");
            for (i=0; i<producto.length; i++){
                acumulador = acumulador.add(producto[i].getValorPagar());
                System.out.printf(producto[i].toString()+"\n");;
            }

            //Asignarle el valor total que ha comprado un cliente, el valor total a la factura
            cliente[j].setTotalPagar(acumulador);
            System.out.printf(cliente[j].toString()+"\n");;

            System.out.printf("************************* fin factura"+(j+1)+": *******\n");
            /*************************************
             * Fin de gestión de la factura
             * ***********************************/

        }




    }

    public static String Capturar(String mensaje){
        String data;

        data = JOptionPane.showInputDialog(null,mensaje);

        return data;
    }
}
