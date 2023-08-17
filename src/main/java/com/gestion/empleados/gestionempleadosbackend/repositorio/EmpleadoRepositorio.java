package com.gestion.empleados.gestionempleadosbackend.repositorio;

import com.gestion.empleados.gestionempleadosbackend.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long>{}
