package com.kkukielka.petclinic.repositories;

import com.kkukielka.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
