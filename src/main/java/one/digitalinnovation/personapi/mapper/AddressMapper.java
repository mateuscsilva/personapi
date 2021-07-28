package one.digitalinnovation.personapi.mapper;

import one.digitalinnovation.personapi.dto.request.AddressDTO;
import one.digitalinnovation.personapi.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address toModel(AddressDTO addressDTO);

    AddressDTO toDTO(Address address);
}
