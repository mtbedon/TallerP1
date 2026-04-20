package deutel16.interfaz;

import deutel16.negocio.PerfilMedico;

import javax.swing.*;
import java.util.Scanner;

public class MainPaciente {
    public static void main(String[] args) {
        String nombre, apellido, sexo;
        int day, month, year;
        double peso, altura;
        PerfilMedico paciente;

        Scanner sc = new Scanner(System.in);

        nombre=JOptionPane.showInputDialog("Ingrese el nombre del paciente");
        apellido=JOptionPane.showInputDialog("Ingrese el apellido del paciente");
        sexo=JOptionPane.showInputDialog("Ingrese el sexo del paciente");
        day=Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el día de nacimiento del paciente")
        );
        month=Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el mes de nacimiento del paciente (Enero 1)")
        ); year=Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el año de nacimiento del paciente")
        );
        peso=Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el peso del paciente ")
        );
        altura=Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese la altura del paciente ")
        );


        paciente=new PerfilMedico(nombre,apellido,sexo,day,month,year,peso,altura);

        System.out.println("\n=== VALORES DE BMI ===");
        System.out.println("Bajo peso   : menos de 18.5");
        System.out.println("Normal      : 18.5 - 24.9");
        System.out.println("Sobrepeso   : 25 - 29.9");
        System.out.println("Obeso       : 30 o más");

        System.out.println("====INFORMACIÓN DEL PACIENTE====\n?");
        System.out.println(paciente.toString());

    }
}
