package one.digitalinnovation.personapi.builder;

import lombok.Builder;
import one.digitalinnovation.personapi.dto.request.AddressDTO;

@Builder
public class AddressDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String cep = "40265020";

    @Builder.Default
    private String neighborhood = "Bairro teste";

    @Builder.Default
    private String street = "Rua teste";

    @Builder.Default
    private String building = "Predio teste";

    @Builder.Default
    private int buildingNumber = 1;

    @Builder.Default
    private int apartmentNumber = 1;

    public AddressDTO toAddressDTO(){
        return new AddressDTO(id,
                cep,
                neighborhood,
                street,
                building,
                buildingNumber,
                apartmentNumber);
    }
}
