/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

/**
 *
 * @author USUARIO
 */
public class M_Proveedor {
    private String idproveedor;
    private String razonsocial;
    private String nit;
    private String telefono;
    private String direccion;

    public M_Proveedor() {
    }

    public M_Proveedor(String idproveedor, String razonsocial, String nit, String telefono, String direccion) {
        this.idproveedor = idproveedor;
        this.razonsocial = razonsocial;
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(String idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
