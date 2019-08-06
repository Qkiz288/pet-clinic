package com.kkukielka.petclinic.repositories;

import com.kkukielka.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
