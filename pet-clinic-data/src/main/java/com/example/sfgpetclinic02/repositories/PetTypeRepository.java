package com.example.sfgpetclinic02.repositories;

import com.example.sfgpetclinic02.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
