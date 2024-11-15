import Model.CarritoCompra;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Bienvenido al soft de Pepito.");

        ArrayList<CarritoCompra> arrayListCarritoCompra = new ArrayList<>();

        boolean bandera = true;
        int cantidad = 0;

        //Variables para llenar los datos
        String Dcliente;
        String Dproducto;
        int Dcantidad;
        Double DvalorUnitario;
        Double DporcentajeDescuento;

        do {
            CarritoCompra carritoCompra = new CarritoCompra();
            System.out.print(cantidad);

            //LLenar el array list
            Dcliente = JOptionPane.showInputDialog(null,"Digite el nombre del cliente: ");
            Dproducto = JOptionPane.showInputDialog(null,"Digite el nombre del producto: ");
            Dcantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de "+Dproducto+": "));
            DvalorUnitario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el valor unitario de "+Dproducto+": "));
            DporcentajeDescuento = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el porcentaje de descuento para "+Dproducto+": "));

            //Vamos a usar el objeto de la clase

            //Opción 1
            carritoCompra.setCliente(Dcliente);
            carritoCompra.setProducto(Dproducto);
            carritoCompra.setCantidad(Dcantidad);
            carritoCompra.setValorUnitario(DvalorUnitario);
            carritoCompra.setPorcentajeDescuento(DporcentajeDescuento);
            carritoCompra.ObtenarFactura();

            //Opción 2
            //CarritoCompra carritoCompra = new CarritoCompra(Dcliente,Dproducto,Dcantidad,DvalorUnitario,DporcentajeDescuento);

            //Ahora se va a agregar un dato al array list
            arrayListCarritoCompra.add(carritoCompra);

            //Validar si permite agregar otra compra.
            bandera = JOptionPane.showInputDialog(null,"Desea agregar otra venta? SI/NO").equals("SI") ? true : false;

        }while (bandera == true);

        //Crear objeto sobre Objeto
        CarritoCompra[] carritoCompraObj = new CarritoCompra[arrayListCarritoCompra.size()];
        for(int i=0; i<arrayListCarritoCompra.size();i++){
            carritoCompraObj[i] = new CarritoCompra();

            CarritoCompra carrito = arrayListCarritoCompra.get(i);
            carritoCompraObj[i] = carrito;
        }

        //Recorrer datos del array list
        System.out.println("************************* Datos del Objeto del arraylist");
        for(int i=0; i<arrayListCarritoCompra.size();i++){
            CarritoCompra carrito = arrayListCarritoCompra.get(i);
            System.out.println(carrito.toString());
        }

        //Recorrer datos del array list
        System.out.println("************************* Datos del Objeto sobre objeto");
        for(int i=0; i<carritoCompraObj.length;i++){
            System.out.println(carritoCompraObj[i].toString());
        }

    }


}