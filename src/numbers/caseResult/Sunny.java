package numbers.caseResult;

public class Sunny implements CaseResult {
    @Override
    public boolean result(long nextInteger) {
        return new Square().result(nextInteger + 1);
    }
}
