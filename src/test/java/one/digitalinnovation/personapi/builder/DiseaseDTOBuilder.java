package one.digitalinnovation.personapi.builder;

import lombok.Builder;
import one.digitalinnovation.personapi.dto.request.DiseaseDTO;
import one.digitalinnovation.personapi.entity.Pet;
import one.digitalinnovation.personapi.mapper.PetMapper;
import java.util.Collections;
import java.util.List;

@Builder
public class DiseaseDTOBuilder {

    private PetMapper petMapper = PetMapper.INSTANCE;

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Doença";

    @Builder.Default
    private int complexity = 3;

    @Builder.Default
    private int infectiousnessDegree = 2;

    @Builder.Default
    private List<Pet> pets =
            Collections.singletonList(petMapper.
                    toModel(PetDTOBuilder.builder().build().toPetDTO()));

    public DiseaseDTO toDiseaseDTO(){
        return new DiseaseDTO(id,
                name,
                complexity,
                infectiousnessDegree,
                pets);
    }
}
