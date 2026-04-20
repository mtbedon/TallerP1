package deutel14.interfaz;

import deutel14.negocio.Fecha;

import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {
        int day, month,year;
        Fecha fecha;
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese el día");
        day=Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el més (Enero=1)");
        month=Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el año");
        year=Integer.parseInt(sc.nextLine());

        fecha = new Fecha(day, month, year);

        System.out.println(fecha.toString());
    }

}
