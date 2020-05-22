/*
 * Created by SS on 22/05/2020
 */

package ru.hcc.services;

import ru.hcc.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
