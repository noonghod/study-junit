package noonghod.study.junit.matching;

public enum Weight {

    MUST_MATCH(Integer.MAX_VALUE),
    VERY_IMPORTANT(5000),
    IMPORTANT(1000),
    WOULD_PREFER(100),
    DONT_CARE(0);

    private int value;

    Weight(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
