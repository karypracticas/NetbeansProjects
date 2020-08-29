package pojos;

/**
 *
 * @author Karina
 */
public class Proveedor {
    private int idProveedor;
    private String nombreProveedor;
    private String dirProveedor;
    private String telProveedor;
    private String emailProveedor;
    private String contactoProveedor;

    public Proveedor(int idProveedor, String nombreProveedor, String dirProveedor, String telProveedor, String emailProveedor, String contactoProveedor) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.dirProveedor = dirProveedor;
        this.telProveedor = telProveedor;
        this.emailProveedor = emailProveedor;
        this.contactoProveedor = contactoProveedor;
    }

    public String getContactoProveedor() {
        return contactoProveedor;
    }

    public void setContactoProveedor(String contactoProveedor) {
        this.contactoProveedor = contactoProveedor;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDirProveedor() {
        return dirProveedor;
    }

    public void setDirProveedor(String dirProveedor) {
        this.dirProveedor = dirProveedor;
    }

    public String getTelProveedor() {
        return telProveedor;
    }

    public void setTelProveedor(String telProveedor) {
        this.telProveedor = telProveedor;
    }

    public String getEmailProveedor() {
        return emailProveedor;
    }

    public void setEmailProveedor(String emailProveedor) {
        this.emailProveedor = emailProveedor;
    }
    
    
}
