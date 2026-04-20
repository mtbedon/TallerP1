package deutel14.negocio;

public class Fecha {
    private int day,month,year;

    public Fecha(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day>0 && day<31){
            this.day=day;
        }else{
            System.out.println("Día no válido");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month>0 && month<12) {
            this.month = month;
        }else{
            System.out.println("Mes no válido");
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>0) {
            this.year = year;
        }else{
            System.out.println("Año no válido");
        }
    }

    @Override
    public String toString() {
        return "Fecha: "+month+"/"+day+"/"+year;
    }
}
