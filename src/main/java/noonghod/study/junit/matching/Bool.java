package noonghod.study.junit.matching;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Bool {

    FALSE(0),
    TRUE(1);

    public static final int FALSE_VALUE = 0;
    public static final int TRUE_VALUE = 1;

    private int value;
}
