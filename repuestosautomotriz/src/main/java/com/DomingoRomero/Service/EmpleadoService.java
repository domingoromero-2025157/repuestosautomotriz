package com.DomingoRomero.Service;


import com.DomingoRomero.Model.Empleado;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmpleadoService {
    List<Empleado> getAllEmpleados();
    Empleado getEmpleadoById(Integer id);
    Empleado saveEmpleado (Empleado empleado) throws RuntimeException;
    Empleado upadateEmpleado (Integer id, Empleado empleado);
    void delateEmpleado (Integer id);

    void deleteEmpleado(Integer id);

    Empleado updateEmpleado(Integer id, Empleado empleado);
}
