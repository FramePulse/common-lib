package com.framepulse.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService<E, ID, R extends JpaRepository<E, ID>> {

    @Autowired
    protected R repository;

    public List<E> findAll() {
        return repository.findAll();
    }

    public Optional<E> findById(ID id) {
        return repository.findById(id);
    }

    public E save(E entity) {
        return repository.save(entity);
    }

    public E update(E entity) {
        return repository.save(entity);
    }

    public void delete(E entity) {
        repository.delete(entity);
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }
}
