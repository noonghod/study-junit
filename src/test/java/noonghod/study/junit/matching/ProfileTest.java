package noonghod.study.junit.matching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfileTest {

    private Profile profile;
    private BooleanQuestion question;
    private Criteria criteria;

    @BeforeEach
    public void create() {
        profile = new Profile("Bull Hockey, Inc.");
        question = new BooleanQuestion(1, "Got bonuses?");
        criteria = new Criteria();
    }

    @Test
    public void matchAnswersFalseWhenMustMatchCriteriaNotMet() {
        profile.add(new Answer(question, Bool.FALSE.getValue()));
        criteria.add(
                new Criterion(new Answer(question, Bool.TRUE.getValue()), Weight.MUST_MATCH));

        boolean matches = profile.matches(criteria);

        assertFalse(matches);
    }

    @Test
    public void matchAnswersTrueForAnyDontCareCriteria() {
        profile.add(new Answer(question, Bool.FALSE.getValue()));
        criteria.add(
                new Criterion(new Answer(question, Bool.TRUE.getValue()), Weight.DONT_CARE));

        boolean matches = profile.matches(criteria);

        assertTrue(matches);
    }

}