package com.DomingoRomero.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Repuestos")

public class Repuestos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_repuesto")
    private Integer idRepuesto;

    @Column(name = "nombre_repuesto")
    private String nombreRepuesto;

    @Column(name = "categoria_repuesto")
    private String categoriaRepuesto;

    @Column(name = "precio_compra")
    private Integer precioCompra;

    @Column(name = "precio_venta")
    private Integer precioVenta;

    @Column(name = "id_proveedor")
    private Integer idproveedor;


    public Integer getIdRepuesto() {
        return idRepuesto;
    }

    public void setIdRepuesto(Integer idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    public String getNombreRepuesto() {
        return nombreRepuesto;
    }

    public void setNombreRepuesto(String nombreRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
    }

    public String getCategoriaRepuesto() {
        return categoriaRepuesto;
    }

    public void setCategoriaRepuesto(String categoriaRepuesto) {
        this.categoriaRepuesto = categoriaRepuesto;
    }

    public Integer getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Integer precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Integer precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Integer idproveedor) {
        this.idproveedor = idproveedor;
    }
}