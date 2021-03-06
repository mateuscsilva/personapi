package one.digitalinnovation.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DiseaseNotFoundExcepetion extends Exception {
    public DiseaseNotFoundExcepetion(Long id){ super("Disease not found with id " + id); }
}
