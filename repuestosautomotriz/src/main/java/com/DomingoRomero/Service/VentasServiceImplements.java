package com.DomingoRomero.Service;

import com.DomingoRomero.Entity.Ventas;
import com.DomingoRomero.Repository.VentasRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class VentasServiceImplements  implements VentasService{
    private final VentasRepository VentasRepository;


    public VentasServiceImplements(VentasRepository ventasRepository) {
        VentasRepository = ventasRepository;
    }

    @Override
    public List<Ventas> getAllVentas() {
        return VentasRepository.findAll();
    }

    @Override
    public Ventas getVentasById(Integer id) {
        return VentasRepository.findById(id).orElse(null);
    }

    @Override
    public Ventas saveVentas(Ventas ventas) throws RuntimeException {
        return VentasRepository.save(ventas);
    }

    @Override
    public Ventas upadateVentas(Integer id, Ventas ventas) {
        return null;
    }

    @Override
    public Ventas updateVentas(Integer id, Ventas ventas) {
        Ventas existingVentas = VentasRepository.findById(id).orElseThrow(() -> new RuntimeException("El Ventas no existe"));

        existingVentas.setFechaventa(ventas.getFechaventa());
        existingVentas.setCantidad(ventas.getCantidad());
        existingVentas.setTotal(ventas.getTotal());
        existingVentas.setIdempleado(ventas.getIdempleado());
        existingVentas.setIdrepuesto(ventas.getIdrepuesto());

        return VentasRepository.save(existingVentas);

    }


    @Override
    public void deleteVentas(Integer id) {
        if (!VentasRepository.existsById(id)) {
            throw new RuntimeException("Ventas no existe");
        }
        VentasRepository.deleteById(id);
    }
}

