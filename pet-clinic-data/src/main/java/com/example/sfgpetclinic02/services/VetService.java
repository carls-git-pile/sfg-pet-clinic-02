package com.example.sfgpetclinic02.services;

import com.example.sfgpetclinic02.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
