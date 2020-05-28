/*
 * Created by SS on 29/05/2020
 */

package ru.hcc.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.hcc.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
