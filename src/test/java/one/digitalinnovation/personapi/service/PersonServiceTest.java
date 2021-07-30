package one.digitalinnovation.personapi.service;

import one.digitalinnovation.personapi.builder.PersonDTOBuilder;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.mapper.PersonMapper;
import one.digitalinnovation.personapi.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
//
//    private PersonMapper personMapper = PersonMapper.INSTANCE;
//
//    @Mock
//    private PersonRepository personRepository;
//
//    @InjectMocks
//    private PersonService personService;
//
//    @Test
//    void whenGivenPersonDTOThenReturnSavedMessage() {
//        PersonDTO expectedPersonDTO = PersonDTOBuilder.builder().build().toPersonDTO();
//        Person expectedSavedPerson = personMapper.toModel(expectedPersonDTO);
//
//        when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);
//
//        MessageResponseDTO expectedSuccessMessage = createExpectedMessageResponse(expectedSavedPerson.getId());
//        MessageResponseDTO successMessage = personService.createPerson(expectedPersonDTO);
//
//        assertEquals(expectedSuccessMessage, successMessage);
//    }
//
//
//
//
//    private MessageResponseDTO createExpectedMessageResponse(Long id) {
//        return MessageResponseDTO
//                .builder()
//                .message("Created person with ID " + id)
//                .build();
//    }

}
