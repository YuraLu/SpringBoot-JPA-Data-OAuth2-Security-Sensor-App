package org.example.sensor.service;


import org.example.sensor.service.dto.Paging;

import java.util.List;

public interface CrudService<E> {

    E save(E e);

    E update(E e);

    void delete(Long id);

    E findById(Long id);

    List<E> findAll(Paging paging);

}