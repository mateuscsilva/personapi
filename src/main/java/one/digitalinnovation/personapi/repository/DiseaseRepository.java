package one.digitalinnovation.personapi.repository;

import one.digitalinnovation.personapi.entity.Disease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiseaseRepository extends JpaRepository<Disease, Long> {
}
