package com.crud.CrudFullStackAplication.services.impl;

import com.crud.CrudFullStackAplication.entities.EmpleadoEntity;
import com.crud.CrudFullStackAplication.exceptions.ResourceNotFoundException;
import com.crud.CrudFullStackAplication.repositories.EmpleadoRepository;
import com.crud.CrudFullStackAplication.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository repository;

    @Override
    public List<EmpleadoEntity> listarEmpleado() {
        return repository.findAll();
    }

    @Override
    public EmpleadoEntity agregarEmpleado(EmpleadoEntity empleado) {
        return repository.save(empleado);
    }

    @Override
    public void eliminarEmpleado(EmpleadoEntity empleado) {
        repository.delete(empleado);
    }

    @Override
    public EmpleadoEntity encontrarEmpleado(int id) {
        return repository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No se encontró el usuario con el id " + id));
    }


}
