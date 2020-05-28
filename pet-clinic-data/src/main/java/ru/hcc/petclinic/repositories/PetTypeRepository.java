/*
 * Created by SS on 29/05/2020
 */

package ru.hcc.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.hcc.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
