package numbers.caseResult;

public class Even implements CaseResult {
    public boolean result(long nextInteger) {
        return nextInteger % 2 == 0;
    }

}
