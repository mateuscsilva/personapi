package one.digitalinnovation.personapi.service;

import one.digitalinnovation.personapi.entity.Pet;
import one.digitalinnovation.personapi.exception.PetNotFoundException;
import one.digitalinnovation.personapi.repository.PetRepository;

public class PetService {

    private PetRepository petRepository;

    public Pet findById(Long id) throws PetNotFoundException {
        return petRepository.findById(id).orElseThrow(() -> new PetNotFoundException(id));
    }
}
