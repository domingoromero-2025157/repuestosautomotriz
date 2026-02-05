drop database if exists dbrepuestosautomotriz_in5cm;

create database dbrepuestosautomotriz_in5cm;

use dbrepuestosautomotriz_in5cm;

create table proveedores(
    id_proveedor int auto_increment not null,
    nombre_proveedor varchar(60) not null,
    telefono_proveedor int not null,
    direccion varchar(100) not null,
    email_proveedor varchar(100) not null,
    primary key pk_id_proveedor (id_proveedor)
);

create table empleados(
    id_empleado int auto_increment not null,
    nombre_empleado varchar(60) not null,
    apellido_empleado varchar(60) not null,
    puesto_empleado varchar(20) null,
    email_empleado varchar(100) not null,
    primary key pk_id_empleado (id_empleado)
);

create table repuestos(
    id_repuesto int auto_increment not null,
    nombre_repuesto varchar(60) not null,
    categoria_repuesto varchar(60) not null,
    precio_compra double not null,
    precio_venta double not null,
    id_proveedor int not null,
    primary key pk_id_repuesto (id_repuesto),
    constraint fk_repuesto_proveedor 
        foreign key (id_proveedor)
        references proveedores(id_proveedor)
        on delete cascade
);

create table ventas(
    id_venta int auto_increment not null,
    fecha_venta date not null,
    cantidad int not null,
    total double not null,
    id_empleado int not null,
    id_repuesto int not null,
    primary key pk_id_venta (id_venta),
    constraint fk_ventas_empleado 
        foreign key (id_empleado)
        references empleados(id_empleado)
        on delete cascade,
    constraint fk_ventas_repuestos 
        foreign key (id_repuesto)
        references repuestos(id_repuesto)
        on delete cascade
);

DELIMITER $$

-- =========================
-- PROVEEDORES --------------------------------------------------------------------------------------
-- =========================

CREATE PROCEDURE sp_proveedores_read_all()
BEGIN
    SELECT * FROM proveedores ORDER BY id_proveedor;
END$$

CREATE PROCEDURE sp_proveedores_create(
    IN p_nombre_proveedor VARCHAR(60),
    IN p_telefono_proveedor INT,
    IN p_direccion VARCHAR(100),
    IN p_email_proveedor VARCHAR(100)
)
BEGIN
    INSERT INTO proveedores (
        nombre_proveedor,
        telefono_proveedor,
        direccion,
        email_proveedor
    )
    VALUES (
        p_nombre_proveedor,
        p_telefono_proveedor,
        p_direccion,
        p_email_proveedor
    );
END$$

CREATE PROCEDURE sp_proveedores_read_by_id(IN p_id INT)
BEGIN
    SELECT * FROM proveedores WHERE id_proveedor = p_id;
END$$

CREATE PROCEDURE sp_proveedores_update(
    IN p_id INT,
    IN p_nombre_proveedor VARCHAR(60),
    IN p_telefono_proveedor INT,
    IN p_direccion VARCHAR(100),
    IN p_email_proveedor VARCHAR(100)
)
BEGIN
    UPDATE proveedores
    SET nombre_proveedor = p_nombre_proveedor,
        telefono_proveedor = p_telefono_proveedor,
        direccion = p_direccion,
        email_proveedor = p_email_proveedor
    WHERE id_proveedor = p_id;
END$$

CREATE PROCEDURE sp_proveedores_delete(IN p_id INT)
BEGIN
    DELETE FROM proveedores WHERE id_proveedor = p_id;
END$$

-- =========================
-- EMPLEADOS
-- =========================

CREATE PROCEDURE sp_empleados_read_all()
BEGIN
    SELECT * FROM empleados ORDER BY id_empleado;
END$$

CREATE PROCEDURE sp_empleados_create(
     in p_nombre_empleado VARCHAR(60),
     in p_apellido_empleado VARCHAR(60),
     in p_puesto_empleado VARCHAR(20),
     in p_email_empleado VARCHAR(100)
)
BEGIN
    INSERT INTO empleados (
        nombre_empleado,
        apellido_empleado,
        puesto_empleado,
        email_empleado
    )
    VALUES (
        p_nombre_empleado,
        p_apellido_empleado,
        p_puesto_empleado,
        p_email_empleado
    );
END$$

-- =========================
-- REPUESTOS
-- =========================

CREATE PROCEDURE sp_repuestos_read_all()
BEGIN
    SELECT * FROM repuestos ORDER BY id_repuesto;
END$$

CREATE PROCEDURE sp_repuestos_create(
    IN p_nombre_repuesto VARCHAR(60),
    IN p_categoria_repuesto VARCHAR(60),
    IN p_precio_compra DOUBLE,
    IN p_precio_venta DOUBLE,
    IN p_id_proveedor INT
)
BEGIN
    INSERT INTO repuestos (
        nombre_repuesto,
        categoria_repuesto,
        precio_compra,
        precio_venta,
        id_proveedor
    )
    VALUES (
        p_nombre_repuesto,
        p_categoria_repuesto,
        p_precio_compra,
        p_precio_venta,
        p_id_proveedor
    );
END$$

-- =========================
-- VENTAS
-- =========================

CREATE PROCEDURE sp_ventas_create(
    IN p_fecha_venta DATE,
    IN p_cantidad INT,
    IN p_total DOUBLE,
    IN p_id_empleado INT,
    IN p_id_repuesto INT
)
BEGIN
    INSERT INTO ventas (
        fecha_venta,
        cantidad,
        total,
        id_empleado,
        id_repuesto
    )
    VALUES (
        p_fecha_venta,
        p_cantidad,
        p_total,
        p_id_empleado,
        p_id_repuesto
    );
END$$

DELIMITER ;

