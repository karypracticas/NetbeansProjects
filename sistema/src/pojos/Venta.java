package pojos;

import java.sql.Date;

/**
 *
 * @author Karina
 */
public class Venta {
    private int idVenta;
    private int montoVenta;
    private String fechaVenta;

    public Venta(int idVenta, int montoVenta, String fechaVenta) {
        this.idVenta = idVenta;
        this.montoVenta = montoVenta;
        this.fechaVenta = fechaVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(int montoVenta) {
        this.montoVenta = montoVenta;
    }
    
    
    
}
