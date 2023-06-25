package com.crud.CrudFullStackAplication.controllers;

import com.crud.CrudFullStackAplication.entities.EmpleadoEntity;
import com.crud.CrudFullStackAplication.services.impl.EmpleadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")
public class EmpleadoController {

    @Autowired
    private EmpleadoServiceImpl empleadoService;

    @GetMapping("/empleados")
    public List<EmpleadoEntity> listarTodosLosEmpleados(){
        return empleadoService.listarEmpleado();
    }

    @GetMapping("/registrar-empleado")
    public void agregarEmpleado(){

    }

    @PostMapping("/empleados")
    public ResponseEntity<EmpleadoEntity> guardarEmpleado(@RequestBody EmpleadoEntity empleado){
        var empleadoGuardado = empleadoService.agregarEmpleado(empleado);
        return ResponseEntity.ok(empleadoGuardado);
    }
}
