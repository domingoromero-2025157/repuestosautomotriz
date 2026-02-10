package com.DomingoRomero.Service;

import com.DomingoRomero.Entity.Empleado;
import com.DomingoRomero.Entity.Proveedores;

import java.util.List;

public interface ProveedoresService {
    List<Proveedores> getAllProveedores();
    Proveedores getProveedoresById(Integer id);
    Proveedores saveProveedores (Proveedores proveedores) throws RuntimeException;
    Proveedores upadateProveedores (Integer id, Proveedores proveedores);
    void delateProveedores (Integer id);

    void deleteProveedores(Integer id);

    Proveedores updateProveedores(Integer id, Proveedores proveedores);
}
