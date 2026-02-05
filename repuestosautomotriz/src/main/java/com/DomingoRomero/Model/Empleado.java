package com.DomingoRomero.Model;

import jakarta.persistence.*;
import org.springframework.aot.generate.GeneratedTypeReference;


@Entity // una clase anotada , represeta una tabla relacionar , actua comom un puente entre la programacion orientada a objetos y SQL (JPA ivernes)prermitiendo mapiar automaticamente atrivutos a columnas
 @Table(name = "Empleados")

public class Empleado {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="id_empleado")
    private Integer idEmpleado;

    @Column (name = "nombre_empleado")
    private String nombreEmpleados;

    @Column (name = "apellido_empleado")
    private String apellidoEmpleado;

    @Column (name = "puesto_empleado")
    private String puestoEmpleado;

    @Column (name = "email_empleado")
    private String emailEmpleado;


    //generar getter and
    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleados() {
        return nombreEmpleados;
    }

    public void setNombreEmpleados(String nombreEmpleados) {
        this.nombreEmpleados = nombreEmpleados;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getPuestoEmpleado() {
        return puestoEmpleado;
    }

    public void setPuestoEmpleado(String puestoEmpleado) {
        this.puestoEmpleado = puestoEmpleado;
    }

    public String getEmailEmpleado() {
        return emailEmpleado;
    }

    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }
}
