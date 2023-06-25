package com.crud.CrudFullStackAplication.services;

import com.crud.CrudFullStackAplication.entities.EmpleadoEntity;

import java.util.List;

public interface EmpleadoService {

    List<EmpleadoEntity> listarEmpleado();

    EmpleadoEntity agregarEmpleado(EmpleadoEntity empleado);

    void eliminarEmpleado(EmpleadoEntity empleado);

    EmpleadoEntity encontrarEmpleado(EmpleadoEntity empleado);
}
