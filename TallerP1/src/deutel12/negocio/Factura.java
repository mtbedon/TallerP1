package deutel12.negocio;

public class Factura {
    private String pieza;
    private String descrip;
    private int cant;
    private double precio, valor;

    public Factura(String pieza, String descrip, int cant, double precio) {
        this.pieza = pieza;
        this.descrip = descrip;
        setCant(cant);
        setPrecio(precio);
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getCant() {
        return cant;
    }

    public int setCant(int cant) {
        if (cant>0) {
            this.cant = cant;
            return cant;
        }
        return 0;

    }

    public double getPrecio() {
        return precio;
    }

    public double setPrecio(double precio) {
        if (precio>0) {
            this.precio = precio;
            return precio;
        }
        return 0.0;
    }

    public double obtenerMontoFactura(){
       return cant*precio;

    }

    @Override
    public String toString() {
        return "------------ Factura ------------\nNº   \tDescripción  \tCant\tPVP\t  Total\n" +pieza + "\t"+descrip+"\t   "+cant+"\t   "+precio+"\t   "+obtenerMontoFactura();
    }
}


