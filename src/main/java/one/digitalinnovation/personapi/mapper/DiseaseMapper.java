package one.digitalinnovation.personapi.mapper;

import one.digitalinnovation.personapi.dto.request.DiseaseDTO;
import one.digitalinnovation.personapi.entity.Disease;
import one.digitalinnovation.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DiseaseMapper {

    DiseaseMapper INSTANCE = Mappers.getMapper(DiseaseMapper.class);

    Disease toModel(DiseaseDTO diseaseDTO);

    DiseaseDTO toDTO(Disease disease);
}

