package com.example.sfgpetclinic02.services;

import com.example.sfgpetclinic02.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
