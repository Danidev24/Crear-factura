package appFacturas;

import appFacturas.modelo.Cliente;
import appFacturas.modelo.Factura;
import appFacturas.modelo.ItemFactura;
import appFacturas.modelo.Producto;

import java.util.Scanner;

public class ejemploFactura {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.setCedula("1094859610");
        cliente.setNombre("Danilo Celis");
        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la descripción de la factura : ");

        Factura factura = new Factura(s.nextLine(), cliente);

        Producto producto;

        System.out.println("\n");

        for(int i=0; i < 2; i++){
            producto = new Producto();
            System.out.print("Ingrese producto #"+ producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese cantidad: ");
            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }

        System.out.println(factura.generarDetalle());


        s.close();


    }
}
