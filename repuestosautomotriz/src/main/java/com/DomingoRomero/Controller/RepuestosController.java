package com.DomingoRomero.Controller;

import com.DomingoRomero.Entity.Repuestos;
import com.DomingoRomero.Entity.Ventas;
import com.DomingoRomero.Service.RepuestosService;
import com.DomingoRomero.Service.VentasService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Repuestos")
public class RepuestosController {

    private final RepuestosService repuestosService;

    public RepuestosController(RepuestosService repuestosService) {
        this.repuestosService = repuestosService;
    }

    @GetMapping
    public List<Repuestos> getAllRepuestos() {
        return repuestosService.getAllRepuestos();
    }

    @PostMapping
    public ResponseEntity<?> createRepuestos(@Valid @RequestBody Repuestos repuestos) {
        try {
            Repuestos createdRepuestos = repuestosService.saveRepuestos(repuestos);
            return new ResponseEntity<>(createdRepuestos, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRepuestos(@PathVariable Integer id){
        try {
            repuestosService.deleteRepuestos(id);
            return ResponseEntity.ok("Repuestos Eliminado Correctamente");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> upadateRepuestos(@PathVariable Integer id, @RequestBody Repuestos repuestos) {

        try {
            Repuestos actualizado = repuestosService.upadateRepuestos(id, repuestos);
            return ResponseEntity.ok(actualizado);

        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }

    }
}
