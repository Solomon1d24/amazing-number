package numbers.caseType;

import numbers.caseResult.*;

public enum CaseType {
    EVEN(new Even()),
    ODD(new Odd()),
    BUZZ(new Buzz()),
    DUCK(new Duck()),
    PALINDROMIC(new Palindromic()),
    GAPFUL(new Gapful()),
    SPY(new Spy()),
    SQUARE(new Square()),
    SUNNY(new Sunny()),
    JUMPING(new Jumping()),
    HAPPY(new Happy()),
    SAD(new Sad());


    private final CaseResult caseResult;

    CaseType(CaseResult caseResult) {
        this.caseResult = caseResult;
    }

    public CaseResult getCaseResult() {
        return caseResult;
    }
}
