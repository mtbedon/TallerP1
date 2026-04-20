package deutel16.negocio;

import java.time.LocalDate;

public class PerfilMedico {
    private String nombre, apellido, sexo;
    private int day, month, year;
    private double peso, altura;

    public PerfilMedico(String nombre, String apellido, String sexo, int day, int month, int year, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.day = day;
        this.month = month;
        this.year = year;
        this.peso = peso;
        this.altura = altura;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Día no válido");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Mes no válido");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Año no válido");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso>0) {
            this.peso = peso;
        }else{
            System.out.println("Peso no válido");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura>0) {
            this.altura = altura;
        }else{
            System.out.println("Altura no válida");
        }
    }

    // Calcular edad
    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        int edad = hoy.getYear() - getYear();

        if (hoy.getMonthValue() < getMonth() ||
                (hoy.getMonthValue() == getMonth() && hoy.getDayOfMonth() < getDay())) {
            edad--;
        }

        return edad;
    }


    public int frecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public String frecuenciaEsperada() {
        int max = frecuenciaMaxima();
        double esperadamin = max * 0.50;
        double esperadamax = max * 0.85;

        return String.format("%.2f - %.2f", esperadamin, esperadamax);
    }

    public double calcularBMI(){
        return peso/(altura*altura);
    }

    @Override
    public String toString() {
        return "Nombre del Paciente: "+nombre+" "+apellido+"\nEdad: "+calcularEdad()+"\nSexo: "+sexo+"\nRitmo Cardiáco Máximo: "+frecuenciaMaxima()+" pulsos por minuto\nRitmo Cardiáco: "+frecuenciaEsperada()+" pulsos por minuto\nBMI: "+calcularBMI();
    }
}