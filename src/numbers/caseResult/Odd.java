package numbers.caseResult;

public class Odd implements CaseResult {
    @Override
    public boolean result(long nextInteger) {
        return !new Even().result(nextInteger);
    }
}
