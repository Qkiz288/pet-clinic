package com.kkukielka.petclinic.repositories;

import com.kkukielka.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
