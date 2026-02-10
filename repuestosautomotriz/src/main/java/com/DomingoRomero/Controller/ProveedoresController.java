package com.DomingoRomero.Controller;

import com.DomingoRomero.Entity.Empleado;
import com.DomingoRomero.Entity.Proveedores;
import com.DomingoRomero.Service.ProveedoresService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedoresController {

    private final ProveedoresService proveedoresService;

    public ProveedoresController(ProveedoresService proveedoresService) {
        this.proveedoresService = proveedoresService;
    }

    @GetMapping
    public List<Proveedores> getAllProveedores() {
        return proveedoresService.getAllProveedores();
    }


    @PostMapping
    public ResponseEntity<?> createProveedores(@RequestBody Proveedores proveedores) {
        try {
            Proveedores createProveedores = proveedoresService.saveProveedores(proveedores);
            return new ResponseEntity<>(createProveedores, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProveedores(@PathVariable Integer id){
        try {
            proveedoresService.deleteProveedores(id);
            return ResponseEntity.ok("Empleado Eliminado Correctamente");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }
}
