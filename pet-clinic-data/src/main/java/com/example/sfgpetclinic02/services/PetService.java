package com.example.sfgpetclinic02.services;

import com.example.sfgpetclinic02.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
