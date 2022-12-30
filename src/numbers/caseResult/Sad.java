package numbers.caseResult;

public class Sad implements CaseResult{
    @Override
    public boolean result(long nextInteger) {
        return !new Happy().result(nextInteger);
    }
}
