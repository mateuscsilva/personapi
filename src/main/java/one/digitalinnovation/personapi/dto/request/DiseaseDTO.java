package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.entity.Pet;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiseaseDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String name;

    @NotEmpty
    @Min(value = 1, message = "A complexidade mínima é 1")
    @Max(value = 5, message = "A complexidade máxima é 5")
    private int complexity;

    @NotEmpty
    @Min(value = 1, message = "A complexidade mínima é 1")
    @Max(value = 5, message = "A complexidade máxima é 5")
    private int infectiousnessDegree;

    @Valid
    private List<Pet> pets;
}
