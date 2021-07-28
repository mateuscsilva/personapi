package one.digitalinnovation.personapi.builder;

import lombok.Builder;
import one.digitalinnovation.personapi.dto.request.AddressDTO;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.entity.Address;
import one.digitalinnovation.personapi.entity.Pet;
import one.digitalinnovation.personapi.entity.Phone;
import one.digitalinnovation.personapi.mapper.AddressMapper;
import one.digitalinnovation.personapi.mapper.PetMapper;
import one.digitalinnovation.personapi.mapper.PhoneMapper;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.Collections;
import java.util.List;

@Builder
public class PersonDTOBuilder {

    private PhoneMapper phoneMapper = PhoneMapper.INSTANCE;
    private AddressMapper addressMapper = AddressMapper.INSTANCE;
    private PetMapper petMapper = PetMapper.INSTANCE;

    @Builder.Default
    private long id = 1L;

    @Builder.Default
    private String firstName = "Rodrigo";

    @Builder.Default
    private String lastName = "Peleias";

    @Builder.Default
    private String cpf = "369.333.878-79";

    @Builder.Default
    private String birthDate = "04-04-2010";

    @Builder.Default
    private List<Phone> phones = Collections.singletonList(phoneMapper
            .toModel(PhoneDTOBuilder.builder().build().toPhoneDTO()));

    @Builder.Default
    private List<Address> addresses = Collections.singletonList(addressMapper
            .toModel(AddressDTOBuilder.builder().build().toAddressDTO()));

    @Builder.Default
    private List<Pet> pets = Collections.singletonList(petMapper
            .toModel(PetDTOBuilder.builder().build().toPetDTO()));

    public PersonDTO toPersonDTO(){
        return new PersonDTO(id,
                firstName,
                lastName,
                cpf,
                birthDate,
                phones,
                addresses,
                pets);
    }

}
