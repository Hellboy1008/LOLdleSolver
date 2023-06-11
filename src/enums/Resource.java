package enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Resource {
    BLOODTHIRST, COURAGE, ENERGY, FEROCITY, FLOW, FURY, GRIT, HEALTH_COSTS,
    HEAT, MANA, MANALESS, RAGE, SHIELD;
}
