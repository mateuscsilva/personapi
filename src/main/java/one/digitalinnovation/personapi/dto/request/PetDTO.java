package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.FurColor;
import one.digitalinnovation.personapi.enums.SexType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PetDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String petIdentifier;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String petName;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String breed;

    @NotEmpty
    @Enumerated(EnumType.STRING)
    private FurColor furColor;

    @NotEmpty
    @Enumerated(EnumType.STRING)
    private SexType sexType;

    @NotEmpty
    private LocalDate birthDay;
}
