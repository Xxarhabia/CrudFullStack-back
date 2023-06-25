package com.crud.CrudFullStackAplication.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "empleado")
public class EmpleadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleado;

    @Column(name = "nombre_empleado", nullable = false)
    private String nombreEmpleado;

    @Column(name = "apellido_empleado", nullable = false)
    private String apellidoEmpleado;

    @Column(name = "email_empleado", nullable = false)
    private String emailEmpleado;
}
