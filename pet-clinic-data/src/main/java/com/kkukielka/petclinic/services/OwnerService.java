package com.kkukielka.petclinic.services;

import com.kkukielka.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
