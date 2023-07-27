package com.lilirocha.model;

import java.time.LocalDate;

public class Pet {
    private PetType petType;
    private com.lilirocha.model.Owner owner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public com.lilirocha.model.Owner getOwner() {
        return owner;
    }

    public void setOwner(com.lilirocha.model.Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
