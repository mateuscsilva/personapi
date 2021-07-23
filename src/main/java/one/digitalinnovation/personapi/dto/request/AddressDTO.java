package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

    private Long id;

    @NotEmpty
    @Size(min = 8, max = 8)
    private String cep;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String neighborhood;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String street;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String building;

    @NotEmpty
    private int buildingNumber;

    private int apartmentNumber;
}
