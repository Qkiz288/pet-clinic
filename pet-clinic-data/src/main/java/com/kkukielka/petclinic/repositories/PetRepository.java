package com.kkukielka.petclinic.repositories;

import com.kkukielka.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
