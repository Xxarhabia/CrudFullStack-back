package com.crud.CrudFullStackAplication.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND) //esta va a ser una excepcion en caso que no encuentre al empleado
public class ResourceNotFoundException extends RuntimeException {

    private static final Long serialVersionId = 1L;

    public ResourceNotFoundException(String mensaje){
        super(mensaje);
    }
}
