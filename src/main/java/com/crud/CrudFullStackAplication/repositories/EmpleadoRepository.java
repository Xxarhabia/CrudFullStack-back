package com.crud.CrudFullStackAplication.repositories;

import com.crud.CrudFullStackAplication.entities.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Integer> {
}
