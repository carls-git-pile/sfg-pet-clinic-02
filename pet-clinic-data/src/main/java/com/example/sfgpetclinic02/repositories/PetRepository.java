package com.example.sfgpetclinic02.repositories;

import com.example.sfgpetclinic02.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
