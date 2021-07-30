package one.digitalinnovation.personapi.service;

import one.digitalinnovation.personapi.builder.PetDTOBuilder;
import one.digitalinnovation.personapi.dto.request.PetDTO;
import one.digitalinnovation.personapi.entity.Pet;
import one.digitalinnovation.personapi.exception.PetNotFoundException;
import one.digitalinnovation.personapi.mapper.PetMapper;
import one.digitalinnovation.personapi.repository.PetRepository;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PetServiceTest {

//    private static final long INVALID_PET_ID = 2L;
//
//    @Mock
//    private PetRepository petRepository;
//
//    private PetMapper petMapper = PetMapper.INSTANCE;
//
//    @InjectMocks
//    private PetService petService;
//
//    @Test
//    void whenValidPetIdInformedThenReturnAPet() throws PetNotFoundException {
//        PetDTO validPetDTO = PetDTOBuilder.builder().build().toPetDTO();
//        Pet validPet = petMapper.toModel(validPetDTO);
//
//        when(petRepository.findById(validPetDTO.getId())).thenReturn(Optional.of(validPet));
//
//        Pet foundedPetDTO = petService.findById(validPetDTO.getId());
//        assertThat(foundedPetDTO, is(equalTo(validPet)));
//    }
//
//    @Test
//    void whenInvalidPetIdInformedThenReturnAPet() {
//        when(petRepository.findById(INVALID_PET_ID)).thenReturn(Optional.empty());
//
//        assertThrows(PetNotFoundException.class, () -> petService.findById(INVALID_PET_ID));
//    }
}
