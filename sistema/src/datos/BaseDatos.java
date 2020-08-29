package datos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojos.Producto;
import pojos.Venta;

/**
 *
 * @author Karina
 */
public class BaseDatos {
    
    Connection conn = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    
    //Método Constructor
    public BaseDatos() {
        try {
            Class.forName("org.postgresql.Driver");
           
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }      
    }
    
    public void insertarProducto(Producto producto) throws FileNotFoundException{
        try {
             conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/miSistema", "postgres", "1986");
             FileInputStream fis = new FileInputStream(producto.getFotoProducto());
            
            String sql = "INSERT INTO cat_producto (id_prod,nombre_prod,desc_prod,stock_prod,foto_prod,unidad_prod,precio_compra_prod,precio_venta_prod,existencias_prod,id_categoria_prod,id_proveedor)"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?); ";
            st = conn.prepareStatement(sql);
            st.setInt(1, producto.getIdProducto());
            st.setString(2, producto.getNombreProducto());
            st.setString(3, producto.getDescProducto());
            
            
            st.executeUpdate();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        
        finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }   
    
    public void insertarVenta(Venta venta){
        try {
            try {
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/miSistema", "postgres", "1986");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            String sql = "INSERT INTO ventas (id_venta,monto_venta,fecha_venta) VALUES (?,?,?);";
            st = conn.prepareStatement(sql);
            st.setInt(1, venta.getIdVenta());
            st.setInt(2, venta.getMontoVenta());
            st.setString(3, venta.getFechaVenta());
            
            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
        }
    }
    
    
    public ArrayList<Venta> obtenerVenta(){
        
        ArrayList<Venta> listaVentas = new ArrayList<Venta>();
        
        try {
            try {
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/miSistema", "postgres", "1986");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            String sql = "SELECT * FROM ventas;";
            st = conn.prepareStatement(sql);       
            rs = st.executeQuery();
            
            while(rs.next()) {
                int idVenta = rs.getInt("id_venta");
                int montoVenta = rs.getInt("monto_venta");
                String fechaVenta = rs.getString("fecha_venta");
                
                Venta venta = new Venta(idVenta,montoVenta,fechaVenta);
                listaVentas.add(venta);
            }
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
        }
        return listaVentas;
    }
    
    /*public static void main(String[] args) {
        Venta venta = new Venta(5,8,"2020-08-29");
        BaseDatos base = new BaseDatos();
        base.insertarVenta(venta);
    }*/
    
    
    
    
}
