package noonghod.study.junit.matching;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Criterion {

    private Weight weight;
    private Answer answer;

    @Setter
    private int score;

    public Criterion(Answer answer, Weight weight) {
        this.answer = answer;
        this.weight = weight;
    }

}
