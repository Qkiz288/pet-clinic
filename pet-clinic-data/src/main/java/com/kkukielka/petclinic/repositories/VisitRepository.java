package com.kkukielka.petclinic.repositories;

import com.kkukielka.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
