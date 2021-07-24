package one.digitalinnovation.personapi.controller;

import lombok.AllArgsConstructor;
import one.digitalinnovation.personapi.dto.request.DiseaseDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.exception.DiseaseNotFoundExcepetion;
import one.digitalinnovation.personapi.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/diseases")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DiseaseController {

    private DiseaseService diseaseService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createDisease(@RequestBody @Valid DiseaseDTO diseaseDTO){
        return diseaseService.createDisease(diseaseDTO);
    }

    @GetMapping
    public List<DiseaseDTO> listAll(){ return diseaseService.listAll(); }

    @GetMapping("/{id}")
    public DiseaseDTO findById(@PathVariable Long id) throws DiseaseNotFoundExcepetion {
        return diseaseService.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(Long id) throws DiseaseNotFoundExcepetion {
        diseaseService.deleteById(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Valid DiseaseDTO diseaseDTO)
            throws DiseaseNotFoundExcepetion {
        return diseaseService.updateById(id, diseaseDTO);
    }
}
