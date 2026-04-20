package deutel12.interfaz;

import deutel12.negocio.Factura;

import java.util.Scanner;

public class PruebaFractura {
    public static void main(String[] args) {
            String pieza, descrip;
            int cant;
            double precio, valor;
            Factura fact1;

            Scanner sc=new Scanner(System.in);

        System.out.println("*** FACTURACIÓN ***\n");
        System.out.println("Ingrese el número de pieza");
        pieza = sc.nextLine();
        System.out.println("Ingrese la descripción de la pieza");
        descrip=sc.nextLine();
        System.out.println("Ingrese la cantidad de piezas que compró");
        cant=Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el precio unitario de la pieza\n");
        precio=Double.parseDouble(sc.nextLine());

        fact1=new Factura(pieza,descrip,cant,precio);


        System.out.println("======= FERETERÍA S.A =======");
        System.out.println(fact1.toString());

    }
}
