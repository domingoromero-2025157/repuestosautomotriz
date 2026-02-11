package com.DomingoRomero.Service;

import com.DomingoRomero.Entity.Repuestos;

import com.DomingoRomero.Repository.RepuestosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class RepuestosServiceImplements  implements RepuestosService{
    private final RepuestosRepository RepuestosRepository;

    public RepuestosServiceImplements(RepuestosRepository repuestosRepository) {
        RepuestosRepository = repuestosRepository;
    }

    @Override
    public List<Repuestos> getAllRepuestos() {
        return RepuestosRepository.findAll();
    }

    @Override
    public Repuestos getRepuestosById(Integer id) {
        return RepuestosRepository.findById(id).orElse(null);
    }

    @Override
    public Repuestos saveRepuestos(Repuestos repuestos) throws RuntimeException {
        return RepuestosRepository.save(repuestos);
    }

    @Override
    public Repuestos upadateRepuestos(Integer id, Repuestos repuestos) {
        return null;
    }

    @Override
    public Repuestos updateRepuestos(Integer id, Repuestos repuestos) {
        Repuestos existingRepuestos = RepuestosRepository.findById(id).orElseThrow(() -> new RuntimeException("El Repuestos no existe"));

        existingRepuestos.setNombreRepuesto(repuestos.getNombreRepuesto());
        existingRepuestos.setCategoriaRepuesto(repuestos.getCategoriaRepuesto());
        existingRepuestos.setPrecioCompra(repuestos.getPrecioCompra());
        existingRepuestos.setPrecioCompra(repuestos.getPrecioVenta());
        existingRepuestos.setIdproveedor(repuestos.getIdproveedor());




        return RepuestosRepository.save(existingRepuestos);

    }


    @Override
    public void deleteRepuestos(Integer id) {
        if (!RepuestosRepository.existsById(id)) {
            throw new RuntimeException("Repuestos no existe");
        }
        RepuestosRepository.deleteById(id);
    }
}

