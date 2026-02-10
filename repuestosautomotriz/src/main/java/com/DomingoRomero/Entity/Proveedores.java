package com.DomingoRomero.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Proveedores")
public class Proveedores {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Integer id_proveedor;

    @Column(name = "nombre_proveedor")
    private String nombreproveedor;

    @Column(name = "telefono_proveedor")
    private Integer telefonoproveedor;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "email_proveedor")
    private String emailProveedor;

    public Integer getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Integer id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombreproveedor() {
        return nombreproveedor;
    }

    public void setNombreproveedor(String nombreproveedor) {
        this.nombreproveedor = nombreproveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefonoproveedor() {
        return telefonoproveedor;
    }

    public void setTelefonoproveedor(Integer telefonoproveedor) {
        this.telefonoproveedor = telefonoproveedor;
    }

    public String getEmailProveedor() {
        return emailProveedor;
    }

    public void setEmailProveedor(String emailProveedor) {
        this.emailProveedor = emailProveedor;
    }
}
