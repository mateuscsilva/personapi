package one.digitalinnovation.personapi.service;

import lombok.AllArgsConstructor;
import one.digitalinnovation.personapi.dto.request.DiseaseDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Disease;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.exception.DiseaseNotFoundExcepetion;
import one.digitalinnovation.personapi.exception.PersonNotFoundException;
import one.digitalinnovation.personapi.exception.PetNotFoundException;
import one.digitalinnovation.personapi.mapper.DiseaseMapper;
import one.digitalinnovation.personapi.repository.DiseaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DiseaseService {

    private DiseaseRepository diseaseRepository;

    private PetService petService;

    private final DiseaseMapper diseaseMapper = DiseaseMapper.INSTANCE;

    public MessageResponseDTO createDisease(DiseaseDTO diseaseDTO){
        Disease diseaseToSave = diseaseMapper.toModel(diseaseDTO);
        Disease savedDisease = diseaseRepository.save(diseaseToSave);

        return createMessageResponse(savedDisease.getId(), "Created disease with ID");
    }

    public List<DiseaseDTO> listAll() {
        List<Disease> diseases = diseaseRepository.findAll();
        return diseases.stream()
                .map(diseaseMapper::toDTO)
                .collect(Collectors.toList());
    }

    public DiseaseDTO findById(Long id) throws DiseaseNotFoundExcepetion {
        Disease disease = verifyIfExists(id);
        return diseaseMapper.toDTO(disease);
    }

    public void deleteById(Long id) throws DiseaseNotFoundExcepetion {
        Disease disease = verifyIfExists(id);
        diseaseRepository.deleteById(id);
    }

    public MessageResponseDTO updateById(Long id, DiseaseDTO diseaseDTO) throws DiseaseNotFoundExcepetion, PetNotFoundException {
        verifyIfExists(id);
        petService.findById(id);
        Disease diseaseToUpdate = diseaseMapper.toModel(diseaseDTO);
        Disease updatedDisease = diseaseRepository.save(diseaseToUpdate);

        return createMessageResponse(id, "Disease updated with ID");
    }

    private Disease verifyIfExists(Long id) throws DiseaseNotFoundExcepetion {
        return diseaseRepository.findById(id).orElseThrow(() -> new DiseaseNotFoundExcepetion(id));
    }

    private MessageResponseDTO createMessageResponse(Long id, String message){
        return MessageResponseDTO.builder()
                .message(message + " " + id)
                .build();
    }
}
