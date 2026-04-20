package deutel15.negocio;

import java.time.LocalDate;

public class FrecuenciasCardiacas {

    private String nombre, apellido;
    private int day, month, year;

    public FrecuenciasCardiacas(String nombre, String apellido, int day, int month, int year) {
        this.nombre = nombre;
        this.apellido = apellido;
        setDay(day);
        setMonth(month);
        setYear(year);
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

    @Override
    public String toString() {
        return "Estimado/a "+nombre+" "+apellido+" con fecha de nacimiento "+day+"/"+month+"/"+year+"\nSu ritmo cardiáco máximo es de "+frecuenciaMaxima()+" pulsos por minuto y su frecuencia esperada se encuentra en el rango de "+frecuenciaEsperada()+"pulsos por minuto";

    }
}