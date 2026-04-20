package deutel13.interfaz;

import deutel13.negocio.Empleado;

import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PruebaEmpleado {
    public static void main(String[] args) {
            String nombre,apellido;
            double salario;
            Empleado em1;
            Empleado em2;
            Scanner sc = new Scanner(System.in);

            String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del primer empleado: ");
            String apellido1 = JOptionPane.showInputDialog("Ingrese el apellido del primer empleado: ");
            double salario1 = Double.parseDouble(
                    JOptionPane.showInputDialog("Ingrese el salario del empleado 1: ")
            );

            em1 = new Empleado(nombre1,apellido1,salario1);

            String nombre2=JOptionPane.showInputDialog("Ingrese el nombre del segundo empleado: ");
            String apellido2=JOptionPane.showInputDialog("Ingrese el apellido del segundo empleado: ");
            double salario2=Double.parseDouble(
                    JOptionPane.showInputDialog("Ingrese el salario del segundo empleado")
            );

            em2 = new Empleado(nombre2,apellido2,salario2);

            int op;
            do{
                System.out.println("*** EMPLEADOS ***");
                System.out.println("1. Sueldo Anual de los empleados");
                System.out.println("2. Aumento del 10% del sueldo de los empleados");
                System.out.println("3. Mostrar información de los empleados");
                System.out.println("4. Salir");
                System.out.println("Escoja una opción: ");
                op=Integer.parseInt(sc.nextLine());
                switch (op){
                    case 1:{
                        System.out.println("---- SUELDO ANUAL -----");
                        System.out.println("El salario anual de "+ em1.getNombre()+ " es: $"+salario1*12);
                        System.out.println("El salario anual de "+ em2.getNombre()+ " es: $"+salario2*12);
                        }break;
                    case 2:{
                        System.out.println("---- AUMENTO DE SALARIO ----");
                        System.out.println("El salario anual de "+em1.getNombre()+" con su aumento de 10% es: $"+(salario1*1.1)*12);
                        System.out.println("El salario anual de "+em2.getNombre()+" con su aumento de 10% es: $1"+(salario2*1.1)*12);
                        }break;
                    case 3:{
                        System.out.println(em1.toString());
                        System.out.println(em2.toString());
                        }break;
                    case 4:{
                        System.out.println("Gracias por usar mi app");
                    }
                }
            }while(op!=4);
        }
    }
