package com.example.sfgpetclinic02.repositories;

import com.example.sfgpetclinic02.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
