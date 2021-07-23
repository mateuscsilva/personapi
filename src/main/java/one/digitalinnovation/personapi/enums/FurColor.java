package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FurColor {

    BLACK("Black"),
    WHITE("White"),
    BROWN("Brown"),
    YELLOW("Yellow"),
    GOLD("Gold"),
    RED("Red"),
    MOTTLED("mottled"),
    CREAM("Cream");

    private final String description;
}
