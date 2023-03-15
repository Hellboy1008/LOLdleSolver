package enums;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum Champions {

    AATROX("Aatrox", "Male", null, null, "", "", null, 2013);

    private final String championName;
    private final String gender;
    private final List<String> positions;
    private final List<String> species;
    private final String resource;
    private final String rangeType;
    private final List<String> regions;
    private final int releaseYear;

}
