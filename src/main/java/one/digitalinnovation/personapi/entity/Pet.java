package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.FurColor;
import one.digitalinnovation.personapi.enums.SexType;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String petIdentifier;

    @Column(nullable = false)
    private String petName;

    @Column(nullable = false)
    private String breed;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private FurColor furColor;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private SexType sexType;

}
