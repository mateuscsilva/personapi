package one.digitalinnovation.personapi.mapper;

import one.digitalinnovation.personapi.dto.request.PetDTO;
import one.digitalinnovation.personapi.entity.Pet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PetMapper {

    PetMapper INSTANCE = Mappers.getMapper(PetMapper.class);

    Pet toModel(PetDTO petDTO);

    PetDTO toDTO(Pet pet);
}
