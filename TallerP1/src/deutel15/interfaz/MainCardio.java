package deutel15.interfaz;

import deutel15.negocio.FrecuenciasCardiacas;

import java.util.Scanner;

public class MainCardio {
    public static void main(String[] args) {
        String nombre, apellido;
        int day, month, year;
        FrecuenciasCardiacas persona1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = sc.nextLine();
        System.out.println("Ingrese el día de su nacimiento");
        day = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el més de su nacimiento (Enero=1)");
        month = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el año de su nacimiento");
        year = Integer.parseInt(sc.nextLine());

        persona1=new FrecuenciasCardiacas(nombre,apellido,day,month,year);

        System.out.println("====¿CÓMO DEBE ESTAR TU CORAZÓN?\n");
        System.out.println(persona1.toString());
    }
}


