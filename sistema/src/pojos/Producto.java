package pojos;

import java.io.File;

/**
 *
 * @author Karina
 */
public class Producto {
    private int idProducto;
    private String nombreProducto;
    private String descProducto;
    private String stockProducto;
    private File fotoProducto;
    private int unidadProducto;
    private int precioCompra;
    private int precioVenta;
    private int existencia;
    private String idCategoria;
    private int idProveedor;

    public Producto(int idProducto, String nombreProducto, String descProducto, String stockProducto, File fotoProducto, int unidadProducto, int precioCompra, int precioVenta, int existencia, String idCategoria, int idProveedor) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descProducto = descProducto;
        this.stockProducto = stockProducto;
        this.fotoProducto = fotoProducto;
        this.unidadProducto = unidadProducto;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.existencia = existencia;
        this.idCategoria = idCategoria;
        this.idProveedor = idProveedor;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }

    public String getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(String stockProducto) {
        this.stockProducto = stockProducto;
    }

    public File getFotoProducto() {
        return fotoProducto;
    }

    public void setFotoProducto(File fotoProducto) {
        this.fotoProducto = fotoProducto;
    }

    public int getUnidadProducto() {
        return unidadProducto;
    }

    public void setUnidadProducto(int unidadProducto) {
        this.unidadProducto = unidadProducto;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    
}
