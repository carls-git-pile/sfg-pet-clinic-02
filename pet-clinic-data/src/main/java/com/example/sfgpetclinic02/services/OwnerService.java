package com.example.sfgpetclinic02.services;

import com.example.sfgpetclinic02.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
