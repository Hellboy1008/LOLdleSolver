package enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Gender {
    MALE, FEMALE, OTHER;
}
