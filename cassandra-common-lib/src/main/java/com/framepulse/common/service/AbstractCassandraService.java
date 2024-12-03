package com.framepulse.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;
import java.util.Optional;

public abstract class AbstractCassandraService<E, ID, R extends CassandraRepository<E, ID>> {

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
