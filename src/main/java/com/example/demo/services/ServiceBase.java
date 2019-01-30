package com.example.demo.services;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.Optional;

abstract public class ServiceBase<T, I extends Serializable, F> {

    abstract protected CrudRepository<T, I> getRepository();

    public <T> get(final I id) {
        Optional<T> item = getRepository().findById(id);

        return getRepository().findById(id);
    }
}
