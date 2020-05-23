package ru.hcc.petclinic.services;

import ru.hcc.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
