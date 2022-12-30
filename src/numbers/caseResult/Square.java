package numbers.caseResult;

public class Square implements CaseResult {
    public boolean result(long nextInteger) {
        double squareResult = Math.sqrt(nextInteger);
        return squareResult % 1 == 0;
    }
}
