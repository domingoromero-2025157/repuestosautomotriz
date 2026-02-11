package com.DomingoRomero.Service;

import com.DomingoRomero.Entity.Ventas;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VentasService {
    List<Ventas> getAllVentas();
    Ventas getVentasById(Integer id);
    Ventas saveVentas (Ventas Ventas) throws RuntimeException;
    Ventas upadateVentas (Integer id, Ventas ventas);
    void deleteVentas (Integer id);


    Ventas updateVentas(Integer id, Ventas ventas);
}
