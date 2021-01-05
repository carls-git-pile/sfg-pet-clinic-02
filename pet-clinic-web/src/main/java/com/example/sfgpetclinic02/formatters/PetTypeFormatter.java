package com.example.sfgpetclinic02.formatters;

import com.example.sfgpetclinic02.model.PetType;
import com.example.sfgpetclinic02.services.PetTypeService;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

@Component
public class PetTypeFormatter implements Formatter<PetType> {

    private final PetTypeService petTypeService;

    public PetTypeFormatter(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    @Override
    public PetType parse(String petTypeString, Locale locale) throws ParseException {
        Collection<PetType> petTypes = petTypeService.findAll();

        for (PetType petType : petTypes) {
            if (petTypeString.toLowerCase().equals(petType.getName().toLowerCase())) {
                return petType;
            }
        }

        throw new ParseException("Pet Type not found: " + petTypeString, 0);
    }

    @Override
    public String print(PetType petType, Locale locale) {
        return petType.getName();
    }
}
