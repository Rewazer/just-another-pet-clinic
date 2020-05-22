package ru.hcc.services;

import java.security.acl.Owner;
import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
