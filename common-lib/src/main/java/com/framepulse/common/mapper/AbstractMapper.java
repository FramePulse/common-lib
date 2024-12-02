package com.framepulse.common.mapper;

public interface AbstractMapper<E,D> {
    public E dtoToEntity(D dto);
    public D entityToDto(E entity);
}
