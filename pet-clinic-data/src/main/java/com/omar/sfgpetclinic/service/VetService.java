package com.omar.sfgpetclinic.service;

import com.omar.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vets);
    Set<Vet> findAll();
}
