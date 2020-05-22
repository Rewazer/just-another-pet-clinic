/*
 * Created by SS on 22/05/2020
 */

package ru.hcc.services;

import ru.hcc.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
