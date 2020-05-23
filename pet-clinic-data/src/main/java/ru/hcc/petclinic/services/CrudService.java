/*
 * Created by SS on 22/05/2020
 */

package ru.hcc.petclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
