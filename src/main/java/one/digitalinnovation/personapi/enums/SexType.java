package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SexType {

    MALE("Male"),
    FEMALE("Female");

    private final String description;
}
