package enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Position {
    TOP, JUNGLE, MIDDLE, BOTTOM, SUPPORT;
}
