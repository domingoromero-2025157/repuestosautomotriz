package com.DomingoRomero.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Ventas")

public class Ventas {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ventas")
    private Integer idVentas;

    @Column(name = "fecha_venta")
    private Integer fechaventa;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "total")
    private Integer total;

    @Column(name = "id_empleado")
    private Integer idempleado;

    @Column(name = "id_repuesto")
    private Integer idrepuesto;

    public Integer getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(Integer idVentas) {
        this.idVentas = idVentas;
    }

    public Integer getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(Integer fechaventa) {
        this.fechaventa = fechaventa;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Integer idempleado) {
        this.idempleado = idempleado;
    }

    public Integer getIdrepuesto() {
        return idrepuesto;
    }

    public void setIdrepuesto(Integer idrepuesto) {
        this.idrepuesto = idrepuesto;
    }
}