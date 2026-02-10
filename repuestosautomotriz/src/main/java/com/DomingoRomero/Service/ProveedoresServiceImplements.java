package com.DomingoRomero.Service;


import com.DomingoRomero.Entity.Empleado;
import com.DomingoRomero.Entity.Proveedores;
import com.DomingoRomero.Repository.ProveedoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedoresServiceImplements implements ProveedoresService {
    private final ProveedoresRepository ProveedoresRepository;


    public ProveedoresServiceImplements(ProveedoresRepository proveedoresRepository) {
        ProveedoresRepository = proveedoresRepository;
    }

    @Override
    public List<Proveedores> getAllProveedores() {
        return ProveedoresRepository.findAll();
    }

    @Override
    public Proveedores getProveedoresById(Integer id) {
        return ProveedoresRepository.findById(id).orElse(null);
    }

    @Override
    public Proveedores saveProveedores(Proveedores proveedores) throws RuntimeException {
        return ProveedoresRepository.save(proveedores);
    }

    @Override
    public Proveedores upadateProveedores(Integer id, Proveedores proveedores) {
        return null;
    }

    @Override
    public Proveedores updateProveedores(Integer id, Proveedores proveedores) {
        Proveedores existingProveedores = ProveedoresRepository.findById(id).orElseThrow(() -> new RuntimeException("El Proveedores no existe"));

        existingProveedores.setNombreproveedor(proveedores.getNombreproveedor());
        existingProveedores.setTelefonoproveedor(proveedores.getTelefonoproveedor());
        existingProveedores.setDireccion(proveedores.getDireccion());
        existingProveedores.setEmailProveedor(proveedores.getEmailProveedor());

        return ProveedoresRepository.save(existingProveedores);

    }

    @Override
    public void delateProveedores(Integer id) {
        ProveedoresRepository.deleteById(id);


    }

    @Override
    public void deleteProveedores(Integer id) {
        if (!ProveedoresRepository.existsById(id)) {
            throw new RuntimeException("Empleado no existe");
        }
        ProveedoresRepository.deleteById(id);
    }
}