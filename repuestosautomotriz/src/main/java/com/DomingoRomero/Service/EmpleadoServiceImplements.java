package com.DomingoRomero.Service;

import com.DomingoRomero.Model.Empleado;
import com.DomingoRomero.Repository.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImplements implements EmpleadoService{
    private final EmpleadoRepository empleadoRepository;

    public EmpleadoServiceImplements (EmpleadoRepository empleadoRepository) {
        this.empleadoRepository =empleadoRepository;
    }
    @Override
    public List<Empleado>getAllEmpleados(){
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado getEmpleadoById(Integer id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    @Override
    public Empleado saveEmpleado(Empleado empleado) throws RuntimeException {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado upadateEmpleado(Integer id, Empleado empleado) {
        return null;
    }

    @Override
    public void delateEmpleado(Integer id) {
    empleadoRepository.deleteById(id);



    }

}
