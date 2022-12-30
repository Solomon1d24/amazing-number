package numbers.caseResult;

public class Buzz implements CaseResult {

    public boolean result(long nextInteger) {
        if (nextInteger % 7 == 0 && nextInteger % 10 == 7) {
            return true;
        } else if (nextInteger % 7 == 0) {
            return true;
        } else return nextInteger % 10 == 7;
    }

}
