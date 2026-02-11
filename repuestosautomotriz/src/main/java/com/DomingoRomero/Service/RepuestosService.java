package com.DomingoRomero.Service;

import com.DomingoRomero.Entity.Repuestos;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RepuestosService {
    List<Repuestos> getAllRepuestos();
    Repuestos getRepuestosById(Integer id);
    Repuestos saveRepuestos (Repuestos Ventas) throws RuntimeException;
    Repuestos upadateRepuestos (Integer id, Repuestos repuestos);
    void deleteRepuestos (Integer id);


    Repuestos updateRepuestos(Integer id, Repuestos repuestos);
}
