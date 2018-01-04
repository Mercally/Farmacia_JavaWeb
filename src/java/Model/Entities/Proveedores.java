package Model.Entities;
// Generated 11-29-2017 08:34:07 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Proveedores generated by hbm2java
 */
public class Proveedores  implements java.io.Serializable {


     private Integer proveedorId;
     private String nombreComercial;
     private String nombreContacto;
     private String telefonoContacto;
     private String ciudad;
     private Date fechaCreacion;
     private Set<Productos> productoses = new HashSet<Productos>(0);

    public Proveedores() {
    }

    public Proveedores(String nombreComercial, String nombreContacto, String telefonoContacto, String ciudad, Date fechaCreacion, Set<Productos> productoses) {
       this.nombreComercial = nombreComercial;
       this.nombreContacto = nombreContacto;
       this.telefonoContacto = telefonoContacto;
       this.ciudad = ciudad;
       this.fechaCreacion = fechaCreacion;
       this.productoses = productoses;
    }
   
    public Integer getProveedorId() {
        return this.proveedorId;
    }
    
    public void setProveedorId(Integer proveedorId) {
        this.proveedorId = proveedorId;
    }
    public String getNombreComercial() {
        return this.nombreComercial;
    }
    
    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }
    public String getNombreContacto() {
        return this.nombreContacto;
    }
    
    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }
    public String getTelefonoContacto() {
        return this.telefonoContacto;
    }
    
    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Set<Productos> getProductoses() {
        return this.productoses;
    }
    
    public void setProductoses(Set<Productos> productoses) {
        this.productoses = productoses;
    }




}

