package com.gestion.empleados.gestionempleadosbackend.controlador;

import com.gestion.empleados.gestionempleadosbackend.modelo.Empleado;
import com.gestion.empleados.gestionempleadosbackend.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    @GetMapping("/empleados")
    public List<Empleado> listarTodosLosEmpleados(){
        return empleadoRepositorio.findAll();
    }

}
